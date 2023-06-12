package Lesson2OOP;

import Lesson2OOP.aquarium.Aquarium;
import Lesson2OOP.aquarium.FishSwimmingSpeed;
import Lesson2OOP.fish.Omul;
import Lesson2OOP.fish.Salmon;
import Lesson2OOP.fish.Shark;
import Lesson2OOP.fish.base.Fish;
import Lesson2OOP.zoo.SpeedMoveOfAnimal;

public class HomeWork {
    public static void main(String[] args) {
        Fish shark1 = new Shark("Lenny");
        Fish salmon1 = new Salmon("Peter");
        Fish omul1 = new Omul("Sergey");
        System.out.println("--- Fish ---");
        System.out.println(shark1);
        System.out.println(salmon1);
        System.out.println(omul1);

        Aquarium aquarium1 = new Aquarium();
        aquarium1.addFish(shark1).addFish(salmon1).addFish(omul1);
        System.out.println(aquarium1);

        System.out.println("--- where fish live ---");
        System.out.println(aquarium1.getLocation());

        System.out.println("--- fish who can swimming ---");
        for (FishSwimmingSpeed i: aquarium1.listOfSpeedInFish()) {
            System.out.println(i);
        }
        System.out.println("--- fastest fish in aquarium---");

        FishSwimmingSpeed theHightestSpeed = aquarium1.getTheFastestSpeedAmongFish();
        System.out.println(theHightestSpeed);

    }


}
