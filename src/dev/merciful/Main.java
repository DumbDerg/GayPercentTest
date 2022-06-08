package dev.merciful;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean retest = true;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (retest) {
            int x = random.nextInt(0, 101);
            System.out.println("Who do you want to test? (Type \"self\" if you want to test yourself!)");
            String name = scanner.next();
            if (name.equals("self")) {
                System.out.println("You're " + x + "% gay! UwU \nHappy Pride Month!");
            }else {
                System.out.println(name + " is " + x + "% gay! UwU\nHappy Pride Month!");
            }
            System.out.println("Do you want to do the test again? (true or false)");
            retest = scanner.nextBoolean();
        }

    }
}