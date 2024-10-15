package com.example.prove_varie.Classi.SensorPolimorfismo;

public abstract class Sensor {
    protected int measure;

    protected Sensor(){
        this.measure = 50;
    }

    public abstract int getMeasure();
}

