package ua.levelup;

import java.util.Scanner;
import java.util.Date;

class MyScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int a = scanner.nextInt();

        System.out.println("Enter second number:");

        int b = scanner.nextInt();

        Date dat = new Date();

        System.out.format("Side a = %d%n" + "Side b = %d%n" + "Square = %d%n" + "Perimeter = %d%n" + "Calculation made %tY-%tB-%te - %tH:%tM:%tS", a, b, a*b, a*2+b*2,  dat, dat, dat, dat, dat, dat);

    }
}