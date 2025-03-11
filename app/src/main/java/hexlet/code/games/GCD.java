package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.runGame;

public class GCD {
    // Именованные константы для магических чисел
    private static final int GAME_COUNT = 4; // Параметр для startGreet
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел

    public static void startGameGCD() {

        String rules = "Find the greatest common divisor of given numbers.";
        String[] correctAnswers = new String[REQUIRED_CORRECT_ANSWERS];
        String[] question = new String[REQUIRED_CORRECT_ANSWERS];
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

            question[i] = "Question: " + a + " " + b;

            // Алгоритм нахождения НОД Евклида
            while (b != 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            correctAnswers[i] = Integer.toString(a);
        }
        runGame(rules, question, correctAnswers, GAME_COUNT);
    }
}
