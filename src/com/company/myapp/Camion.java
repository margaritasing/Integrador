package com.company.myapp;

import java.time.LocalDate;
import java.util.List;

public class Camion extends Automotor implements Patente {


    public Camion(String tipo, String modelo, LocalDate fechaDeAlta, Uso usos) {
        super(tipo, modelo, fechaDeAlta, usos);
    }
}
