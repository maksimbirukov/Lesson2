import java.util.Scanner;
import java.util.Date;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println("Введите длину прямоугольника:");
        Scanner length = new Scanner(System.in);
        int a = length.nextInt(); //засетали длину в переменную а
        System.out.println("Введите ширину прямоугольника:");
        Scanner width = new Scanner(System.in);
        int b = width.nextInt(); //засетали ширину в переменную b
        double S = a*b;
        double P = 2*(a+b);
        Date date = new Date();
        System.out.printf("Сторона a= %1$d%n" +
                "Сторона b= %2$d%n" +
                "Площадь прямоугольника равна S= %3$.1f%n" +
                "Периметр прямоугольника равен P= %4$.1f%n" +
                "Расчет был выполнен %5$tY - %5$tB - %5$td - %5$tT", a, b, S, P, date);
    }
}
