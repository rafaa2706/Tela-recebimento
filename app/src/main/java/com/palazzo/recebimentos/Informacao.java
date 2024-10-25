package com.palazzo.recebimentos;

public class Informacao {

    private String fornecedor;

    private int lote;
    private String dataEntrega;
    private Boolean status;

    public Informacao(String fornecedor, int lote, String dataEntrega, Boolean status) {
        this.fornecedor = fornecedor;
        this.lote = lote;
        this.dataEntrega = dataEntrega;
        this.status = status;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
