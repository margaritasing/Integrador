package com.company.myapp;

import java.time.LocalDate;
import java.util.List;

public class AutoElectrico extends Automotor implements Patente{


    public AutoElectrico(String tipo, String modelo, LocalDate fechaDeAlta, Uso usos) {
        super(tipo, modelo, fechaDeAlta, usos);
    }
}
