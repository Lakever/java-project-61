package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.runGame;
import static hexlet.code.games.Greet.startGreet;

public class Eval {
    // Именованные константы для магических чисел
    private static final int GAME_NUM = 2; // Параметр для startGreet
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел

    public static void startGameEval() {
//        var person = startGreet(GAME_COUNT);

        Random random = new Random();
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

//        Scanner s = new Scanner(System.in);
//        int countCorrect = 0;
        String[] question = new String[REQUIRED_CORRECT_ANSWERS];
        String[] correctAnswer = new String[REQUIRED_CORRECT_ANSWERS];

        //Нужно сформировать ответы для передачи их в engine
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);
            question[i] = Integer.toString(randomNumber);

            // Нужно проверить правильны ли ответы для передачи их в engine
            if (Integer.parseInt(question[i]) % 2 == 0) {
                correctAnswer[i] = "yes";
            } else {
                correctAnswer[i] = "no";
            }
        }

        //ЗАПУСКАЕМ ДВИГАТЕЛЬ!!!
        runGame(rules, question, correctAnswer,GAME_NUM);
    }
}
