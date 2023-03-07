package com.dio.desafio.dominio;

public abstract class Content {

    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String desc;

    public abstract double calcularXp();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
