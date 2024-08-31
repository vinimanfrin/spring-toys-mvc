package com.vinimanfrin.toys_fiap.models;

import com.vinimanfrin.toys_fiap.models.enums.ClassificacaoBrinquedo;
import com.vinimanfrin.toys_fiap.models.enums.TipoBrinquedo;
import com.vinimanfrin.toys_fiap.utils.Constants;
import com.vinimanfrin.toys_fiap.utils.Conversor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mvc-brinquedos")
@AllArgsConstructor
@NoArgsConstructor
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer tipo;
    private Integer classificacao;
    private Long tamanho;
    private Long preco;

    public Brinquedo(BrinquedoCreateDTO brinquedoCreateDTO) {
        this.id = brinquedoCreateDTO.getId();
        this.nome = brinquedoCreateDTO.getNome();
        this.tipo = TipoBrinquedo.toEnum(brinquedoCreateDTO.getTipo()).getCode();
        this.classificacao = TipoBrinquedo.toEnum(brinquedoCreateDTO.getClassificacao()).getCode();
        this.tamanho = Conversor.double2Long(brinquedoCreateDTO.getTamanho());
        this.preco = Conversor.double2Long(brinquedoCreateDTO.getPreco());
    }

    public TipoBrinquedo getTipo() {
        return TipoBrinquedo.toEnum(tipo);
    }

    public void setTipo(TipoBrinquedo tipo) {
        this.tipo = tipo.getCode();
    }

    public ClassificacaoBrinquedo getClassificacao() {
        return ClassificacaoBrinquedo.toEnum(classificacao);
    }

    public void setClassificacao(ClassificacaoBrinquedo classificacao) {
        this.classificacao = classificacao.getCode();
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

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public Long getTamanho() {
        return tamanho;
    }

    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }

    public String getValueFormated(){
        return "R$"+Constants.DECIMAL_FORMAT.format(Conversor.long2Double(preco));
    }

    public String getTamanhoFormated(){
        return tamanho+"cm";
    }
}
