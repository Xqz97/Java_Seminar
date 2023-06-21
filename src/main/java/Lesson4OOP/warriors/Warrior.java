package Lesson4OOP.warriors;

import Lesson4OOP.protect.Protection;
import Lesson4OOP.weapons.Weapon;

import java.util.Random;

public abstract class Warrior <W extends Weapon, S extends Protection>{
    private String name;
    private int healthPoint;
    private W weapon;

    private S armour;

    public Warrior(String name, int healthPoint, W weapon, S armour) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armour = armour;
    }

    public S getArmour() {
        return armour;
    }

    public void setArmour(S armour) {
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit(){
        Random rnd = new Random();
             int hitDamage = rnd.nextInt(0, weapon.damage() + 1);
             return hitDamage;
    }

    public int safe(){
        Random rnd = new Random();
        int safeValue = rnd.nextInt(0, armour.protect() + 1);
        return safeValue;
    }
    public void reduceHealth(int hitDamage){
        int damage = hitDamage - safe();
        if (damage >= 0) {
            healthPoint -= damage;
        }
        if (healthPoint < 0){
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("name: %s, weapon: %s, helthpoint: %d", name, weapon, healthPoint);
    }
}
