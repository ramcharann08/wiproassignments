package org.animals;

public class Giraffe {
	private String color;
    private int weight;
    private int age;

    public Giraffe(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() { return true; }
    public boolean canClimb() { return false; }
    public String sound() { return "Hum"; }

    public void printCharacteristics() {
        System.out.println("Giraffe [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + "]");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

