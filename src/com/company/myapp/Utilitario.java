package com.company.myapp;

import java.time.LocalDate;
import java.util.List;

public class Utilitario extends Automotor implements Patente {


    public Utilitario(String tipo, String modelo, LocalDate fechaDeAlta, Uso usos) {
        super(tipo, modelo, fechaDeAlta, usos);
    }
}