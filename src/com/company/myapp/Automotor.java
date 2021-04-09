package com.company.myapp;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Automotor implements Patente{

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




    public void agregarPropietario(String nombre, String dni, String direccion, String tipoDeVehiculos) {
        propietarios.add(new Propietario(nombre, dni, direccion,tipoDeVehiculos));
    }

    public void agregarAutorizados(String nombre) {
      autorizados.add(new Autorizado(nombre));
    }


    public void reemplazarPropietario(int indice, Propietario propietario){
        LocalDate fechaDeAlta = LocalDate.of(2015,12,25);
        LocalDate fechaHoy = LocalDate.now();
        long dias = DAYS.between(fechaDeAlta, fechaHoy);
        if (dias < 365)
            System.out.println("No se puede cambiar el propietario");
        else
        propietarios.set(indice, propietario);
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public List<Autorizado> getAutorizados() {
        return autorizados;
    }


    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public void setAutorizados(List<Autorizado> autorizados) {
        this.autorizados = autorizados;
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


    public List<Propietario> setPropietarios() {


        return null;
    }
}





