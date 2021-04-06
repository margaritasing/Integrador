package com.company.myapp;

import java.time.LocalDate;
import java.util.*;


public class Main {




    public static void main(String[] args) {


       List<Propietario> propietarios = new ArrayList<>();
        propietarios.add(new Propietario("GABRIEL", "123.365", "TEMPERLEY","Camion"));
        propietarios.add(new Propietario("Pedro", "417.147", "Santa Rosa", "Moto"));
        propietarios.add(new Propietario("Jose", "123.014", "San Jose","Auto"));
        propietarios.add(new Propietario("Francisco", "521.321", "Milagro Norte","Camion"));
        propietarios.add(new Propietario("Alexander", "127.971", "Bella Vista","Camion"));
        propietarios.add(new Propietario("Richard", "874.219", "Lima","Colectivo"));


        for (Propietario p : propietarios){
            if( p.getNombre().equals("Camion")){
                System.out.println("Los propietarios de camion son:" + p);
            }
        }




            Collections.sort(propietarios, new Comparator<Propietario>() {
                @Override
                public int compare(Propietario o1, Propietario o2) {
                    return o1.getNombre().compareTo(o2.getNombre());
                }
            });
            for (int cont = 0; cont < propietarios.size(); cont++) {
                System.out.println("Propietarios = " + propietarios.get(cont).getTipoDeVehiculo().equals("Camion"));
            }
            System.out.println("=======================================");


        List<Autorizado> autorizados = new ArrayList<>();
        autorizados.add(new Autorizado("Luis", "25.369","Bella Vista","Camion"));
        autorizados.add(new Autorizado("Leonor", "36.699","Willestam","Colectivos"));
        autorizados.add(new Autorizado("Raul","21.369","El Gaitero","Utilitarios"));
        autorizados.add(new Autorizado("Ana", "87.254","San Jose","Moto"));

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



        Propietario propietario = new Propietario("Gabriel","254.369","SAnta Rosa","Moto");

        Automotor automotor = new Automotor();

           automotores.get(0).agregarPropietario("Gabriel","25.369","Santa Rosa","Moto");
           automotores.get(1).agregarPropietario("Pedro", "417.147", "Santa Rosa", "Camion");
           automotores.get(2).agregarPropietario("Jose", "123.014", "San Jose","Auto");
           automotores.get(3).agregarPropietario("Francisco", "521.321", "Milagro Norte","Camion");
           automotores.get(4).agregarPropietario("Alexander", "127.971", "Bella Vista","Camion");
           automotores.get(5).agregarPropietario("Richard", "874.219", "Lima","Colectivo");


        for (Automotor a : automotores){
            System.out.println(a);
        }













    }








}


