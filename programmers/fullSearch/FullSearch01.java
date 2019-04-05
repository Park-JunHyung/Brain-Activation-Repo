package programmers.fullSearch;

public class FullSearch01 {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] giveUpMath1 = new int[answers.length];
        int[] giveUpMath2 = new int[answers.length];
        int[] giveUpMath3 = new int[answers.length];

        int[] giveUpMath2Pattern = {1, 3, 4, 5};
        int[] giveUpMath3Pattern = {3, 1, 2, 4, 5};
        int[] countArray = new int[3];
        int countPattern2 = 0;
        int countPattern3 = -1;
        int pattern3Index = 0;
        for (int i = 0; i < answers.length; i++) {
            giveUpMath1[i] = (i) % 5 + 1;
            if (i % 2 == 0) {
                giveUpMath2[i] = 2;
            } else {
                if (countPattern2 >= giveUpMath2Pattern.length)
                    countPattern2 = 0;
                giveUpMath2[i] = giveUpMath2Pattern[countPattern2];
                countPattern2++;
            }
            if (countPattern3 < 1) {
                countPattern3++;
            } else {
                pattern3Index++;
                countPattern3 = 0;
            }
            giveUpMath3[i] = giveUpMath3Pattern[(pattern3Index) % 5];
        }
        for (int i = 0; i < answers.length; i++) {
            if (giveUpMath1[i] == answers[i]) countArray[0]++;
            if (giveUpMath2[i] == answers[i]) countArray[1]++;
            if (giveUpMath3[i] == answers[i]) countArray[2]++;
        }
        int bigNumber = -1;
        int answerSize = 1;
        for (int i = 0; i < countArray.length; i++) {
            if (bigNumber <= countArray[i]) {
                if (bigNumber == countArray[i])
                    answerSize++;
                bigNumber = countArray[i];
            }
        }
        answer = new int[answerSize];
        int answerIndex = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (bigNumber == countArray[i])
                answer[answerIndex++] = i + 1;
        }

        return answer;
    }
}
