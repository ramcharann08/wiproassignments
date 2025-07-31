package org.animals;

public class Tiger {
	private String color;
    private int weight;
    private int age;

    public Tiger(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() { return false; }
    public boolean canClimb() { return true; }
    public String sound() { return "Growl"; }

    public void printCharacteristics() {
        System.out.println("Tiger [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + "]");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

