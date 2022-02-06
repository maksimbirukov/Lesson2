package ua.levelup;


import java.util.Date;

public class Formatter {

    public static void main(String[] args) {
        System.out.format("%f %f %d, %1$+040.20f, %2$+020.10f, %3$+05d %n", Math.PI, 34.12, 23);

        System.out.format("%s string %n", "Hello");
        System.out.format("%c character %n", 'H');
        System.out.format("%1$#x %2$#x hex %n", 255, 240);
        System.out.format("%#x %<#o %<d hex %n", 255);
        System.out.format("%o octal %n", 255);
        System.out.format("%d decimal %n", 255);
        System.out.format("%a hex float %n", 243.341);
        System.out.format("%tc date %n", new Date());
        System.out.format("%tc   %n  это месяц - %<tm %n  " +
                "это полное название дня недели - %<tA", new Date());


    }

}
