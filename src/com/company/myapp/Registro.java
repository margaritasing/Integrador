package com.company.myapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registro implements Patente {
    private Integer seccion;
    private List<Automotor> automotores = new ArrayList<>();


    public void listarAutomotor(){
       for(Automotor a : automotores)
           System.out.println(a);
   }


    public Registro(int i) {
        this.seccion = seccion;
    }


    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }


    public List<Automotor> getAutomotores() {
        return automotores;
    }

    public void setAutomotores(List<Automotor> automotores) {
        this.automotores = automotores;
    }



    @Override
    public String toString() {
        return "Registro{" +
                "seccion=" + seccion +
                ", automotores=" + automotores +

                '}';
    }
}
