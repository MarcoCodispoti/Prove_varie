package com.example.prove_varie.Classi.SensorPolimorfismo;

public class LightSensor extends Sensor {

    @Override
    public int getMeasure() {
        return this.measure+50;
    }
}
