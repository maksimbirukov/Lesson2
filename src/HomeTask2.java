import java.util.Scanner;
import java.util.Date;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println("Введите длину прямоугольника:");
        Scanner scan = new Scanner(System.in); //create scanner for length
        int a = scan.nextInt(); //set length to var а
        System.out.println("Введите ширину прямоугольника:");
        int b = scan.nextInt(); //set width to var b
        int S = a*b;
        int P = 2*(a+b);
        Date date = new Date();
        System.out.printf("Сторона a= %1$d%n" +
                "Сторона b= %2$d%n" +
                "Площадь прямоугольника равна S= %3$d%n" +
                "Периметр прямоугольника равен P= %4$d%n" +
                "Расчет был выполнен %5$tY - %5$tB - %5$td - %5$tT", a, b, S, P, date);
    }
}
