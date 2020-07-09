package com.joelGefen;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Animal[] animals = new Animal[2];


        for (int i = 0; i < animals.length; i++) {

            animals[i] = random.nextBoolean() ? new Dog() : new Cat();
            animals[i].run();
            animals[i].getLegs();

        }
    }
}
