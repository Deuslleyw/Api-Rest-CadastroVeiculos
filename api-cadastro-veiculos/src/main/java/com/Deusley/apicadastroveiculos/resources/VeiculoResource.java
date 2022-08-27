package com.Deusley.apicadastroveiculos.resources;

import com.Deusley.apicadastroveiculos.DTO.VeiculoDTO;
import com.Deusley.apicadastroveiculos.DTO.VeiculoNewDTO;
import com.Deusley.apicadastroveiculos.DTO.VeiculoResponseDTO;

import com.Deusley.apicadastroveiculos.Repository.VeiculoRepository;
import com.Deusley.apicadastroveiculos.domain.Veiculo;
import com.Deusley.apicadastroveiculos.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.Cacheable;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

    @Autowired
    private VeiculoService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Veiculo obj = service.find(id);
        return ResponseEntity.ok().body(obj);

    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody VeiculoNewDTO objDTO) {
        Veiculo obj = service.fromDTO(objDTO);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody VeiculoDTO objDTO, @PathVariable Integer id) {
        Veiculo obj = service.fromDTO(objDTO);
        obj.setId(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }


    @GetMapping
    public ResponseEntity<List<VeiculoResponseDTO>> findAll() {
        List<Veiculo> lista = service.findAll();
        List<VeiculoResponseDTO> listDTO = lista.stream().map(obj -> new VeiculoResponseDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);

          }

        @RequestMapping( value = "/page" ,method=RequestMethod.GET)
        public ResponseEntity<Page<?>> findPage(
            @RequestParam(value="page", defaultValue = "0")	Integer page,
            @RequestParam(value="linesPerPage", defaultValue = "2")Integer linesPerPage,
            @RequestParam(value="orderBy", defaultValue = "placa")	String orderBy,
            @RequestParam(value="direction", defaultValue = "ASC")	String direction) {

        Page <Veiculo> lista = service.findPage(page, linesPerPage, orderBy, direction);
        Page<VeiculoResponseDTO> responseMap = lista.map(obj -> new VeiculoResponseDTO(obj));
        return ResponseEntity.ok().body(responseMap);
    }


}