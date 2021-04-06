package com.company.myapp;

import java.time.LocalDate;
import java.util.List;

public class Colectivo extends Automotor implements Patente{


    public Colectivo(String tipo, String modelo, LocalDate fechaDeAlta, Uso usos) {
        super(tipo, modelo, fechaDeAlta, usos);
    }
}

