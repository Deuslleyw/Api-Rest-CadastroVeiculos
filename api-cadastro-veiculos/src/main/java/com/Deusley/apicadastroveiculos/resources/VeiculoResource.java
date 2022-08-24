package com.Deusley.apicadastroveiculos.resources;

import com.Deusley.apicadastroveiculos.DTO.VeiculoDTO;
import com.Deusley.apicadastroveiculos.domain.Veiculo;
import com.Deusley.apicadastroveiculos.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

    @Autowired
    private VeiculoService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Veiculo obj = service.find(id);
        return ResponseEntity.ok().body(obj);

    }

    //@RequestMapping(method=RequestMethod.POST)
    //public ResponseEntity<Void> insert(@RequestBody VeiculoNewDTO objDTO){
      //  Veiculo obj = service.fromDTO(objDTO);
       // obj = service.insert(obj);
        //URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        //return ResponseEntity.created(uri).build();

    //}

    @RequestMapping(value = "/{id}" , method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody VeiculoDTO objDTO, @PathVariable Integer id){
       Veiculo obj = service.fromDTO(objDTO);
        obj.setId(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }


    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<VeiculoDTO>> findAll() {
        List<Veiculo> lista = service.findAll();
        List<VeiculoDTO> listDTO = lista.stream().map(obj -> new VeiculoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @RequestMapping( value = "/page" ,method=RequestMethod.GET)
    public ResponseEntity<Page<VeiculoDTO>> findPage(
            @RequestParam(value="page", defaultValue = "0")	Integer page,
            @RequestParam(value="linesPerPage", defaultValue = "24")Integer linesPerPage,
            @RequestParam(value="orderBy", defaultValue = "placa")	String orderBy,
            @RequestParam(value="direction", defaultValue = "ASC")	String direction) {

        Page <Veiculo> lista = service.findPage(page, linesPerPage, orderBy, direction);
        Page<VeiculoDTO> listaDTO = lista.map(obj -> new VeiculoDTO(obj));
        return ResponseEntity.ok().body(listaDTO);
    }

}
