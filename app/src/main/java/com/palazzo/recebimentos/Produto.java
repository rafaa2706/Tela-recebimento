package com.palazzo.recebimentos;

public class Produto {

    private String name;
    private int lote;
    private int qtd;
    private String codigo;
    private String imagemUrl;

    public Produto(String name, String codigo, int lote, int qtd, String imagemUrl) {
        this.name = name;
        this.codigo = codigo;
        this.lote = lote;
        this.qtd = qtd;
        this.imagemUrl = imagemUrl;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
