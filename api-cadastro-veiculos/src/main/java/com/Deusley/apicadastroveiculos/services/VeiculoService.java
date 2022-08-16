package com.Deusley.apicadastroveiculos.services;

import com.Deusley.apicadastroveiculos.Repository.VeiculoRepository;
import com.Deusley.apicadastroveiculos.domain.Veiculo;
import com.Deusley.apicadastroveiculos.services.exceptions.ObjctNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository rep;

    public Veiculo find(Integer id) {
        return rep.findById(id)
                .orElseThrow(() -> new ObjctNotFoundException(" Veiculo - ID: " + id + ", não encontrado!"));


    }


}
