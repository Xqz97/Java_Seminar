package Lesson2OOP.fish.base;

public abstract class GoodFish extends Fish {
    public GoodFish(String name) {
        super(name);
    }
    @Override
    public String whatFishEat(){
        return "Plancton";
    }
}
