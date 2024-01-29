package main;

public class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public void printAnimals(){
        System.out.println(species+ ": " + name + ", " + age + " vuotta");
    }

    public void printAnimalsRun(int round){
        if (round < 1) {
            return;
        }
        System.out.println(name + " juoksee kovaa vauhtia!");
        printAnimalsRun(round - 1);
    }
}


