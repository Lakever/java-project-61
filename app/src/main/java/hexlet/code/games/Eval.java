package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class Eval {
    // Именованные константы для магических чисел
    private static final int GAME_COUNT = 2; // Параметр для startGreet
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное значение для случайных чисел

    public static String startGameEval() {
        var person = startGreet(GAME_COUNT);

        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner s = new Scanner(System.in);
        int countCorrect = 0;

        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = s.nextLine();

            boolean isEven = randomNumber % 2 == 0;
            boolean isCorrect = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));

            if (isCorrect) {
                countCorrect++;
                System.out.println("Correct!");
                if (countCorrect == REQUIRED_CORRECT_ANSWERS) {
                    System.out.println("Congratulations, " + person + "!");
                }
            } else {
                String correctAnswer = isEven ? "yes" : "no";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + person + "!");
                break; // Выход при неправильном ответе
            }
        }
        return "";
    }
}
