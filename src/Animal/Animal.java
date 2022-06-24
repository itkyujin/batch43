package Animal;

public class Animal {
    int leg = 4;
    String color = "black";

    public void speake(){

    }

    public Animal(){

    }

    public Animal(int leg, String color) {
        this.leg = leg;
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
}
