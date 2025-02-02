
package hexlet.code;

public class App {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = Cli.greetings();
        System.out.println("Hello, " + name + "!");

    }
}