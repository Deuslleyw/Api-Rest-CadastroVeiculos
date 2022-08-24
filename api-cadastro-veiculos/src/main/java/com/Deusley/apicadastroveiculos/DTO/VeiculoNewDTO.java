package com.Deusley.apicadastroveiculos.DTO;

import com.Deusley.apicadastroveiculos.enums.EstadoVeiculo;
import com.Deusley.apicadastroveiculos.enums.StatusDoVeiculo;

import java.io.Serializable;

public class VeiculoNewDTO implements Serializable {
    private static final long serialVersionUID = 42L;


    private Integer id;
    private String placa;
    private String nomeDoVeiculo;
    private String marca;
    private Integer anoModelo;
    private Integer anoFabricacao;
    private String modelo;
    private String cor;
    private String fabricante;
    private EstadoVeiculo estadoVeiculo;
    private StatusDoVeiculo status;


    public VeiculoNewDTO(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeDoVeiculo() {
        return nomeDoVeiculo;
    }

    public void setNomeDoVeiculo(String nomeDoVeiculo) {
        this.nomeDoVeiculo = nomeDoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public EstadoVeiculo getEstadoVeiculo() {
        return estadoVeiculo;
    }

    public void setEstadoVeiculo(EstadoVeiculo estadoVeiculo) {
        this.estadoVeiculo = estadoVeiculo;
    }

    public StatusDoVeiculo getStatus() {
        return status;
    }

    public void setStatus(StatusDoVeiculo status) {
        this.status = status;
    }
}
