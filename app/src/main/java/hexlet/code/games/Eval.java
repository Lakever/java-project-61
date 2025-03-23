package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.REQUIRED_CORRECT_ANSWERS;
import static hexlet.code.Engine.runGame;

public class Eval {

    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел

    public static void startGameEval() {
        Random random = new Random();
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        // Массив для хранения пар вопрос-ответ
        String[][] questionsAndAnswers = new String[REQUIRED_CORRECT_ANSWERS][2];

        // Формируем вопросы и ответы
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            questionsAndAnswers[i][0] = Integer.toString(randomNumber); // Вопрос
            questionsAndAnswers[i][1] = (randomNumber % 2 == 0) ? "yes" : "no"; // Ответ
        }

        // Запускаем движок
        runGame(rules, questionsAndAnswers);
    }
}
