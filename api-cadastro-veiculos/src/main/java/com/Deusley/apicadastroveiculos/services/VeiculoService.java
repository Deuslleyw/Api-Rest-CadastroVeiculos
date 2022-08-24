package com.Deusley.apicadastroveiculos.services;

import com.Deusley.apicadastroveiculos.DTO.VeiculoDTO;
import com.Deusley.apicadastroveiculos.DTO.VeiculoNewDTO;
import com.Deusley.apicadastroveiculos.Repository.VeiculoRepository;
import com.Deusley.apicadastroveiculos.domain.Veiculo;
import com.Deusley.apicadastroveiculos.services.exceptions.ObjctNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository rep;

    public Veiculo find(Integer id) {
        return rep.findById(id)
                .orElseThrow(() -> new ObjctNotFoundException(" Veiculo - ID: " + id + ", não encontrado!"));


    }

    @Transactional
    public Veiculo insert(Veiculo obj) {
        obj.setId(null);
        return rep.save(obj);
    }

    public Veiculo update(Veiculo obj) {
        Veiculo newObj = find(obj.getId());
        updateVeic(newObj, obj);
        return rep.save(newObj);

    }

    public List<Veiculo> findAll() {
        return rep.findAll();
    }


    public Page<Veiculo> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return rep.findAll(pageRequest);
    }

    public Veiculo fromDTO(VeiculoDTO objDTO) {
        return new Veiculo(objDTO.getId(), objDTO.getPlaca(), null, null, null, null, null, null, null, null, objDTO.getStatus());
    }

    public Veiculo fromDTO(VeiculoNewDTO objDTO) {

        return new Veiculo(null, objDTO.getPlaca(), objDTO.getNomeDoVeiculo(), objDTO.getMarca(), objDTO.getAnoModelo(), objDTO.getAnoFabricacao(),
                objDTO.getModelo(), objDTO.getCor(), objDTO.getFabricante(), objDTO.getEstadoVeiculo(), objDTO.getStatus());

}

    private void updateVeic(Veiculo newObj, Veiculo obj) {
        newObj.setPlaca(obj.getPlaca());
        newObj.setStatus(obj.getStatus());

    }
}