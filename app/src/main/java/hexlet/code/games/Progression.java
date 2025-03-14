package hexlet.code.games;

import java.util.Random;
import java.util.Arrays;

import static hexlet.code.Engine.runGame;

public class Progression {
    // Именованные константы для магических чисел
    private static final int GAME_COUNT = 5; // Параметр для startGreet
    private static final int REQUIRED_CORRECT_ANSWERS = 3; // Количество правильных ответов для победы
    private static final int PROGRESSION_LENGTH = 10; // Длина прогрессии
    private static final int MAX_STEP = 9; // Максимальный шаг прогрессии

    public static void startGameProgression(String person) {
        String rules = "What number is missing in the progression?";
        String[] question = new String[REQUIRED_CORRECT_ANSWERS];
        String[] correctAnswers = new String[REQUIRED_CORRECT_ANSWERS];

        Random random = new Random();

        System.out.println();

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
            correctAnswers[j] = progression[hiddenPosition];
            progression[hiddenPosition] = "..";

            // Вывод вопроса
            String progressionString = Arrays.toString(progression)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "");
            question[j] = progressionString;

        }
        runGame(rules, question, correctAnswers, person);
    }
}
