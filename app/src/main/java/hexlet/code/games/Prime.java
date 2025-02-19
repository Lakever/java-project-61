package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class Prime {
    public static void startGamePrime() {
        var person = startGreet(6);

        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println(randNum + " is a simple num?");
        System.out.println("Vote 'Yes' or 'No'");

        String answer = scanner.nextLine();
        String status = "";

        if (randNum == 2 || randNum == 3) { // исключаем начальные числа(они просты по определению)
            status = "Yes";
            if (answer.equals(status)) {
                System.out.println("Correct, our congratulations, " + person);
            } else {
                System.out.println("Uncorrected, let's try again");
            }
        } else if (randNum % 2 == 0 || randNum % 3 == 0) {// делятся? -> Непростые
            status = "No";
            if (answer.equals(status)) {
                System.out.println("Correct, it is a not simple num");
            } else {
                System.out.println("Uncorrected, it is a simple num ,let's try again");
            }
        } else {
            for (int i = 5; i < randNum; i += 6) { // Проверяем делители, если есть -> Непростое
                if (randNum % i == 0) {
                    status = "No";// Непростое число
                    break;
                } else { // Если таких не найдено, считаем, что простое
                    status = "Yes";
                }
            }
            if (answer.equals(status)) {
                System.out.println("Correct, our congratulations, " + person + ", its a simple num");
            } else {
                System.out.println("Uncorrected, it is a simple num ,let's try again");
            }
        }
    }
}
