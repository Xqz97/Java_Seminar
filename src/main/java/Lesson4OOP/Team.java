package Lesson4OOP;

import Lesson4OOP.protect.Protection;
import Lesson4OOP.warriors.Archer;
import Lesson4OOP.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T>{
    private List<T> team = new ArrayList<>();
    public void add(T element){
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth(){
        int teamHelth = 0;
        for (T i: this) {
            teamHelth += i.getHealthPoint();
        }
        return teamHelth;
    }

    public int maxAttackDistance(){
        int maxDistance = 0;
        for (T i: this) {
            if (!(i instanceof Archer)){
                continue;
            }
            int currentDistance = ((Archer)i).distance();
            if (maxDistance < currentDistance){
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack(){
        int teamAtack = 0;
        for (T i: this) {
            teamAtack += i.getWeapon().damage();
        }
        return teamAtack;
    }

    public int getMinArmour(){
        int minArmour = this.team.get(0).getArmour().protect();
        for (T i: this) {
            if (i.getArmour().protect() < minArmour){
                minArmour = i.getArmour().protect();
            }
        }
        return minArmour;
    }

    @Override
    public String toString() {
        StringBuilder bd = new StringBuilder();
        for (T i: this) {
            bd.append(i).append("\n");
        }
        bd.append(String.format("Team attack: %d", getTeamAttack()));
        bd.append(String.format("Team health: %d", getTeamHealth()));
        bd.append(String.format("Team attack: %d", maxAttackDistance()));
        return bd.toString();

    }
}
