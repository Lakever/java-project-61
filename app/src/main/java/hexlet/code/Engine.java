package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int REQUIRED_CORRECT_ANSWERS = 3;

    public static void runGame(String rules, String[][] arrayQuestions) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String person = input.nextLine();
        System.out.println("Hello, " + person + "!");

        Scanner scanner = new Scanner(System.in);
        System.out.println(rules);
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            System.out.println("Question: " + arrayQuestions[i][0]);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            if (arrayQuestions[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + arrayQuestions[i][1] + "'.");
                System.out.println("Let's try again, " + person + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + person + "!");
    }
    public static String greetings() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String person = input.nextLine();
        System.out.println("Hello, " + person + "!");
        return person;
    }
}
