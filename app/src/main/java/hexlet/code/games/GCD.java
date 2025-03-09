package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class GCD {
    // Именованные константы для магических чисел
    private static final int GAME_COUNT = 4; // Параметр для startGreet
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел

    public static void startGameGCD() {
        var person = startGreet(GAME_COUNT);

        int countCorrect = 0;
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            Random random = new Random();

            int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            int a = 0;
            int b = 0;
            int temp = 0;

            if (slag1 > slag2) {
                b = slag1;
                a = slag2;
            } else {
                a = slag2;
                b = slag1;
            }

            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + a + " " + b);

            // Алгоритм нахождения НОД Евклида
            while (b != 0) {
                temp = b;
                b = a % b;
                a = temp;
            }

            // Тут берем ответ от пользователя
            Scanner s = new Scanner(System.in);
            int answer = s.nextInt();

            if (answer == a) {
                countCorrect++;
                System.out.println("Correct!");
            } else {
                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.\n", answer, a);
                System.out.println("Let's try again, " + person + "!");
                break; // Выход при неправильном ответе
            }
        }

        if (countCorrect == REQUIRED_CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + person + "!");
        }
    }
}
