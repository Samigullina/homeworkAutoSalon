package myjava.npp.homework.april1214;

public abstract class Racecar extends Car{
    protected int speed;
    public Racecar(int id, String color, int speed){
        super(id,color);
        this.speed = speed;
    }
    @Override
    public String toString(){
        return (super.toString()+"My speed is "+ this.speed + " km/h. ");
    }
    @Override
    public void ride(){
        System.out.println("is ride");
    }


}
