package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class Calc {
    // Именованные константы для магических чисел
    private static final int GAME_COUNT = 3; // Параметр для startGreet
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 99; // Максимальное значение для случайных чисел
    private static final int OPERATION_COUNT = 3; // Количество операций (+, -, *)

    public static void startGameCalc() {
        Random random = new Random();
        var person = startGreet(GAME_COUNT);

        int result = 0;
        String[] arr = {"+", "-", "*"}; // Возможные операции
        int countCorrect = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("What is the result of the expression?");
        for (var i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            int lol = random.nextInt(OPERATION_COUNT);
            if (arr[lol].equals("+")) {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;

                System.out.println("Question: " + slag1 + " + " + slag2);

                result = slag1 + slag2;
                int res = s.nextInt();

                System.out.println("Your answer: " + res);

                if (res == result) {
                    countCorrect++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + res + "'" + " is wrong answer ;(. "
                            + "Correct answer was " + "'" + result + "'" + ".");
                    System.out.println("Let's try again, " + person + "!");
                    break;
                }
            } else if (arr[lol].equals("-")) {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;

                System.out.println("Question: " + slag1 + " - " + slag2);

                result = slag1 - slag2;
                int res = s.nextInt();
                System.out.println("Your answer: " + res);

                if (res == result) {
                    countCorrect++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + res + "'" + " is wrong answer ;(. "
                            + "Correct answer was " + "'" + result + "'" + ".");
                    System.out.println("Let's try again, " + person + "!");
                    break;
                }
            } else {
                int slag1 = random.nextInt(MAX_RANDOM_NUMBER) + 1;
                int slag2 = random.nextInt(MAX_RANDOM_NUMBER) + 1;

                System.out.println("Question: " + slag1 + " * " + slag2);

                result = slag1 * slag2;
                int res = s.nextInt();
                System.out.println("Your answer: " + res);

                if (res == result) {
                    countCorrect++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + res + "'" + " is wrong answer ;(. "
                            + "Correct answer was " + "'" + result + "'" + ".");
                    System.out.println("Let's try again, " + person + "!");
                    break;
                }
            }
        }

        if (countCorrect == REQUIRED_CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + person + "!");
        }
    }
}
