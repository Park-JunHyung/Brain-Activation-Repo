package programmers.sorting;

import java.util.Arrays;

public class Sorting01 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] subArray = new int[commands[i][1] - commands[i][0] + 1];
            int index = 0;
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                subArray[index++] = array[j - 1];
            }
            Arrays.sort(subArray);
            answer[i] = subArray[commands[i][2] - 1];
        }

        return answer;
    }
}
