package Lesson2OOP.fish.base;

public abstract class EvilFish extends Fish {
    public EvilFish(String name) {
        super(name);
    }
    @Override
    public String whatFishEat(){
        return "Other fish";
    }
}
