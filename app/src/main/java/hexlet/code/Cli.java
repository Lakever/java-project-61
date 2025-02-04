
package hexlet.code;


import java.util.Scanner;


public class Cli {
    public static String greetings() {
//        System.out.println("Введите имя");
        Scanner s = new Scanner(System.in);
        String sname = s.nextLine();
        return sname;

    }
}
