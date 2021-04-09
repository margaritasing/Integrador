package com.company.myapp;

public class Persona {
    private String nombre;
    private String dni;
    private String direccion;
    private String tipoDeVehiculo;

    public Persona(String nombre, String dni, String direccion, String tipoDeVehiculo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.tipoDeVehiculo = tipoDeVehiculo;
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
}
