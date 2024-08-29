package com.vinimanfrin.toys_fiap.models;

import com.vinimanfrin.toys_fiap.utils.Conversor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
public class BrinquedoCreateDTO {

    @NotNull
    private Long id;

    @NotBlank
    private String nome;

    @NotNull
    private Integer tipo;

    @NotNull
    private Integer classificacao;

    @NotNull
    @Min(value = 1)
    private Double tamanho;

    @NotNull
    @Min(value = 1)
    private Double preco;

    public BrinquedoCreateDTO(){
    }

    public BrinquedoCreateDTO(Brinquedo brinquedo) {
        this.id = brinquedo.getId();
        this.nome = brinquedo.getNome();
        this.tipo = brinquedo.getTipo().getCode();
        this.classificacao = brinquedo.getClassificacao().getCode();
        this.tamanho = Conversor.long2Double(brinquedo.getTamanho());
        this.preco = Conversor.long2Double(brinquedo.getPreco());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
