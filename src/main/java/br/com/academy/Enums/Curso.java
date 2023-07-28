package br.com.academy.Enums;

public enum Curso {
    ADMINISTRACAO("Administração"),
    INFORMATICA("Informática"),
    CONTABILIDADE("Contabilidade"),
    PROGRAMACAO("Programação");

    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }
}
