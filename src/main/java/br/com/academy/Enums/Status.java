package br.com.academy.Enums;

public enum Status {
    ATIVO("Ativo"), INATIVOS("Inativos"), TRANCADO("Trancado"), CANCELADO("Cancelado");

    private String status;

    Status(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
