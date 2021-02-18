package com.company.myapp;

import java.time.LocalDate;
import java.util.*;
//resol


public class Registro {
    private Integer seccion;

    public Registro(Integer seccion) {
        this.seccion = seccion;
    }


    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }


    @Override
    public String toString() {
        return "Registro{" +
                "seccion=" + seccion +
                '}';
    }


    public static void main(String[] args) {

        List<Registro> registros = new ArrayList<>();
        registros.add(new Registro(001));
        registros.add(new Registro(002));
        registros.add(new Registro(003));
        registros.add(new Registro(004));
        registros.add(new Registro(005));

        List<Persona> propietarios = new ArrayList<>();
        propietarios.add(new Persona("GABRIEL", "PEDRO", "123.365", "TEMPERLEY"));
        propietarios.add(new Persona("Pedro", "Juan", "417.147", "Santa Rosa"));
        propietarios.add(new Persona("Jose", "Alexander", "123.014", "San Jose"));
        propietarios.add(new Persona("Francisco", "Gabriel", "521.321", "Milagro Norte"));
        propietarios.add(new Persona("Alexander", "Jose", "127.971", "Bella Vista"));
        propietarios.add(new Persona("Richard", "Raul", "874.219", "El Gaitero"));

        Collections.sort(propietarios, new Comparator<Persona>() {
            public int compare(Persona obj1, Persona obj2) {
                return obj1.getDueños().compareTo(obj2.getDueños());
            }
        });

        for (int cont = 0; cont < propietarios.size(); cont++) {
            System.out.println("Propietarios de Camiones = " + propietarios.get(cont).getDueños());
        }
        System.out.println("=======================================");
        List<Automotor> automotores = new ArrayList<>();

        automotores.add(new Auto("Ade-214", LocalDate.of(2018, 5, 14), "FORD", "2019", "ROJO", "PARTICULAR"));
        automotores.add(new AutoElectrico("oiu-589", LocalDate.of(2019, 8, 17), "CHEBROLET", "2020", "AZUL", "PROFESIONAL"));
        automotores.add(new Camion("kjf-254", LocalDate.of(2016, 7, 25), "FIAT", "2015", "BLANCO", "PROFESIONAL"));
        automotores.add(new Moto("rtp-426", LocalDate.of(2019, 11, 16), "YAMAHA", "2016", "NEGRO", "PERSONAL"));
        automotores.add(new MotoElectrica("psr-893", LocalDate.of(2017, 11, 26), "HIUNDAY", "2018", "AMARILLO", "PROFESIONAL"));
        automotores.add(new Colectivo("bap-279", LocalDate.of(2019, 5, 3), "MERCEDES-VEN", "2017", "MARRON", "PROFESIONAL"));
        automotores.add(new Utilitario("hws-489", LocalDate.of(2016, 8, 11), "PEGEOUT", "2019", "BLANCO", "PROFESIONAL"));
        automotores.add(new Auto("Ade-214", LocalDate.of(2018, 5, 14), "FORD", "2019", "ROJO", "PARTICULAR"));
        automotores.add(new AutoElectrico("oiu-589", LocalDate.of(2019, 8, 17), "CHEBROLET", "2020", "AZUL", "PROFESIONAL"));
        automotores.add(new Camion("kjf-254", LocalDate.of(2016, 7, 25), "FIAT", "2015", "BLANCO", "PROFESIONAL"));
        automotores.add(new Moto("rtp-426", LocalDate.of(2019, 11, 16), "YAMAHA", "2016", "NEGRO", "PERSONAL"));
        automotores.add(new MotoElectrica("psr-893", LocalDate.of(2017, 11, 26), "HIUNDAY", "2018", "AMARILLO", "PROFESIONAL"));
        automotores.add(new Camion("kjf-254", LocalDate.of(2016, 7, 25), "MERCEDES-VEN", "2017", "MARRON", "PROFESIONAL"));
        automotores.add(new Utilitario("hws-489", LocalDate.of(2016, 8, 11), "PEGEOUT", "2019", "BLANCO", "PROFESIONAL"));

        for (Automotor automotor : automotores) {
            System.out.println("Vehiculos = " + automotor);


        }


    }

}