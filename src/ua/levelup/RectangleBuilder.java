package ua.levelup;

import java.util.Date;
import java.util.Scanner;

public class RectangleBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        int s = a * b;
        int p = a * 2 + b* 2;
        System.out.format("Сторона а = %d %nСторона b = %d %nПлощадь S = %d %nПериметр P = %d %n Расчёт был выполнен %tY - %<tB - %<tA - %<tr", a, b, s, p, new Date());
    }
}
