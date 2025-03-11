package hexlet.code.games;

import java.util.Random;


import static hexlet.code.Engine.runGame;

public class Calc {
    // Именованные константы для магических чисел
    private static final int GAME_COUNT = 3; // Параметр для startGreet
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 99; // Максимальное значение для случайных чисел
    private static final int OPERATION_COUNT = 3; // Количество операций (+, -, *)

    public static void startGameCalc() {
        Random random = new Random();
//        var person = startGreet(GAME_COUNT);

        String[] arr = {"+", "-", "*"}; // Возможные операции


        //Параметры для runGame
        String[] question = new String[REQUIRED_CORRECT_ANSWERS];
        String[] correctAnswers = new String[REQUIRED_CORRECT_ANSWERS];
        String rules = "What is the result of the expression?";
        for (var i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            int operation = random.nextInt(OPERATION_COUNT);
            if (arr[operation].equals("+")) {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;

                question[i] = "Question: " + slag1 + " + " + slag2;

//                System.out.println("Question: " + slag1 + " + " + slag2);

                correctAnswers[i] = Integer.toString(slag1 + slag2);
            } else if (arr[operation].equals("-")) {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;

                question[i] = slag1 + " - " + slag2;
                correctAnswers[i] = Integer.toString(slag1 - slag2);
            } else {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;

                question[i] = slag1 + " * " + slag2;
                correctAnswers[i] = Integer.toString(slag1 * slag2);
            }
        }
        runGame(rules, question, correctAnswers, GAME_COUNT);
    }


}

