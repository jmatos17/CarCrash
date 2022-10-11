package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Fiat extends Car {

    //Different speeds - specific behaviour
    private int speed;
    public String name;

    public Fiat(int speed, Position pos){
        this.setName("F");
        this.setSpeed(speed);
        this.setPos(pos);

    }

    public String getName() {
        return name;
    }
}
