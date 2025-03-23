
package hexlet.code;


import java.util.Scanner;


public class Cli {
    public static String greetings() {
//        System.out.println("Введите имя");
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String sname = s.nextLine();
        System.out.println("Hello, " + sname + "!");

        return sname;

    }
}
