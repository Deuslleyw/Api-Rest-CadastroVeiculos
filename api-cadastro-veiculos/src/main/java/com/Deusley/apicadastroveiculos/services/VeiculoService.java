package com.Deusley.apicadastroveiculos.services;

import com.Deusley.apicadastroveiculos.Repository.VeiculoRepository;
import com.Deusley.apicadastroveiculos.domain.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository rep;

    public Optional<Veiculo> find (Integer id) {
        return rep.findById(id);


    }


}
