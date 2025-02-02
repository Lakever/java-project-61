package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int num;
    private String name;

    public Game(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }



    public String gameEval(String person) {

        Random random = new Random();

        System.out.println("Answer 'Yes' if the number is even, otherwise answer 'No'.");


        Scanner s = new Scanner(System.in);
        int countCorrect = 0;
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            String answer = s.nextLine();
            if (answer.equals("Yes") && randomNumber % 2 == 0) {
                System.out.println("Correct!");
                countCorrect ++;
            } else if (answer.equals("No") && randomNumber % 2 != 0) {
                countCorrect ++;
                System.out.println("Correct!");
            } else {
                System.out.println("'Yes' is wrong answer ;(. Correct answer was 'No'." +
                        "Let's try again, " + person);
                break;
            }
        }
        if (countCorrect == 3) {
            return "Congratulations, " + person;
        }
        return "";
    }
}
