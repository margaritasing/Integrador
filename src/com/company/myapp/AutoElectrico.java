package com.company.myapp;

import java.time.LocalDate;

public class AutoElectrico extends Automotor {


    public AutoElectrico(String clave, LocalDate fechaAlta) {
        super(clave, fechaAlta);
    }

    public AutoElectrico(String clave, LocalDate fechaAlta, String marca, String modelo, String color, String uso) {
        super(clave, fechaAlta, marca, modelo, color, uso);
    }
}
