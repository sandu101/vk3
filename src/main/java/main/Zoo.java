package main;

import java.util.ArrayList;

public class Zoo {
    private static String zooName;
    private String name;
    private String species;
    private int age;
    private ArrayList<Animal> id = new ArrayList<>();

    public Zoo(String name){
        zooName = name;
    }

    public void Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
        id.add(new Animal(species,name,age));
    }

    public void printAnimals() {
        System.out.println(zooName + " pitää sisällään seuraavat eläimet:");
        for(Animal id : id){
            id.printAnimals();
        }
    }

    public void runAnimal (int round){
        for(Animal id :  id){
            id.printAnimalsRun(round);
        }   
    }
}