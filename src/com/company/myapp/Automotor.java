package com.company.myapp;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Automotor{

    private String tipo;
    private String modelo;
    private LocalDate fechaDeAlta;
    private Uso usos;
    private List<Propietario> propietarios = new ArrayList<>();
    private List<Autorizado> autorizados = new ArrayList<>();



    public Automotor(String tipo, String modelo, LocalDate fechaDeAlta, Uso usos) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.fechaDeAlta = fechaDeAlta;
        this.usos = usos;

    }

    public Automotor(List<Propietario> propietarios, List<Autorizado> autorizados) {
        this.propietarios = propietarios;
        this.autorizados = autorizados;

    }

    public Automotor() {

    }



    public void agregarPropietario(String nombre, String dni, String direccion, String tipoDeVehiculos) {
        propietarios.add(new Propietario(nombre, dni, direccion,tipoDeVehiculos));
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }


    @Override
    public String toString() {
        return "Automotor{" +
                "tipo='" + tipo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaDeAlta=" + fechaDeAlta +
                ", usos=" + usos +

                '}';
    }


}





