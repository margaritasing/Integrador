package com.company.myapp;

import java.time.LocalDate;
import java.util.List;

public class Moto extends Automotor implements Patente{


    public Moto(String tipo, String modelo, LocalDate fechaDeAlta, Uso usos) {
        super(tipo, modelo, fechaDeAlta, usos);
    }
}
