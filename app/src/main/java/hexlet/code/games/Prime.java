package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.runGame;

public class Prime {
    // Именованные константы для магических чисел
    private static final int ROWS = 2;
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел
    private static final int MIN_RANDOM_NUMBER = 1; // Минимальное значение для случайных чисел

    public static void startGamePrime(String person) {

        String[][] arrayQuestion = new String[ROWS][REQUIRED_CORRECT_ANSWERS];

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        Random random = new Random();

        // Генерация вопросов и ответов
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;
            arrayQuestion[0][i] = Integer.toString(randomNumber);
            arrayQuestion[1][i] = isPrime(randomNumber) ? "yes" : "no";
        }

        // Запуск игры
        runGame(rules, arrayQuestion, person);
    }

    // Провека числа на простоту
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // 0 и 1 не являются простыми числами
        }
        if (number == 2 || number == 3) {
            return true; // 2 и 3 — простые числа
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Числа, делящиеся на 2 или 3, не являются простыми
        }
        // Проверка делителей от 5 до квадратного корня из числа
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true; // Если делителей нет, число простое
    }
}
