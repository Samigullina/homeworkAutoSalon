package myjava.npp.homework.april1214;

public abstract class Car implements Rideable{
    protected int id;
    protected String color;

    public Car(int id,String color){
        this.id = id;
        this.color = color;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getId(){
        return id;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return ("I'm car. My color is " + this.color + ". My id is "+this.id + ". ");
    }

    public abstract void ride();
}
