package hexlet.code.games;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

import static hexlet.code.games.Greet.startGreet;

public class Progression {
    // Именованные константы для магических чисел
    private static final int GAME_COUNT = 5; // Параметр для startGreet
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int PROGRESSION_LENGTH = 10; // Длина прогрессии
    private static final int MAX_STEP = 9; // Максимальный шаг прогрессии

    public static void startGameProgression() {
        var person = startGreet(GAME_COUNT);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        for (int j = 0; j < REQUIRED_CORRECT_ANSWERS; j++) {
            // Генерация прогрессии
            String[] progression = new String[PROGRESSION_LENGTH];
            int step = random.nextInt(MAX_STEP) + 1; // Шаг прогрессии от 1 до 9
            progression[0] = Integer.toString(random.nextInt(step)); // Начальное значение

            for (int i = 1; i < progression.length; i++) {
                progression[i] = Integer.toString(Integer.parseInt(progression[i - 1]) + step);
            }

            // Скрытие случайного элемента
            int hiddenPosition = random.nextInt(progression.length);
            int hiddenValue = Integer.parseInt(progression[hiddenPosition]);
            progression[hiddenPosition] = "..";

            // Вывод вопроса
            String progressionString = Arrays.toString(progression)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "");
            System.out.println("Question: " + progressionString);

            // Получение ответа от пользователя
            int answer = scanner.nextInt();

            // Проверка ответа
            if (answer == hiddenValue) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                if (j == REQUIRED_CORRECT_ANSWERS - 1) {
                    System.out.println("Congratulations, " + person + "!");
                }
            } else {
                System.out.println("Your answer: " + answer);
                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.\n", answer, hiddenValue);
                System.out.println("Let's try again, " + person + "!");
                break; // Выход при неправильном ответе
            }
        }
    }
}