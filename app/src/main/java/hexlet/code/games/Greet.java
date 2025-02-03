package hexlet.code.games;

import hexlet.code.Cli;

public class Greet {
    private String person;
    public Greet() {

    }





    public String greet (int num) {

        System.out.println("Your choise: " + num );
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String person = Cli.greetings();

        return person;
    }
}
