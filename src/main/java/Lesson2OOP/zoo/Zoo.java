package Lesson2OOP.zoo;

import Lesson2OOP.animal.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Radio radio = new Radio();
    private List<Animal> zoo = new ArrayList<>();
    public Zoo addAnimal(Animal oneOfAnimal){
        zoo.add(oneOfAnimal);
        return this;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("В зоорпаке: \n");
        for (Animal animal: zoo) {
            builder.append(animal).append("\n");
        }
        return builder.toString();
    }

    private List<Soundable> getSounable(){
        List<Soundable> result = new ArrayList<>(zoo);
            result.add(radio);
        return result;
    }

    public String getSound(){
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable: getSounable()) {
            builder.append(soundable.howAnimalSound()).append("\n");

        }
        return builder.toString();
    }

    public List<SpeedMoveOfAnimal> listOfSpeedInAnimals(){
        List<SpeedMoveOfAnimal> listOfSpeedInAnimals = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof SpeedMoveOfAnimal){
                listOfSpeedInAnimals.add((SpeedMoveOfAnimal) animal);
            }
        }
        return listOfSpeedInAnimals;
    }

    public SpeedMoveOfAnimal getTheFastestSpeedAmongAnimals(){
        List<SpeedMoveOfAnimal> listOfSpeedInAnimals = listOfSpeedInAnimals();
        SpeedMoveOfAnimal theHighestSpeed = listOfSpeedInAnimals.get(0);
        for (SpeedMoveOfAnimal i: listOfSpeedInAnimals) {
            if (theHighestSpeed.getSomeSpeed() < i.getSomeSpeed()){
                theHighestSpeed = i;
            }
        }
        return theHighestSpeed;
    }

    public List<SpeedFlyOfAnimal> listOfFlySpeedInAnimals(){
        List<SpeedFlyOfAnimal> listOfFlySpeedInAnimals = new ArrayList<>();
        for (Animal i: zoo) {
            if (i instanceof SpeedFlyOfAnimal){
                listOfFlySpeedInAnimals.add((SpeedFlyOfAnimal) i);
            }
        }
        return listOfFlySpeedInAnimals;
    }
}
