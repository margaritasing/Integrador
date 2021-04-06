package com.company.myapp;


import java.util.Locale;
import java.util.Random;

public interface Patente {

   default void agregarPatente() {
       char[] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
       int charsLength = chars.length;
       Random random = new Random();
       StringBuilder buffer = new StringBuilder();
       for (int i = 0; i < 6; i++) {
           buffer.append(chars[random.nextInt(charsLength)]);
       }
       System.out.println("La patente es :  " + buffer.toString().toUpperCase(Locale.ROOT));

   }






    }
