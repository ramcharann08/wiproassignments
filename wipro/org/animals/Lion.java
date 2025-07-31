package org.animals;

public class Lion {
	private String color;
    private int weight;
    private int age;

    public Lion(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Roar";
    }

    public void printCharacteristics() {
        System.out.println("Lion [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + "]");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

