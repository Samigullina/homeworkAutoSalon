package myjava.npp.homework.april1214;

import java.util.Random;

public class TruckFactory {
    public static Car createCar(String carType){
        Random rand = new Random();
        if(carType.equals("Truck1"))
            return new Truck1(rand.nextInt(5)+1,"blue");
        else return null;


    }
}
