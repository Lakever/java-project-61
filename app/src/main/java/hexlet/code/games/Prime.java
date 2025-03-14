package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.runGame;


public class Prime {
    // Именованные константы для магических чисел
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел
    private static final int USUAL_SIMPLE_NUM_3 = 3; // Всё ниже добавил из-за ругани checkStyle'a
    private static final int USUAL_SIMPLE_NUM_2 = 2;
    private static final int USUAL_DELITEL_5 = 5;
    private static final int USUAL_DELITEL_6 = 6;

    public static void startGamePrime(String person) {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] question = new String[REQUIRED_CORRECT_ANSWERS];
        String[] correctAnswers = new String[REQUIRED_CORRECT_ANSWERS];

        Random rand = new Random();

        for (var j = 0; j < REQUIRED_CORRECT_ANSWERS; j++) {
            int randNum = rand.nextInt(MAX_RANDOM_NUMBER) + 1;
            question[j] = "Question: " + randNum;

            if (randNum < 2) {
                correctAnswers[j] = "no"; // 0 и 1 не являются простыми числами
            } else if (randNum == USUAL_SIMPLE_NUM_2 || randNum == USUAL_SIMPLE_NUM_3) {
                correctAnswers[j] = "yes"; // 2 и 3 — простые числа
            } else if (randNum % USUAL_SIMPLE_NUM_2 == 0 || randNum % USUAL_SIMPLE_NUM_3 == 0) {
                correctAnswers[j] = "no"; // Числа, делящиеся на 2 или 3, не являются простыми
            } else {
                correctAnswers[j] = "yes"; // Предполагаем, что число простое, пока не найдём делитель
                for (int i = USUAL_DELITEL_5; i * i <= randNum; i += USUAL_DELITEL_6) {
                    if (randNum % i == 0 || randNum % (i + 2) == 0) {
                        correctAnswers[j] = "no"; // Если делитель найден, число не простое
                        break; // Прерываем цикл, так как дальнейшая проверка не нужна
                    }
                }
            }

        }
        runGame(rules, question, correctAnswers, person);
    }
}
