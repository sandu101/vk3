package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Zoo newZoo = null;

        // NAME TO ZOO
        System.out.println( "Anna eläintarhalle nimi:" );
        String name = sc.nextLine();
        newZoo = new Zoo(name);
        
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("Mikä laji?");
                        String species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String animalName = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        int mass = Integer.parseInt(sc.nextLine());

                        newZoo.Animal(species, animalName, mass);
                        break;
                    case 2:
                        newZoo.printAnimals();
                        break;  

                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int round = Integer.parseInt(sc.nextLine());
                        newZoo.runAnimal(round);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
    }
}
