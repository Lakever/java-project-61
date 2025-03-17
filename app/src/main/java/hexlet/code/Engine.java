package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int REQUIRED_CORRECT_ANSWERS = 3;

    public static void runGame(String rules, String[][] arrayQuestions, String person) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(rules);

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < REQUIRED_CORRECT_ANSWERS; j++) {
                System.out.println("Question: " + arrayQuestions[i][j]);
                String answer = scanner.nextLine();
                System.out.println("Your answer: " + answer);

                if (arrayQuestions[1][j].equals(answer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + arrayQuestions[1][j] + "'.");
                    System.out.println("Let's try again, " + person + "!");
                    return;
                }
            }
        }

        System.out.println("Congratulations, " + person + "!");
    }
}
