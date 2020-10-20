import java.util.Scanner;

public class Cartons {
    public int bars, cartons;

    public Cartons(){
        bars = 0;
        cartons = 0;
    }
    public Cartons(int b){
        this.bars = b;
        this.setCartons();
    }

    public void setCartons(){
        this.cartons = (int)(this.bars/24);
    }

    public int getCartons(){
        return this.cartons;
    }

    public void setBars(int b){

        this.bars = b;
    }

    public int getBars(){
        return this.bars;
    }

    //@Override
    //public String toString (int bars, int cartons){
      //  return cartons + " carton(s) needed to package " + bars + " bar(s).";
    //}


    @Override
    public String toString() {
        return cartons + " carton(s) needed to package " + bars + " bar(s).";
    }
}
