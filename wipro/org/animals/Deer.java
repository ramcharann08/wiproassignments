package org.animals;

public class Deer {
	private String color;
    private int weight;
    private int age;

    public Deer(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() { return true; }
    public boolean canClimb() { return false; }
    public String sound() { return "Bleat"; }

    public void printCharacteristics() {
        System.out.println("Deer [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + "]");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

