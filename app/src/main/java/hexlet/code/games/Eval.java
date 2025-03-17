package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.runGame;

public class Eval {
    private static final int ROWS = 2; // Количество правильных ответов для победы
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел

    public static void startGameEval(String person) {
        Random random = new Random();
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

//        String[] questions = new String[REQUIRED_CORRECT_ANSWERS];
//        String[] correctAnswers = new String[REQUIRED_CORRECT_ANSWERS];
        String[][] arrayQuestion = new String[ROWS][REQUIRED_CORRECT_ANSWERS];

        // Формируем вопросы и ответы
        for (int i = 0; i < ROWS; i++) {
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;

            arrayQuestion[0][i] = Integer.toString(randomNumber);
            arrayQuestion[1][i] = (randomNumber % 2 == 0) ? "yes" : "no";
        }

        // Запускаем движок
        runGame(rules, arrayQuestion, person);
    }
}
