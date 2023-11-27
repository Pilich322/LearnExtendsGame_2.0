package com.example.learnextendsgame_20.data;

public class Unit {

    private double health;
    private double damage;

    private char zoneAttack;
    private char zoneDefend;

    public Unit(double health, double damage) {
        this.health = health;
        this.damage = damage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public char getZoneAttack() {
        return zoneAttack;
    }

    public void setZoneAttack(char zoneAttack) {
        this.zoneAttack = zoneAttack;
    }

    public char getZoneDefend() {
        return zoneDefend;
    }

    public void setZoneDefend(char zoneDefend) {
        this.zoneDefend = zoneDefend;
    }


}
