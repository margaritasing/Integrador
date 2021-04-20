package com.company.myapp;

public class Propietario extends Persona{




    public Propietario(String nombre, String dni, String direccion, String tipoDeVehiculo) {
        super(nombre, dni, direccion, tipoDeVehiculo);
    }


    public Propietario() {
        super();
    }

    public Propietario(String nombre) {
      this.nombre = nombre;
    }
}

