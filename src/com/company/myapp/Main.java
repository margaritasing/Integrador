package com.company.myapp;

import java.time.LocalDate;
import java.util.*;


public class Main {




    public static void main(String[] args) {


        Registro registro = new Registro(1);

        List<Automotor> automotores = new ArrayList<>();
        automotores.add(new Moto("Moto","2015",LocalDate.of(2015,12,25), Uso.PARTICULAR));
        automotores.add(new Camion("Camion","2011",LocalDate.of(2016,7,12),Uso.PROFESIONAL));
        automotores.add(new Utilitario("Utilitario","2013",LocalDate.of(2015,12,25), Uso.PARTICULAR));
        automotores.add(new Colectivo("Colectivo","2016",LocalDate.of(2017,6,12),Uso.PARTICULAR));
        automotores.add(new AutoElectrico("Auto Electrico","2016",LocalDate.of(2017,12,25), Uso.PROFESIONAL));
        automotores.add(new MotoElectrica("Moto Electrica","2019",LocalDate.of(2019,7,12),Uso.PARTICULAR));
        automotores.add(new Camion("Camion","2012",LocalDate.of(2014,8,13), Uso.PROFESIONAL));
        automotores.add(new Colectivo("Colectivo","2016",LocalDate.of(2017,6,12),Uso.PROFESIONAL));




        Propietario propietario = new Propietario("Gabriel","254.369","Santa Rosa","Moto");

        Automotor automotor = new Automotor("Camion", "2015",LocalDate.of(2016,5,24),Uso.PROFESIONAL);

           automotores.get(0).agregarPropietario("Gabriel","25.369","Santa Rosa","Moto");
           automotores.get(1).agregarPropietario("Pedro", "417.147", "Santa Rosa", "Camion");
           automotores.get(2).agregarPropietario("Jose", "123.014", "San Jose","Utilitario");
           automotores.get(3).agregarPropietario("Francisco", "521.321", "Milagro Norte","Colectivo");
           automotores.get(4).agregarPropietario("Alexander", "127.971", "Bella Vista","Auto Electrico");
           automotores.get(5).agregarPropietario("Richard", "874.219", "Lima","Moto Electrica");
           automotores.get(6).agregarPropietario("Fernando", "789.254", "Bella Vista","Camion");
           automotores.get(7).agregarPropietario("Dylan", "741.365", "Barranquilla","Colectivo");

           automotores.get(0).agregarAutorizados("Jose, Raul, Pedro");
           automotores.get(1).agregarAutorizados("Alexander, Richard,Gabriel");
           automotores.get(2).agregarAutorizados("Fernando,Dylan,Pedro");
           automotores.get(3).agregarAutorizados("Francisco,Alex,Jose");
           automotores.get(4).agregarAutorizados("Jose, Pedro, Richard");
           automotores.get(5).agregarAutorizados("Gabriel, Jose, Alex");
           automotores.get(6).agregarAutorizados("Alexander, Francisco,Jose");
           automotores.get(7).agregarAutorizados("Pedro, Jose, Francisco");


        System.out.println("Lista de autos:");
        for (Automotor a : automotores){
            System.out.println(a);
            a.agregarPatente();
            List<Propietario> propietarios = a.getPropietarios();
            System.out.println("Propietario: ");
            for(Propietario p: propietarios){
                System.out.println(p.getNombre());
            }
            System.out.println("=========================");

           }

        System.out.println("Lista de autorizados : ");
        for (Automotor a : automotores){
            System.out.println(a);
            List<Autorizado> autorizados = a.getAutorizados();
            System.out.println("Autorizados : ");
            for (Autorizado autorizado : autorizados){
                System.out.println(autorizado.getNombre());
           }
           System.out.println("==============================");
        }







}

}


























