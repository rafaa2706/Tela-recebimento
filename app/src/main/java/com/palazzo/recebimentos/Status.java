package com.palazzo.recebimentos;

public class Status {

    private String area;
    private double porcentagem;


    public Status(String area, double porcentagem) {
        this.area = area;
        this.porcentagem = porcentagem;

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

//
}
