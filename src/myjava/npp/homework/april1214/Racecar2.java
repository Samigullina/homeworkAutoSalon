package myjava.npp.homework.april1214;

public class Racecar2 extends Racecar {
    public Racecar2(int id, String color, int speed){super(id,color,speed);}
    @Override
    public String toString(){return "Racecar2: "+super.toString();}
    @Override
    public void ride(){
        System.out.print("Racecar2 ");
        super.ride();
    }
}

