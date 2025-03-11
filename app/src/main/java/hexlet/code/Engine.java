package hexlet.code;

import hexlet.code.games.*;

import java.util.Random;
import java.util.Scanner;




public class Engine {
    private static final int REQUIRED_CORRECT_ANSWERS = 3;


    public static void runGame (String rules, String[] question, String[] correctAnswer, int gameNum) {

        var person = Greet.startGreet(gameNum);
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        int countCorrect = 0;// счётчик правильныъ ответов

        System.out.println(rules);
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            System.out.println("Question: " + question[i]);
            String answer = s.nextLine();
            System.out.println("Your Answer: " + answer);

            //Проверка правильности ответов
            if (correctAnswer[i].equals(answer)) {
                countCorrect++;
                System.out.println("Correct!");
                if (countCorrect == REQUIRED_CORRECT_ANSWERS) {
                    System.out.println("Congratulations, " + person + "!");
                }
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + correctAnswer[i] + "'" + ".");
                System.out.println("Let's try again, " + person + "!");
                break;
            }
        }
    }


}
















//    // Именованные константы для выбора игры
//    private static final int EXIT_GAME = 0;
//    private static final int GREET_GAME = 1;
//    private static final int EVAL_GAME = 2;
//    private static final int CALC_GAME = 3;
//    private static final int GCD_GAME = 4;
//    private static final int PROGRESSION_GAME = 5;
//    private static final int PRIME_GAME = 6;
//
//    public static void startEngine() {
//        System.out.println("Please enter the game number and press Enter.");
//        var menu = new Menu();
//        menu.showMenu();
//        Scanner input = new Scanner(System.in);
//        int num = Integer.parseInt(input.nextLine());
//
//        switch (num) {
//            case EXIT_GAME:
//                System.out.println("Goodbye!");
//                break;
//            case GREET_GAME:
//                Greet.startGreet(1);
//                break;
//            case EVAL_GAME:
//                Eval.startGameEval();
//                break;
//            case CALC_GAME:
//                Calc.startGameCalc();
//                break;
//            case GCD_GAME:
//                GCD.startGameGCD();
//                break;
//            case PROGRESSION_GAME:
//                Progression.startGameProgression();
//                break;
//            case PRIME_GAME:
//                Prime.startGamePrime();
//                break;
//            default:
//                System.out.println("Goodbye!");
//        }
//    }
//}
