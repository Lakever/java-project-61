package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Eval;
import hexlet.code.games.Greet;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void startEngine() {
        System.out.println("Please enter the game number and press Enter.");
        var menu = new Menu();
        menu.showMenu();
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
//        System.out.println("Your choice: " + num);

        switch (num) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                Greet.startGreet(1);
                break;

            case 2:
                Eval.startGameEval();
                break;
            case 3:
                Calc.startGameCalc();

        }

    }



//    public String gameEval(String person) {
//
//        Random random = new Random();
//
//        System.out.println("Answer 'Yes' if the number is even, otherwise answer 'No'.");
//
//
//        Scanner s = new Scanner(System.in);
//        int countCorrect = 0;
//        for (int i = 0; i < 3; i++) {
//            int randomNumber = random.nextInt(100);
//            System.out.println("Question: " + randomNumber);
//            System.out.println("Your answer: ");
//            String answer = s.nextLine();
//            if (answer.equals("Yes") && randomNumber % 2 == 0) {
//                System.out.println("Correct!");
//                countCorrect ++;
//            } else if (answer.equals("No") && randomNumber % 2 != 0) {
//                countCorrect ++;
//                System.out.println("Correct!");
//            } else {
//                System.out.println("'Yes' is wrong answer ;(. Correct answer was 'No'." +
//                        "Let's try again, " + person);
//                break;
//            }
//        }
//        if (countCorrect == 3) {
//            return "Congratulations, " + person;
//        }
//        return "";
//    }
//    public String gameCalc(String person) {
//        return "";
//    }

}
