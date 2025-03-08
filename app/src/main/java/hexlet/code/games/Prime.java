package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;


// На самом деле, сейчас уже вижу что,
// можно было вынести логику определения простого числа в отдельный метод
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
                System.out.printf("Your answer: '%d'", answer);
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'Yes'" + ".");
                System.out.println("Let's try again, " + person + "!");
            }
        } else if (randNum % 2 == 0 || randNum % 3 == 0) { // делятся? -> Непростые
            status = "No";
            if (answer.equals(status)) {
                System.out.printf("Your answer: '%d'", answer);
                System.out.println("Correct!");
            } else {
//
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'Yes'" + ".");
                System.out.println("Let's try again, " + person + "!");
            }
        } else {
            for (int i = 5; i * i <= randNum; i += 6) { // Проверяем делители, если есть -> Непростое
                if (randNum % i == 0) {
                    status = "No"; // Непростое число
                    break;
                } else { // Если таких не найдено, считаем, что простое
                    status = "Yes";
                }
            }
            if (answer.equals(status)) {
                System.out.printf("Your answer: '%d'", answer);
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'Yes'" + ".");
                System.out.println("Let's try again, " + person + "!");
            }
        }
    }
}
