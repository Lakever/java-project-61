
package hexlet.code;


public class App {
    public static void main(String[] args) {


        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Eval");
        System.out.println("0 - Exit");
        int num = Integer.parseInt(ChoseGame.choiseNum()); //Взять номер игры
        switch (num) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:

                var greet = new Greet();
                System.out.println("Hello, " + greet.greet(1) + "!"); //Если "1" - просто Приветствие
                break;
            // Либо действие подтверждающее выход или команда дальше
            // Возможно выдать новый список без Greet
            case 2: // Игра Eval
                var greet2 = new Greet(); //Приветствие
                //System.out.println(greet2.greet(2));
                var game = new Game(2); //
                var playing = game.gameEval(greet2.greet(2)); // Игра, с параметром greet, там хранится Текущее имя нашего игрока
                System.out.println(playing);
                break;


        }
//        if (num == 0) {
//            System.out.println("Goodbye!");
//        }else {
//            System.out.println("Your choise: " + num );
//            System.out.println("Welcome to the Brain Games!");
//            System.out.println("May I have your name?");
//            String name = Cli.greetings();
//            System.out.println("Hello, " + name + "!");
//        }
    }
}