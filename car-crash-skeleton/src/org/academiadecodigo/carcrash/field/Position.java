package org.academiadecodigo.carcrash.field;

public class Position {

    //Describes where a car lives on the grid
    //Update results in moving the car

    private int col;
    private int row;

    private boolean compareRow;
    private boolean compareCol;



    public int getCol() {
        return col;
    } // incrementa de cima para baixo

    public int getRow() {
        return row;
    } // incrementa da esquerda para a direita

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Position (){
        this.col = (int)(Math.random()*100);
        this.row= (int)(Math.random()*25);
    }
    public boolean compareCol(int col){
        if (getCol() == col){
            return true;
        }
        return false;
    }

    public boolean compareRow(int row){
        if(getRow() == row){
            return true;
        }
        return false;
    }

}
