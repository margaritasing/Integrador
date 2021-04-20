package com.company.myapp;

import java.util.ArrayList;
import java.util.List;

public class Persona {
   protected String nombre;
    private String dni;
    private String direccion;
    private String tipoDeVehiculo;
    private List<Propietario> propietarios = new ArrayList<>();

    public Persona(String nombre, String dni, String direccion, String tipoDeVehiculo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public Persona() {
        this.propietarios = new ArrayList<>();
    }

    public Persona(String nombre) {
        this.nombre= nombre;

    }


    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }


   /* public void remove(int cambiar) {

    }*/
}
