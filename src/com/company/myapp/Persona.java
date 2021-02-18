package com.company.myapp;

public class Persona {
    private String dueños;
    private String autorizados;
    private String dni;
    private String direccion;

    public Persona(String dueños, String autorizados, String dni, String direccion) {
        this.dueños = dueños;
        this.autorizados = autorizados;
        this.dni = dni;
        this.direccion = direccion;
    }




    public String getDueños() {
        return dueños;
    }

    public void setDueños(String dueños) {
        this.dueños = dueños;
    }

    public String getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(String autorizados) {
        this.autorizados = autorizados;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "propietarios='" + dueños + '\'' +
                ", autorizados='" + autorizados + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
