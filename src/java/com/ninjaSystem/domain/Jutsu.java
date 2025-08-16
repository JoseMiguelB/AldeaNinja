package src.java.com.ninjaSystem.domain;

public class Jutsu {
    // Atributos
    private String name;
    private double chakraCost;

    // Constructor
    public Jutsu(String name, double chakraCost) {
        this.name = name;
        this.chakraCost = chakraCost;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getChakraCost() {
        return chakraCost;
    }
}
