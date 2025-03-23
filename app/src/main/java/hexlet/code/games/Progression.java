package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.REQUIRED_CORRECT_ANSWERS;
import static hexlet.code.Engine.runGame;

public class Progression {
    // Именованные константы для магических чисел
    private static final int ROWS = 2; // Параметр для массива вопросов и ответов
    private static final int PROGRESSION_LENGTH = 10; // Длина прогрессии
    private static final int MAX_STEP = 9; // Максимальный шаг прогрессии
    private static final Random RAND = new Random();

    public static void startGameProgression() {
        String rules = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[REQUIRED_CORRECT_ANSWERS][ROWS];

        // Генерация вопросов и ответов
        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {

            int firstElement = RAND.nextInt(MAX_STEP) + 1; // Первый элемент прогрессии
            int step = RAND.nextInt(MAX_STEP) + 1; // Шаг прогрессии
            String[] progression = generateProgression(firstElement, step, PROGRESSION_LENGTH); // Генерация прогрессии
            int hiddenPosition = RAND.nextInt(PROGRESSION_LENGTH); // Позиция скрытого элемента
            String hiddenValue = progression[hiddenPosition]; // Значение

            // Скрываем элемент в прогрессии
            progression[hiddenPosition] = "..";

            // Формируем строку для вопросаы
            String progressionString = String.join(" ", progression);

            // Записываем вопрос и ответ в массив
            questionsAndAnswers[i][0] = progressionString;
            questionsAndAnswers[i][1] = hiddenValue;
        }

        // Запуск игры
        runGame(rules, questionsAndAnswers);
    }

    /**
     * Деламе прогрессию.
     *
     * @param firstElement Первый элемент прогрессии
     * @param step         Шаг прогрессии
     * @param length       Длина прогрессии
     * @return Массив, представляющий прогрессию
     */
    public static String[] generateProgression(int firstElement, int step, int length) {
        String[] progression = new String[length];
        progression[0] = Integer.toString(firstElement);

        // Заполняем прогрессию
        for (int i = 1; i < length; i++) {
            progression[i] = Integer.toString(Integer.parseInt(progression[i - 1]) + step);
        }

        return progression;
    }
}
