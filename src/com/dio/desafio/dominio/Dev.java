package com.dio.desafio.dominio;

import java.util.*;

public class Dev {

    private String nome;
    //SET É UMA LISTA DE CONTEUDOS UNICOS
    private Set<Content> conteudosInscritos = new LinkedHashSet<>();
    private Set<Content> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getContents());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Content> content = this.conteudosInscritos.stream().findFirst();

        if (content.isPresent()){
            this.conteudosConcluidos.add(content.get());
            this.conteudosInscritos.remove(content.get());
        }
        else {
            System.err.println("Voce não esta matriculado em nenhum conteudo.");
        }
    }

    public double calcularTotalXp(){

        return this.conteudosConcluidos.stream().mapToDouble(Content::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Content> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Content> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Content> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Content> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
