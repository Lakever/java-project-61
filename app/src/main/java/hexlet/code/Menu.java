package hexlet.code;

public class Menu {
    public static void showMenu() {
        String[] arr =
                {"1 - Greet",
                        "2 - Eval", "3 - Calc",
                        "4 - GCD",
                        "5 - Progression",
                        "6 - Prime",
                        "0 - Exit"};
        for (var i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
