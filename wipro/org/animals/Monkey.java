package org.animals;

public class Monkey {
	private String color;
    private int weight;
    private int age;

    public Monkey(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() { return false; }
    public boolean canClimb() { return true; }
    public String sound() { return "Chatter"; }

    public void printCharacteristics() {
        System.out.println("Monkey [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + "]");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

