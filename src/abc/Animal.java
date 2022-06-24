package abc;

public class Animal {

    private String name;
    public String color;
    private int height;


    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public Animal(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}