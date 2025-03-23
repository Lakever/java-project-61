package hexlet.code.games;

import java.util.Random;
import static hexlet.code.Engine.REQUIRED_CORRECT_ANSWERS;
import static hexlet.code.Engine.runGame;

public class Calc {
    // Именованные константы для магических чисел
    private static final int ROWS = 2;
    private static final int MAX_RANDOM_NUMBER = 99; // Максимальное значение для случайных чисел
    private static final String[] OPERATIONS = {"+", "-", "*"}; // Возможные операции

    public static void startGameCalc() {
        Random random = new Random();
        // Инициализируем двумерный массив как представление вопрос-ответ
        String[][] arrayQuestion = new String[REQUIRED_CORRECT_ANSWERS][ROWS];

        // Параметры для runGame
        String rules = "What is the result of the expression?";
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            String operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            // Формируем вопрос
            arrayQuestion[i][0] = "Question: " + slag1 + " " + operation + " " + slag2;
            // Вычисляем ответ
            arrayQuestion[i][1] = Integer.toString(calculate(slag1, slag2, operation));
        }
        runGame(rules, arrayQuestion);
    }

    /**
     * Вычисляет результат выражения.
     *
     * @param slag1     Первое число
     * @param slag2     Второе число
     * @param operation Операция (+, -, *)
     * @return резултьтат операции
     */
    public static int calculate(int slag1, int slag2, String operation) {
        switch (operation) {
            case "+":
                return slag1 + slag2;
            case "-":
                return slag1 - slag2;
            case "*":
                return slag1 * slag2;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operation);
        }
    }
}
