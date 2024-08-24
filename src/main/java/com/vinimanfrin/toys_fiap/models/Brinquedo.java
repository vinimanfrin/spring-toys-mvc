package com.vinimanfrin.toys_fiap.models;

import com.vinimanfrin.toys_fiap.models.enums.ClassificacaoBrinquedo;
import com.vinimanfrin.toys_fiap.models.enums.TipoBrinquedo;
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

}
