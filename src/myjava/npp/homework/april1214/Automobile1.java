package myjava.npp.homework.april1214;


public class Automobile1 extends Automobile {
    public Automobile1(int id, String color){super(id,color);}
    @Override
    public String toString(){return "Automobile1: "+super.toString();}
    @Override
    public void ride(){
        System.out.print("Automobile1 ");
        super.ride();
    }
}
