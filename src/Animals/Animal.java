package Animals;

import AnimalMovement.Movement;

public abstract class Animal implements Movement {

    protected String name;
    protected String description;
    protected int legs;


    public void sound(){

        System.out.println("wiggle wiggle");

    }

    public int getLegs() {
        return legs;
    }

    public void numOfLegs(){
        System.out.println( name + " has " + legs + " legs");
    }

    @Override
    public void run() {
        System.out.println("running .....");
    }

    @Override
    public void jump() {
        System.out.println("Jumping around ...");

    }
}
