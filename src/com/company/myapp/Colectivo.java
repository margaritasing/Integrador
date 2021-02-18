package com.company.myapp;

import java.time.LocalDate;

public class Colectivo extends Automotor {


    public Colectivo(String clave, LocalDate fechaAlta) {
        super(clave, fechaAlta);
    }

    public Colectivo(String clave, LocalDate fechaAlta, String marca, String modelo, String color, String uso) {
        super(clave, fechaAlta, marca, modelo, color, uso);
    }
}

