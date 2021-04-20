package com.company.myapp;

import java.time.LocalDate;

public class MotoElectrica extends Automotor implements Patente{

    public MotoElectrica(String tipo, String modelo, LocalDate fechaDeAlta, Uso usos) {
        super(tipo, modelo, fechaDeAlta, usos);
    }



}
