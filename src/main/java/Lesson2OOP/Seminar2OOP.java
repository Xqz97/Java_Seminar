package Lesson2OOP;

import Lesson2OOP.animal.Duck;
import Lesson2OOP.animal.base.Animal;
import Lesson2OOP.animal.Bear;
import Lesson2OOP.animal.Girafee;
import Lesson2OOP.zoo.SpeedFlyOfAnimal;
import Lesson2OOP.zoo.SpeedMoveOfAnimal;
import Lesson2OOP.zoo.Zoo;

public class Seminar2OOP {
    public static void main(String[] args) {
    Animal bear1 = new Bear("Потапыч");
    Animal gireffe1 = new Girafee("Мелман");
        System.out.println("---- animal");
        System.out.println(bear1);
        System.out.println(gireffe1);

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear1).addAnimal(gireffe1).addAnimal(new Duck("Donald"));
        System.out.println(zoo);

        System.out.println("---- how animal sound");
        System.out.println(zoo.getSound());

        System.out.println("---- fastest animal");

        SpeedMoveOfAnimal theHightestSpeed = zoo.getTheFastestSpeedAmongAnimals();
        System.out.println(theHightestSpeed);

        System.out.println("---- animal whu can move ");

        for (SpeedMoveOfAnimal i: zoo.listOfSpeedInAnimals()) {
            System.out.println(i);
        }

        System.out.println("---- animal whu can fly ");

        for (SpeedFlyOfAnimal i: zoo.listOfFlySpeedInAnimals()) {
            System.out.println(i);
        }
    }
}
