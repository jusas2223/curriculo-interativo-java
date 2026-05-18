package org.example.model;
import java.util.List;

public class Curriculo {
    private String nome;
    private String objetivo;
    private List<String> habilidades;
    private List<Experiencia> experiencias;
    private List<Formacao> formacoes;
    private List<Projeto> projetos;

    public String getNome() {
        return nome;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public List<Formacao> getFormacoes() {
        return formacoes;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }
}
