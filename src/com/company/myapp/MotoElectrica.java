package com.company.myapp;

import java.time.LocalDate;
import java.util.List;

public class MotoElectrica extends Automotor{


    public MotoElectrica(String clave, LocalDate fechaAlta) {
        super(clave, fechaAlta);
    }

    public MotoElectrica(String clave, LocalDate fechaAlta, String marca, String modelo, String color, String uso) {
        super(clave, fechaAlta, marca, modelo, color, uso);
    }


}
