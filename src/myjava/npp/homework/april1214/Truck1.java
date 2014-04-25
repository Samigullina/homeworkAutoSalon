package myjava.npp.homework.april1214;

public class Truck1 extends Truck {
    public Truck1(int id, String color){super(id,color);}
    @Override
    public String toString(){return "Truck1: "+super.toString();}
    @Override
    public void ride(){
        System.out.print("Truck1 ");
        super.ride();
    }
}
