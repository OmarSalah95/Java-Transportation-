package transportation;

import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        // Part 1 Interfaces

        Horse seabiscuit = new Horse("Seabiscuit");
        Horse affirmed = new Horse("Affirmed");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        affirmed.eat(25);
        seabiscuit.move();
        seabiscuit.move();
        seabiscuit.move();
        System.out.println("Seabiscuit's fuel level " + seabiscuit.getFuel());
        System.out.println();

        // Part 2 Abstract Classes

        System.out.println("*** From Abstract Class");
        HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
        secretariat.addFuel(10);
        System.out.println("Secretariat's fuel level " + secretariat.getFuelLevel());
        HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
        HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
        HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);
        HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
        eclipse.move(10);
        System.out.println("Eclipse's fuel leve " + eclipse.getFuelLevel());

        Auto vw = new Auto(1, "EuroVan", 2000);
        Auto toyota = new Auto(10, "Tundra", 1998);
        Auto honda = new Auto(5, "Accord", 2003);
        vw.move();
        vw.move(5);
        System.out.println(vw.getName() + " fuel level " + vw.getFuelLevel());
        
        // Part 3 Combining classes
    }
}