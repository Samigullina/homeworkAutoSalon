package myjava.npp.homework.april1214;


public abstract class Truck extends Car {
    public Truck(int id, String color){super(id,color);}
    @Override
    public String toString(){return super.toString();}
    @Override
    public void ride(){
        System.out.println("is ride");
    }

}
