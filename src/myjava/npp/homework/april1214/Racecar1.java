package myjava.npp.homework.april1214;

public class Racecar1 extends Racecar {
    public Racecar1(int id, String color, int speed){super(id,color,speed);}

    @Override
    public String toString(){return "Racecar1: "+super.toString();}
    @Override
    public void ride(){
        System.out.print("Racecar1 ");
        super.ride();
    }
}
