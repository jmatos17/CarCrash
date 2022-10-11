package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    //Different types of car will exist
    //Cars will have different speeds and move in different ways
    //Cars can crash at any time

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private int speed;

    private String name;

    private boolean crashed = false;

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Position getPos() {
        return pos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean isCrashed() {
        return crashed;
    }

    public void setCrashed() {
        this.crashed = true;
    }

    public boolean comparePos(Car car) {
        boolean col = this.pos.compareCol(car.pos.getCol());
        boolean row = this.pos.compareRow(car.pos.getRow());

        if (col && row) {
            return true;
        }
        return false;
    }


    public Position moveCar(Position pos) {
        int moveRow = pos.getRow();
        int moveCol = pos.getCol();


        int direction = (int) (Math.random() * 4);
        if ((moveCol <= 100 && moveRow <= 25) && (moveCol >= 0 && moveRow >= 0)) {
            switch (direction) {

                case 0:
                    //right
                    moveRow++;
                    if (moveRow == 25 || moveRow == 26) {
                        moveRow--;
                    }
                    break;
                case 1:
                    //left
                    moveRow--;
                    if (moveRow == 0 || moveRow == -1) {
                        moveRow++;
                    }
                    break;
                case 2:
                    //up
                    moveCol--;
                    if (moveCol == 0 || moveCol == -1) {
                        moveCol++;
                    }
                    break;
                case 3:
                    //down
                    moveCol++;
                    if (moveCol == 100 || moveCol == 101) {
                        moveCol--;
                    }
                    break;
            }
        }

        pos.setCol(moveCol);
        pos.setRow(moveRow);
        return pos;
    }


    @Override
    public String toString() {
        return name;
    }


}
