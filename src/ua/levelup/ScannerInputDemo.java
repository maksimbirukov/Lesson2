package ua.levelup;

import java.util.Scanner;

public class ScannerInputDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How is your name?");

        String name = scanner.nextLine();

        System.out.println("How old are you?");

        int age = scanner.nextInt();

        System.out.println("Data you typed -> " + name + " " + age);
    }
}

