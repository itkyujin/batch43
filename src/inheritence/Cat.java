package inheritence;

import abc.Animal;

public class Cat extends Animal {

    private String stripe;
    private int mustache;

    public Cat(int height, int mustache) {
        super(height);
        this.mustache = mustache;
    }


}
