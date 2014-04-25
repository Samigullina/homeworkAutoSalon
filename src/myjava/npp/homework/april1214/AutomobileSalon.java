package myjava.npp.homework.april1214;

import java.util.ArrayList;

public class AutomobileSalon {
     private ArrayList <Car> RaceCar1 = new ArrayList<Car>();
     ArrayList <Car> RaceCar2 = new ArrayList<Car>();
     ArrayList <Car> Truck1 = new ArrayList<Car>();
     ArrayList <Car> Automobile1 = new ArrayList<Car>();

    public AutomobileSalon(){
        for(int j=0;j<2; j++)
        {
            RaceCar1.add(RacecarFactory.createCar("Racecar1"));
        }
        for(int j=0;j<2; j++)
        {
            RaceCar2.add(RacecarFactory.createCar("Racecar2"));
        }
        for(int j=0;j<3; j++)
        {
            Truck1.add(TruckFactory.createCar("Truck1"));
        }
        for(int j=0;j<4; j++)
        {
            Automobile1.add(AutomobileFactory.createCar("Automobile1"));
        }

    }



    public ArrayList<Car> findCarsById(int id){
        ArrayList <Car> resultList=new ArrayList<Car>();
        for(int i=0; i<2; i++)
            if((RaceCar1.get(i)!=null)&&(RaceCar1.get(i).getId() == id))resultList.add(RaceCar1.get(i));
        for(int i=0; i<2; i++)
            if((RaceCar2.get(i)!=null)&&(RaceCar2.get(i).getId() == id))resultList.add(RaceCar2.get(i));
        for(int i=0; i<3; i++)
            if((Truck1.get(i)!=null)&&(Truck1.get(i).getId()==id))resultList.add(Truck1.get(i));
        for(int i=0; i<4; i++)
            if((Automobile1.get(i)!=null)&&(Automobile1.get(i).getId() == id))resultList.add(Automobile1.get(i));
        return resultList;
    }

    public void printCars(ArrayList<Car>cars){
        for (Car car: cars)
            System.out.println(car);
    }

}
