package com.example.prove_varie.Classi.PadreFiglio;

public class Padre {
    private int valore;

    public Padre(){
        this.valore = 50;
    }

    public Padre(int value){
        this.valore = value;
    }

    public int getValore(){
        return this.valore;
    }
    public int getValore(int addval){
        return this.valore+addval;
    }

}
