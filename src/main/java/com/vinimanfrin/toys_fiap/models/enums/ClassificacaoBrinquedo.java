package com.vinimanfrin.toys_fiap.models.enums;

public enum ClassificacaoBrinquedo {
    FUNCIONAL(1, "Brinquedo funcional"),
    EXPERIMENTAL(2, "Brinquedo experimental");

    private Integer code;
    private String description;

    private ClassificacaoBrinquedo(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public static ClassificacaoBrinquedo toEnum(Integer code) {
        if (code == null)
            return null;

        for (ClassificacaoBrinquedo x : ClassificacaoBrinquedo.values())
            if (code.equals(x.getCode()))
                return x;

        throw new IllegalArgumentException("Id inválido: " + code);
    }
    public Integer getCode() {
        return code;
    }

    public String getDescription(){
        return  description;
    }
}
