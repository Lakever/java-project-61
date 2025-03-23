package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.REQUIRED_CORRECT_ANSWERS;

public class GCD {
    // Именованные константы для магических чисел
    private static final int ROWS = 2;
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел

    public static void startGameGCD() {


        String[][] arrayQuestion = new String[ROWS][REQUIRED_CORRECT_ANSWERS];
        String rules = "Find the greatest common divisor of given numbers.";
//        String[] correctAnswers = new String[REQUIRED_CORRECT_ANSWERS];
//        String[] question = new String[REQUIRED_CORRECT_ANSWERS];
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            Random random = new Random();

            int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            int a = 0;
            int b = 0;

            if (slag1 > slag2) {
                b = slag1;
                a = slag2;
            } else {
                a = slag2;
                b = slag1;
            }

            arrayQuestion[i][0] = "Question: " + a + " " + b;

            var res = algEvklid(a, b);
            arrayQuestion[i][1] = Integer.toString(res);
        }
        runGame(rules, arrayQuestion);
    }

    public static int algEvklid(Integer a, Integer b) {
        // Алгоритм нахождения НОД Евклида
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
