package com.company;


import java.util.Scanner;
import java.util.Date;

public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter length of the rectangle");

            int length = scanner.nextInt();

            System.out.println("Enter width of the rectangle");

            int width = scanner.nextInt();
            int s = length * width;
            int p = (length + width) * 2;

            if(length<=0 | width<=0 | length==width) {
                System.out.println("Try again");
            }
            else {

                System.out.format("The area of the rectangle is %d!%nThe perimeter of the rectangle is %d!%nThe calculation is done at - (%tY) - (%<tB) - (%<td) - %<tT ", s, p, new Date());
            }

        }
    }

