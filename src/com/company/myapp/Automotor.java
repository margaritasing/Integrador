package com.company.myapp;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Automotor extends Patente{
    private String marca;
    private String modelo;
    private String color;
    private String uso;
    private List<Patente> patentes;


    public Automotor(String clave, LocalDate fechaAlta) {
        super(clave, fechaAlta);

    }

    public Automotor(String clave, LocalDate fechaAlta, String marca, String modelo, String color, String uso) {
        super(clave, fechaAlta);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.uso = uso;
        this.patentes = new ArrayList<>();

    }



    public void setPatentes(List<Patente> patentes) {
        this.patentes = patentes;
    }




    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "Automotor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", uso='" + uso + '\'' +
                '}';
    }


}





