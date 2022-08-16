package com.Deusley.apicadastroveiculos.domain;

import com.Deusley.apicadastroveiculos.enums.EstadoVeiculo;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Placa;
    private String nomeDoVeiculo;
    private String marca;
    private Integer anoModelo;
    private Integer anoFabricacao;
    private String modelo;
    private String cor;
    private String fabricante;
    private EstadoVeiculo estadoVeiculo;


    public Veiculo() {}

    public Veiculo(Integer id, String placa, String nomeDoVeiculo, String marca, Integer anoModelo, Integer anoFabricacao, String modelo, String cor, String fabricante, EstadoVeiculo estadoVeiculo) {
        this.id = id;
        this.Placa = placa;
        this.nomeDoVeiculo = nomeDoVeiculo;
        this.marca = marca;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
        this.estadoVeiculo = estadoVeiculo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(id, veiculo.id) && Objects.equals(Placa, veiculo.Placa) && estadoVeiculo == veiculo.estadoVeiculo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Placa, estadoVeiculo);
    }
}
