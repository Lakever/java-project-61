package hexlet.code;

import hexlet.code.games.Eval;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int EXIT_GAME = 0;
    private static final int EVAL_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        startApp();
    }

    // Запуск движка игр
    public static void startApp() {
        System.out.println("Please enter the game number and press Enter.");
        showMenu();

        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        // Приветствие пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String person = input.nextLine();
        System.out.println("Hello, " + person + "!");

        switch (num) {
            case EXIT_GAME:
                System.out.println("Goodbye!");
                break;
            case EVAL_GAME:
                Eval.startGameEval(person);
                break;
            case CALC_GAME:
                Calc.startGameCalc(person);
                break;
            case GCD_GAME:
                GCD.startGameGCD(person);
                break;
            case PROGRESSION_GAME:
                Progression.startGameProgression(person);
                break;
            case PRIME_GAME:
                Prime.startGamePrime(person);
                break;
            default:
                System.out.println("Goodbye!");
        }
    }

    public static void showMenu() {
        String[] arr = {"1 - Greet", "2 - Eval", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};
        for (var i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
