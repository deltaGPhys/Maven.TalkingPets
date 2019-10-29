package io.zipcoder.polymorphism;

import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        int numPets = getInteger("How many pets do you have? ");
        String[][] tempHolding = new String[numPets][2];

        String name;
        String type;
        for (int i = 0; i<numPets; i++) {
            name = getInput("Name a pet: ");
            type = getInput("What type of pet is it? ");
            tempHolding[i][0] = name;
            tempHolding[i][1] = type;
        }

        for (String[] pet: tempHolding) {
            System.out.println(String.format("Pet: %s   Type: %s", pet[0], pet[1]));
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
