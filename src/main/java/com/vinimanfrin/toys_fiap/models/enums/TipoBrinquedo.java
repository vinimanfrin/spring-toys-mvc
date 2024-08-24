package com.vinimanfrin.toys_fiap.models.enums;

public enum TipoBrinquedo {
    PELUCIA(1,"Brinquedo de pelúcia"),
    JOGO(2,"Jogo para brincar"),
    BONECA(3,"Boneca para brincar");

    private Integer code;
    private String description;

    private TipoBrinquedo(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public static TipoBrinquedo toEnum(Integer code) {
        if (code == null)
            return null;

        for (TipoBrinquedo x : TipoBrinquedo.values())
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
