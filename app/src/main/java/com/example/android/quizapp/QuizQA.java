package com.example.android.quizapp;

import java.util.Arrays;

/**
 * Created by utom on 12.04.17.
 */

public final class QuizQA {
    private static final int numGroups = 3;
    private static final int numQuestions = 3;
    private String CorrectAnswersTypes[][] = {{"single", "single", "text"},
            {"multi", "single", "text"},
            {"single", "multi", "text"}};
    private String CorrectAnswers[][] = {{"C", "C", "Integrated Development Environment"},
            {"BD", "B", "ScrollView"},
            {"C", "CD", "acmeAddress1"}};
    private String Answers[][] = new String[numGroups][numQuestions];

    /**
     * @param Group
     * @param Question
     * @return
     */
    public String getCorrectAnswer(int Group, int Question) {
        return CorrectAnswers[Group - 1][Question - 1];
    }

    /**
     * @param Group
     * @param Question
     * @param Answer
     */
    public void putAnswer(int Group, int Question, String Answer) {
        String refType = CorrectAnswersTypes[Group - 1][Question - 1];

        if (refType.equals("multi")) {
            try {
                char[] chars = Answers[Group - 1][Question - 1].concat(Answer).toCharArray();
                Arrays.sort(chars);
                Answers[Group - 1][Question - 1] = String.valueOf(chars);
            } catch (NullPointerException except) {
                Answers[Group - 1][Question - 1] = Answer;
            }
        } else
            Answers[Group - 1][Question - 1] = Answer;
    }

    public void delAnswer(int Group, int Question, String Answer) {
        String refType = CorrectAnswersTypes[Group -1 ][Question - 1];

        if (refType.equals("multi"))
            Answers[Group - 1][Question - 1] = Answers[Group - 1][Question - 1].replace(Answer,"");
        else Answers[Group - 1][Question - 1] = "";
    }
    /**
     * @param Group
     * @param Question
     * @param Answer
     * @return
     */
    public boolean checkAnswer(int Group, int Question, String Answer) {
        return Answer.equals(CorrectAnswers[Group - 1][Question - 1]);
    }

    public boolean checkQuiz() {
        for (int i = 1; i <= numGroups; i++)
            for (int j = 1; j <= numQuestions; j++)
                if (!checkAnswer(i, j, Answers[i - 1][j - 1])) return false;
        return true;
    }
}
