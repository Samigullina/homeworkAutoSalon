package myjava.npp.homework.april1214;

public abstract class Automobile extends Car{
    public Automobile(int id, String color){super(id,color);}
    @Override
    public String toString(){return super.toString();}
    @Override
    public void ride(){
        System.out.println("is ride");
    }
}
