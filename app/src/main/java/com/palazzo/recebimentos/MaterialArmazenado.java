package com.palazzo.recebimentos;

public class MaterialArmazenado {

    private String name;
    private int estoque;
    private double porcentagem;

    private String imagemUrl;

    public MaterialArmazenado(String name, int estoque, double porcentagem, String imagemUrl) {
        this.name = name;
        this.estoque = estoque;
        this.porcentagem = porcentagem;
        this.imagemUrl = imagemUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }


}
