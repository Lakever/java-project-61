package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class Calc {
    public static void startGameCalc() {
        Random random = new Random();
        var person = startGreet(3);




        int result = 0;
        String[] arr = {"+", "-", "*"}; // Возможные операции
        int count = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("What is the result of the expression?");
        for (var i = 0; i < 3; i ++) {
            int lol = random.nextInt(2);
            if (arr[lol].equals("+")) {
                int slag1 = random.nextInt(99);
                int slag2 = random.nextInt(99);

                System.out.println("Question: " + slag1 + " + " + slag2);

                result = slag1 + slag2;
                int res = s.nextInt();
                System.out.println("Your answer: " + res);

                if (res == result) {
                    System.out.println("Correct!");
                }else {
                    System.out.println("'"+ res +"'" + "is wrong answer ;(. Correct answer was "+ "'" + result + "'" +".");
                    System.out.println("Let's try again, " + person);
                    break;
                }
                System.out.println(res);
            } else if (arr[lol].equals("-")) {
                int slag1 = random.nextInt(99);
                int slag2 = random.nextInt(99);

                System.out.println("Question: " + slag1 + " - " + slag2);

                result = slag1 - slag2;
                int res = s.nextInt();
                System.out.println("Your answer: " + res);

                if (res == result) {
                    System.out.println("Correct!");
                }else {
                    System.out.println("'"+ res +"'" + "is wrong answer ;(. Correct answer was "+ "'" + result + "'" +".");
                    System.out.println("Let's try again, " + person);
                    break;
                }
            } else {
                int slag1 = random.nextInt(99);
                int slag2 = random.nextInt(99);

                System.out.println("Question: " + slag1 + " * " + slag2);

                result = slag1 * slag2;
                int res = s.nextInt();
                System.out.println("Your answer: " + res);

                if (res == result) {
                    System.out.println("Correct!");
                }else {
                    System.out.println("'"+ res +"'" + "is wrong answer ;(. Correct answer was "+ "'" + result + "'" +".");
                    System.out.println("Let's try again, " + person);
                    break;
                }
            }
            System.out.println("Congratulations "+ person + "!");
        }

//        if (arr[lol].equals("+")) {
//            result = slag1 + slag2;
//            System.out.println(result);
//        } else if (arr[lol].equals("-")) {
//            result = slag1 - slag2;
//            System.out.println(result);
//        } else {
//            result = slag1 * slag2;
//            System.out.println(result);
//        }

//        for (int i = 0; i < arr.length; i++) {
//
//        }


    }
}
