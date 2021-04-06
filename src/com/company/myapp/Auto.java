package com.company.myapp;

import java.time.LocalDate;

public class Auto extends Automotor implements Patente{


    public Auto(String tipo, String modelo, LocalDate fechaDeAlta, Uso usos) {
        super(tipo, modelo, fechaDeAlta, usos);
    }
}

