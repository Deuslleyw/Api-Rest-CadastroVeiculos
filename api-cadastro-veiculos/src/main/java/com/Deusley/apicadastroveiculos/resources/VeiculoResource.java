package com.Deusley.apicadastroveiculos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResource {

    @RequestMapping(method = RequestMethod.GET)
    public String testar(){
        return "Teste Rest ok! ";
    }

}
