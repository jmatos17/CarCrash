package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Mustang extends Car {

    public String name;
    private int speed;

    //Different speeds - specific behaviour
    public Mustang(int speed, Position pos) {
        this.setName("M");
        this.setSpeed(speed);
        this.setPos(pos);

    }

    public String getName() {
        return name;
    }
}
