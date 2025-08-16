package src.java.com.ninjaSystem.domain;

import java.util.ArrayList;

public class Ninja {
    // Atributos

    private String name;
    private String rank;
    private double attack;
    private double defense;
    private double chakra;

    private ArrayList<Jutsu> jutsus;

    public Ninja(String name, String rank, double attack, double defense, double chakra) {
        this.name = name;
        this.rank = rank;
        this.attack = attack;
        this.defense = defense;
        this.chakra = chakra;
        this.jutsus = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public double getChakra() {
        return chakra;
    }

    public ArrayList<Jutsu> getJutsus() {
        return jutsus;
    }

    // Setters

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void setChakra(double chakra) {
        this.chakra = chakra;
    }
}
