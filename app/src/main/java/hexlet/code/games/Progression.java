package hexlet.code.games;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class Progression {
    public static void startGameProgression() {
        var person = startGreet(5);

        for (int j = 0; j < 3; j++) {
            System.out.println("What number is missing in the progression?");

            String[] arr = new String[10];
            Random random = new Random();
            int raznost = random.nextInt(9) + 1;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    arr[i] = Integer.toString(random.nextInt(raznost));
                } else {
                    arr[i] = Integer.toString(Integer.parseInt(arr[i - 1]) + raznost);
                }
            }


            int randPosition = random.nextInt(arr.length);
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == randPosition) {
                    temp = Integer.parseInt(arr[i]);
                    arr[i] = "..";
                }
            }
            //Печать массива
            var array = Arrays.toString(arr);
            array =  array.replace("[", "").replace("]", "").replace(",", "");
//            String result = String.join(" ",array);
//            System.out.println("TEST " + result);
            System.out.println("Question: " + array);


            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == temp) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                if (j == 2) {
                    System.out.println("Congratulations, " + person + "!");
                }
            } else {
                System.out.println("Your answer: " + answer);
                System.out.printf("'%d' is wrong answer ;(. "
                        + "Correct answer was '%s'.\n" + "Let's try again, "
                        + person + "!", answer, temp);
                break;
            }
        }
    }
}
