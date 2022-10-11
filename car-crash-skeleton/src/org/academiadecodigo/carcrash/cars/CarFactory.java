package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

import java.util.Random;

public class CarFactory {

    public static  Car getNewCar() {

        Position pos = new Position();


        //construct method for position
        int generatedCar = (int) (Math.random() * 2);


        switch (generatedCar) {

            case 0:
                Car Mustang = new Mustang(0, pos);
                return Mustang;


            case 1:
                Car Fiat = new Fiat(0, pos);
                return Fiat;


            default:
                System.out.printf("oops");


        }

        return null;

    }


}
