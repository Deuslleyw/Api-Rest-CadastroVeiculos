package com.Deusley.apicadastroveiculos.resources;

import com.Deusley.apicadastroveiculos.domain.Veiculo;
import com.Deusley.apicadastroveiculos.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

    @Autowired
    private VeiculoService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Veiculo obj = service.find(id);
        return ResponseEntity.ok().body(obj);


    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<void> insert( Veiculo obj){
        obj = service.insert(obj);
     URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
     return  ResponseEntity.created(uri).build();
    }

    public ResponseEntity<page<Veiculo>> findPageResponseEntity(
            @RequestParam(value="page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "instante") String orderBy;
            @RequestParam(value = "direction", defaultValue = "DESC") String direction){

        page<Veiculo> lista = service.findPage(page, linesPerPage, ordeBy, direction);
        return ResponseEntity.ok().body(lista);
    }

    )


}
