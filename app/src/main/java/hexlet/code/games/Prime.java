package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class Prime {
    public static void startGamePrime() {
        var person = startGreet(6);
        int count = 0;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (var j = 0; j < 3; j ++) {
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);


            int randNum = rand.nextInt(100) + 1;
            System.out.println("Question: " + randNum);

            String answer = scanner.nextLine();
            String status = "";

            if (randNum < 2) {
                status = "no"; // 0 и 1 не являются простыми числами
            } else if (randNum == 2 || randNum == 3) {
                status = "yes"; // 2 и 3 — простые числа
            } else if (randNum % 2 == 0 || randNum % 3 == 0) {
                status = "no"; // Числа, делящиеся на 2 или 3, не являются простыми
            } else {
                status = "yes"; // Предполагаем, что число простое, пока не найдём делитель
                for (int i = 5; i * i <= randNum; i += 6) {
                    if (randNum % i == 0 || randNum % (i + 2) == 0) {
                        status = "no"; // Если делитель найден, число не простое
                        break; // Прерываем цикл, так как дальнейшая проверка не нужна
                    }
                }
            }

            if (answer.equalsIgnoreCase(status)) {
                System.out.printf("Your answer: '%s'\n", answer);
                System.out.println("Correct!");
                count++;
                if (count == 3) {
                    System.out.println("Congratulations, " + person + "!");
                }
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + status + "'" + ".");
                System.out.println("Let's try again, " + person + "!");
                break;
            }

        }


    }
}