package com.company.myapp;

import java.time.LocalDate;

public class Patente {
    private String clave;
    private LocalDate fechaAlta;

    public Patente(String clave, LocalDate fechaAlta) {
        this.clave = clave;
        this.fechaAlta = fechaAlta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Patente{" +
                "clave='" + clave + '\'' +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
