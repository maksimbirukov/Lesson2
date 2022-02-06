package ua.levelup;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);

        try {

            int read;

            StringBuilder builder = new StringBuilder();
            while ((read = isr.read()) != -1) {
                char ch = (char)read;
                if (ch != '\n') {
                    builder.append(ch);
                }else {
                    break;
                }
            }

            System.out.println(builder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
