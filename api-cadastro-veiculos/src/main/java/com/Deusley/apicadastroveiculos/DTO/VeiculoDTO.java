package com.Deusley.apicadastroveiculos.DTO;

import com.Deusley.apicadastroveiculos.domain.Veiculo;
import com.Deusley.apicadastroveiculos.enums.StatusDoVeiculo;

import java.io.Serializable;


public class VeiculoDTO implements Serializable {
    private static final long serialVersionUID = 42L;

    private Integer id;
    private String placa;
    private StatusDoVeiculo status;


    public VeiculoDTO () {}

    public VeiculoDTO (Veiculo obj) {
        id = obj.getId();
        placa = obj.getPlaca();
        status = obj.getStatus();

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public StatusDoVeiculo getStatus() {
        return status;
    }

    public void setStatus(StatusDoVeiculo status) {
        this.status = status;
    }
}