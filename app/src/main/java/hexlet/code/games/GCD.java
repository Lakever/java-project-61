package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class GCD {
    public static void startGameGCD() {
        var person = startGreet(4);

        int count = 3;
        for (int i = 0; i < count; i++) {
            Random random = new Random();

            int slag1 = random.nextInt(100) + 1;
            int slag2 = random.nextInt(100) + 1;
            int a = 0;
            int b = 0;
            int temp = 0;

//            System.out.println(slag1);
//            System.out.println(slag2);
            // тут конечно можно было и проще (без а и b)
            if (slag1 > slag2) {
                b = slag1;
                a = slag2;
            } else {
                a = slag2;
                b = slag1;
            }
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: "+ a + " " + b);
            // алгоритм нахождения НОД Евклид
            while (b != 0) {
                temp = b;
                b = a % b;
                a = temp;
            }

            // тут берем ответ от пользователя
            Scanner s = new Scanner(System.in);
            int answer = s.nextInt();
            if (answer == a) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%d' is wrong answer, Correct answer was '%s'", answer, a);
                System.out.println("Let's try again, "+ person);
                break; // Exit if wrong answer
            }
        }
    }
}


