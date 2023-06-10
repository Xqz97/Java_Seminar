package Lesson2OOP.aquarium;


import Lesson2OOP.animal.base.Animal;
import Lesson2OOP.fish.base.Fish;
import Lesson2OOP.zoo.Soundable;
import Lesson2OOP.zoo.SpeedMoveOfAnimal;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> aquarium = new ArrayList<>();
    public Aquarium addFish(Fish oneOfTheFish){
        aquarium.add(oneOfTheFish);
        return this;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("Список рыб в аквариуме: \n");
        for (Fish i: aquarium) {
            builder.append(i).append("\n");
        }
        return builder.toString();
    }

    private List<Location> getListOfLocation(){
        List<Location> listLocationOfFish = new ArrayList<>(aquarium);
        return listLocationOfFish;
    }
    public String getLocation(){
        StringBuilder builder = new StringBuilder();
        for (Location i: getListOfLocation()) {
            builder.append(i.whereFishLive()).append("\n");
        }
        return builder.toString();
    }

    public List<FishSwimmingSpeed> listOfSpeedInFish(){
        List<FishSwimmingSpeed> listOfSpeedInFish = new ArrayList<>();
        for (Fish i: aquarium) {
            if (i instanceof FishSwimmingSpeed){
                listOfSpeedInFish.add((FishSwimmingSpeed) i);
            }
        }
        return listOfSpeedInFish;
    }
    public FishSwimmingSpeed getTheFastestSpeedAmongFish(){
        List<FishSwimmingSpeed> listOfSpeedInFish = listOfSpeedInFish();
        FishSwimmingSpeed theHighestSpeed = listOfSpeedInFish.get(0);
        for (FishSwimmingSpeed i: listOfSpeedInFish) {
            if (theHighestSpeed.getFishSwimmingSpeed() < i.getFishSwimmingSpeed()){
                theHighestSpeed = i;
            }
        }
        return theHighestSpeed;
    }
}
