package com.company.myapp;

public class Autorizado extends Persona {

    public Autorizado(String nombre, String dni, String direccion, String tipoDeVehiculo) {
        super(nombre, dni, direccion, tipoDeVehiculo);
    }



    public Autorizado(String nombre) {
        super(nombre);
    }
}
