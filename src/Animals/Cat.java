package Animals;

import Animals.Animal;

public class Cat extends Animal {

    private static int tail;


    public Cat() {
        name = "Cat";
        tail = 1;
        legs = 2;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.print("MEEOOWW");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("swish swish");
    }

    public static int getTail() {
        return tail;
    }
}
