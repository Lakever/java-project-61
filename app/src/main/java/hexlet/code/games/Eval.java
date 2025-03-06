package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


import static hexlet.code.games.Greet.startGreet;

public class Eval {
    public static String startGameEval() {


        var person = startGreet(2);


        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


        Scanner s = new Scanner(System.in);
        int countCorrect = 0;
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);

            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            String answer = s.nextLine();

            if (answer.equals("yes") && randomNumber % 2 == 0) {
                System.out.println("Correct!");
                countCorrect++;
                if (countCorrect == 3) {

                    System.out.println("Congratulations, " + person + "!");
                }
            } else if (answer.equals("no") && randomNumber % 2 != 0) {
                countCorrect++;
                System.out.println("Correct!");
                if (countCorrect == 3) {

                    System.out.println("Congratulations, " + person + "!");
                }
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'."
                        + " Let's try again, " + person);
                break;
            }
        }
        return  "";

    }
}
