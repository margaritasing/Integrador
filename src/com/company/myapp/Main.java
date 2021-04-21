package com.company.myapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;



public class Main {




    public static void main(String[] args) {


        Registro registro = new Registro(1);

        List<Automotor> automotores = new ArrayList<>();
        automotores.add(new Moto("Moto", "2015", LocalDate.of(2015, 12, 25), Uso.PARTICULAR));
        automotores.add(new Camion("Camion", "2011", LocalDate.of(2016, 7, 12), Uso.PROFESIONAL));
        automotores.add(new Utilitario("Utilitario", "2013", LocalDate.of(2015, 12, 25), Uso.PARTICULAR));
        automotores.add(new Colectivo("Colectivo", "2016", LocalDate.of(2017, 6, 12), Uso.PARTICULAR));
        automotores.add(new AutoElectrico("Auto Electrico", "2016", LocalDate.of(2017, 12, 25), Uso.PROFESIONAL));
        automotores.add(new Camion("Camion", "2019", LocalDate.of(2021, 7, 12), Uso.PARTICULAR));
        automotores.add(new Camion("Camion", "2012", LocalDate.of(2014, 8, 13), Uso.PROFESIONAL));
        automotores.add(new Colectivo("Colectivo", "2016", LocalDate.of(2017, 6, 12), Uso.PROFESIONAL));
        automotores.add(new MotoElectrica("Moto Electrica","2019",LocalDate.of(2020,12,06),Uso.PROFESIONAL));


        automotores.get(0).agregarPropietario("Gabriel", "25.369", "Santa Rosa", "Moto");
        automotores.get(1).agregarPropietario("Alexander", "417.147", "Santa Rosa", "Camion");
        automotores.get(2).agregarPropietario("Jose", "123.014", "San Jose", "Utilitario");
        automotores.get(3).agregarPropietario("Francisco", "521.321", "Milagro Norte", "Colectivo");
        automotores.get(4).agregarPropietario("Deibis", "127.971", "Bella Vista", "Camion");
        automotores.get(5).agregarPropietario("Richard", "874.219", "Lima", "Moto Electrica");
        automotores.get(6).agregarPropietario("Luis", "789.254", "Bella Vista", "Camion");
        automotores.get(7).agregarPropietario("Dylan", "741.365", "Barranquilla", "Colectivo");


        automotores.get(0).agregarAutorizados("Jose, Raul, Pedro");
        automotores.get(1).agregarAutorizados("Alexander, Richard,Gabriel");
        automotores.get(2).agregarAutorizados("Fernando,Dylan,Pedro");
        automotores.get(3).agregarAutorizados("Francisco,Alex,Jose");
        automotores.get(4).agregarAutorizados("Jose, Pedro, Richard");
        automotores.get(5).agregarAutorizados("Gabriel, Jose, Alex");
        automotores.get(6).agregarAutorizados("Alexander, Francisco,Jose");
        automotores.get(7).agregarAutorizados("Pedro, Jose, Francisco");


       System.out.println("Lista de autos:");
        for (Automotor a : automotores) {
            System.out.println(a);
            a.agregarPatente();
            List<Propietario> propietarios = a.getPropietarios();
            System.out.println("Propietario: ");
            for (Propietario p : propietarios) {
                System.out.println(p.getNombre());
            }

            List<Autorizado> autorizados = a.getAutorizados();
            System.out.println("Autorizados : ");
            for (Autorizado autorizado : autorizados) {
                System.out.println(autorizado.getNombre());

                System.out.println("=========================");
            }
        }

            Scanner sc = new Scanner(System.in);

        try {
            SimpleDateFormat sdformat = new
                    SimpleDateFormat("yyyy-MM-dd");
            Date fechaAltaNueva = sdformat.parse(
                    "2021-04-25");
            Date fechaAltaRegistrada = sdformat.parse("2021-01-23");
            if(fechaAltaNueva.compareTo(fechaAltaRegistrada) < 0) {
                System.out.println(" Cambio de fecha de Alta");
                System.out.println("Ingrese dia: ");
                int diaNuevo = sc.nextInt();
                System.out.println("Ingrese mes: ");
                int mesNuevo = sc.nextInt();
                System.out.println("Ingrese año: ");
                int anioNuevo = sc.nextInt();
                automotores.get(0).setFechaDeAlta(LocalDate.of(anioNuevo,mesNuevo,diaNuevo));
                automotores.get(0).cambiarPropietario();
            }
            else {
                System.out.println("EL Auto no puede Cambiar de propietario");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("==============================");

            for (Automotor a : automotores) {
                System.out.println(a);

                    if (a.getTipo().equals("Camion"))
                        System.out.println(a.getTipo());
                List<Propietario> propietarios = a.getPropietarios();
                for (Propietario p : propietarios) {
                    System.out.println(p.getNombre());

                }
                System.out.println("=========================");

            }

















            }
        }













































