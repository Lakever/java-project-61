package hexlet.code.games;

import hexlet.code.Cli;

public class Greet {
    private static String person;
    public Greet() {
    }

    public static String startGreet(int num) {

        System.out.println("Your choise: " + num);
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        person = Cli.greetings();
        System.out.println("Hello, " + person + "!");
        return person;


    }

}
