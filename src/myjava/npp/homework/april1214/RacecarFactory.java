package myjava.npp.homework.april1214;

import java.util.Random;

public class RacecarFactory {
    public static Car createCar(String carType){
        Random rand = new Random();
        if(carType.equals("Racecar1"))
            return new Racecar1(rand.nextInt(5)+1,"yellow", rand.nextInt(100)+300);
        else if (carType.equals("Racecar2"))return new Racecar2(rand.nextInt(5)+1,"red", rand.nextInt(100)+300);
        else return null;


    }

}
