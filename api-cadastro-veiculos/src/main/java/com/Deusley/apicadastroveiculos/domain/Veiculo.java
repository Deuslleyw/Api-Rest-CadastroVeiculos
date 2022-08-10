package com.Deusley.apicadastroveiculos.domain;

import java.io.Serializable;
import java.util.Objects;

public class Veiculo implements Serializable {

    private String nomeDoVeiculo;
    private String placa;
    private String marca;
    private Integer anoModelo;
    private Integer anoFabricacao;
    private String modelo;
    private String cor;
    private String fabricante;


    public Veiculo(){}

    public Veiculo(String nomeDoVeiculo, String placa, String marca, Integer anoModelo, Integer anoFabricacao, String modelo, String cor, String fabricante) {
        this.nomeDoVeiculo = nomeDoVeiculo;
        this.placa = placa;
        this.marca = marca;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public String getNomeDoVeiculo() {
        return nomeDoVeiculo;
    }

    public void setNomeDoVeiculo(String nomeDoVeiculo) {
        this.nomeDoVeiculo = nomeDoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return placa.equals(veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }
}
