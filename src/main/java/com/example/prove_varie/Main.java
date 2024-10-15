package com.example.prove_varie;

import com.example.prove_varie.Classi.ProvaJavaFX.javaFX;

public class Main {
    public static void main(String[] args){
        // Es. padre - Figlio
        /*
        Padre p1 = new Padre();
        Figlio f1 = new Figlio();

        System.out.println("il valore di Padre è:" + p1.getValore());
        System.out.println("il valore di Padre è:" + p1.getValore(33));

        System.out.println("il valore di Figlio è:" + f1.getSecondValue());
        System.out.println("il valore di Figlio è:" + f1.getSecondValue(33));  */

        // Es. Sensor: Polimorfismo
        /*
        Sensor s1 = new TempSensor();
        Sensor s2 = new LightSensor();
        TempSensor s3 = new TempSensor();
        //getMeasure() è un metodo astratto in Sensor ed è realizzato in maniera differente tra le due sottoclassi si Sensor
        System.out.println("il valore di s1 è:" + s1.getMeasure());     //restituisce 50
        System.out.println("il valore di s2 è:" + s2.getMeasure());     //restituisce 100
        // s1.tryPoli();    Da errore perchè la variabile s1 è di tipo Sensor
        s3.tryPoli();       //Posso farlo perchè la variabile s3 è di tipo TempSensor,
                            // tryPoli() è un metodo esclusivo di TempSensor  /*

         */

        // Prova JavaFX
        //javaFX.lancia();

        // Prova Test
    }    C:\Users\marco\IdeaProjects\Prove_Varie

}
