package com.company.AdditionalTask;

public class CombatVehicle {
    protected String type;
    protected String model;
    protected int health;

    CombatVehicle(String type, String model, int health){
        this.type = type;
        this.model = model;
        this.health = health;
    }

    public static boolean IsDestroyed(CombatVehicle combatVehicle){
        if (combatVehicle.health > 0)
            return true;
        return false;
    }

    public void ShowInfo(){

    }

    public int Attack(){
        return 0;
    }

    public int Defense(int  damage){
        return 0;
    }
}
