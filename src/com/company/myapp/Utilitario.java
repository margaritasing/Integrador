package com.company.myapp;

import java.time.LocalDate;
import java.util.List;

public class Utilitario extends Automotor {


    public Utilitario(String clave, LocalDate fechaAlta) {
        super(clave, fechaAlta);
    }

    public Utilitario(String clave, LocalDate fechaAlta, String marca, String modelo, String color, String uso) {
        super(clave, fechaAlta, marca, modelo, color, uso);
    }

}