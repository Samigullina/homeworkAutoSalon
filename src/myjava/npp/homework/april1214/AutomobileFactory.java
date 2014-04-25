package myjava.npp.homework.april1214;

import java.util.Random;

public class AutomobileFactory {
        public static Car createCar(String carType){
            Random rand = new Random();
            if(carType.equals("Automobile1"))
                return new Automobile1(rand.nextInt(5)+1,"white");
            else return null;
        }
}
