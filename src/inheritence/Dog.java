package inheritence;

import abc.Animal;

public class Dog extends Animal {

    private int weight;

    public Dog(String name, String color, int height) {
        super(name, color, height);
        this.weight = weight;
    }

}
