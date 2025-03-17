package hexlet.code.games;

import java.util.Random;


import static hexlet.code.Engine.runGame;

public class Calc {
    // Именованные константы для магических чисел
    private static final int ROWS = 2;
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 99; // Максимальное значение для случайных чисел
    private static final int OPERATION_COUNT = 3; // Количество операций (+, -, *)

    public static void startGameCalc(String person) {
        Random random = new Random();
//        var person = startGreet(GAME_COUNT);
        // Инициализируем двумерный массив как представление вопрос- ответ
        String[][] arrayQuestion = new String[ROWS][REQUIRED_CORRECT_ANSWERS];

        String[] arr = {"+", "-", "*"}; // Возможные операции


        //Параметры для runGame
        String rules = "What is the result of the expression?";
        for (int i = 0; i < ROWS; i++) {
            int operation = random.nextInt(OPERATION_COUNT);
            if (arr[operation].equals("+")) {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                // Вопрос
                arrayQuestion[0][i] = "Question: " + slag1 + " + " + slag2;
                // Ответ
                arrayQuestion[1][i] = Integer.toString(slag1 + slag2);

            } else if (arr[operation].equals("-")) {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;

                // Вопрос
                arrayQuestion[0][i] = "Question: " + slag1 + " - " + slag2;
                // Ответ
                arrayQuestion[1][i] = Integer.toString(slag1 - slag2);

            } else {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;

                // Вопрос
                arrayQuestion[0][i] = "Question: " + slag1 + " * " + slag2;
                // Ответ
                arrayQuestion[1][i] = Integer.toString(slag1 * slag2);
            }
        }
        runGame(rules, arrayQuestion, person);
    }


}

