package ua.levelup;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.print("Введите значние стороны a=");
double a=scan.nextDouble();
System.out.print("Введите значние стороны b=");
double b=scan.nextDouble();
double P=2*(a+b);
double S=a*b;
System.out.format("Периметр P=%f Площадь S=%f  Расчет был выполнен - %tY - %<tB - %<tA - %<tT", P, S, new Date());
    }
}
