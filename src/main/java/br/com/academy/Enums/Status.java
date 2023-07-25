package br.com.academy.Enums;

public enum Status {
    ATIVO("Ativo"), INATIVOS("Inativos"), TRANCADO("Trancado"), CANCELADO("Cancelado");

    private String status;

    Status(String status) {
        this.status = status;
    }
}
