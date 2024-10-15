package com.example.prove_varie.Classi.SensorPolimorfismo;

import com.example.prove_varie.Classi.SensorPolimorfismo.Sensor;

public class TempSensor extends Sensor {

    @Override
    public int getMeasure() {
        return this.measure;
    }

    public void tryPoli(){
        System.out.println("Questo è un metodo specifico della sottoclasse");
    }
}
