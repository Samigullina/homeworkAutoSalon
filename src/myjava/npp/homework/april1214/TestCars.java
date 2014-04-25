package myjava.npp.homework.april1214;

import java.util.Scanner;

public class TestCars {
    public static void main(String[] args) {
        AutomobileSalon salon = new AutomobileSalon();
        System.out.println("Enter the id of the car: ");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        salon.printCars(salon.findCarsById(id));
    }
}
