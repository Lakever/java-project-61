package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int REQUIRED_CORRECT_ANSWERS = 3;

    public static void runGame(String rules, String[] questions, String[] correctAnswers, String person) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(rules);

        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            System.out.println("Question: " + questions[i]);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            if (correctAnswers[i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + person + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + person + "!");
    }
}
