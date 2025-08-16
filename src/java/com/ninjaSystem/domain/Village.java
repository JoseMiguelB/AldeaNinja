package src.java.com.ninjaSystem.domain;

import java.util.ArrayList;

public class Village {
    // Atributos

    private String name;
    private ArrayList<Ninja> ninjas;

    // Constructor
    public Village(String name) {
        this.name = name;
        this.ninjas = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Ninja> getNinjas() {
        return ninjas;
    }

    // Métodos
    public void addNinja(Ninja ninja) {
        ninjas.add(ninja);
    }
}
