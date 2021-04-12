package com.company;

public class Hero {
   private int health;
    private int damage;
    private String superPowers;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(String superPowers) {
        this.superPowers = superPowers;
    }

    public Hero(int health , int damage, String superPowers){
        this.health = health;
        this.damage = damage;
        this.superPowers = superPowers;
    }

    public Hero(int health , int damage){
       this.health = health;
       this.damage = damage;
    }
}



