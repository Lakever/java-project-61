package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.REQUIRED_CORRECT_ANSWERS;
import static hexlet.code.Engine.runGame;

public class Prime {
    // Именованные константы для магических чисел
    private static final int ROWS = 2;
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел
    private static final int MIN_RANDOM_NUMBER = 1; // Минимальное значение для случайных чисел
    private static final int MAGICK_DEL3 = 3;
    private static final int MAGICK_DEL5 = 5;
    private static final int MAGICK_DEL6 = 6;


    public static void startGamePrime() {

        String[][] arrayQuestion = new String[REQUIRED_CORRECT_ANSWERS][ROWS];

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        Random random = new Random();

        // Генерация вопросов и ответов
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;
            arrayQuestion[i][0] = Integer.toString(randomNumber);
            arrayQuestion[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }

        // Запуск игры
        runGame(rules, arrayQuestion);
    }

    // Провека числа на простоту
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // 0 и 1 не являются простыми числами
        }
        if (number == 2 || number == MAGICK_DEL3) {
            return true; // 2 и 3 — простые числа
        }
        if (number % 2 == 0 || number % MAGICK_DEL3 == 0) {
            return false; // Числа, делящиеся на 2 или 3, не являются простыми
        }
        // Проверка делителей от 5 до квадратного корня из числа
        for (int i = MAGICK_DEL5; i * i <= number; i += MAGICK_DEL6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true; // Если делителей нет, число простое
    }
}
