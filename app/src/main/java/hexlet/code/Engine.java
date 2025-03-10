//package hexlet.code;
//
//import hexlet.code.games.Calc;
//import hexlet.code.games.Eval;
//import hexlet.code.games.GCD;
//import hexlet.code.games.Greet;
//import hexlet.code.games.Prime;
//import hexlet.code.games.Progression;
//
//import java.util.Scanner;
//
//public class Engine {
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
