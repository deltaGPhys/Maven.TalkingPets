package io.zipcoder.polymorphism;

import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        Pet[] pets = getPets();

        String[] className;
        String raw;
        for (Pet pet: pets) {
            System.out.println(pet.outputPet());
        }

    }

    public static Pet[] getPets () {
        int numPets = getInteger("How many pets do you have? ");
        Pet[] pets = new Pet[numPets];

        String name;
        String type;

        for (int i = 0; i<numPets; i++) {
            name = getInput("Name a pet: ");
            type = getInput("What type of pet is it? ");
            switch (type.toLowerCase()) {
                case "dog":
                    pets[i] = new Dog(name);
                    break;
                case "cat":
                    pets[i] = new Cat(name);
                    break;
                case "fish":
                    pets[i] = new Fish(name);
                    break;
                default:
                    pets[i] = new Pet(name);
                    break;
            }
        }
    }



    public static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(); //get input from user

        return input;
    }

    public static Integer getInteger(String prompt) {
        String input = getInput(prompt);
        while (true) {
            if (integerCheck(input)) break;
            else {
                System.out.println("Enter a number: ");
                input = getInput("> ");
            }
        }
        return Integer.valueOf(input);
    }

    static Boolean integerCheck(String input) {
        return input.matches("^\\d+$");
    }

}
