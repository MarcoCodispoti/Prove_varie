package com.example.prove_varie.Classi.PadreFiglio;

public class Figlio extends Padre {
    //parametri
    private int secondValue;


    //costruttore di Default
    public Figlio(){
        this.secondValue = 100;
    }

    //costruttore secondario
    public Figlio(int secondVal){
        this.secondValue = secondVal;
    }

    //Operazione che restituisce il secondo valore
    public int getSecondValue(){        //1° metodo che implementa l'operazion
        return this.secondValue;
    }
    public int getSecondValue(int addval){  // 2° metodo che implementa l'operazione
        int sum = this.secondValue + addval;
        return sum;
    }

}
