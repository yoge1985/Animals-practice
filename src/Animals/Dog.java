package Animals;

import Animals.Animal;
import Animals.Cat;

public class Dog extends Animal {


    public Dog() {
        name = "Dog";
        legs = 4;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("WOOF WOOF");
    }

    //get tail value of cat
    int numberOfTails = Cat.getTail();

}
