package com.company.myapp;

import java.time.LocalDate;

public class Moto extends Automotor {


    public Moto(String clave, LocalDate fechaAlta) {
        super(clave, fechaAlta);
    }

    public Moto(String clave, LocalDate fechaAlta, String marca, String modelo, String color, String uso) {
        super(clave, fechaAlta, marca, modelo, color, uso);
    }
}
