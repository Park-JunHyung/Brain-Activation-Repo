package programmers.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class Sorting02 {
    public String solution(int[] numbers) {
        String answer = "";

        String[] compareArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            String target = String.valueOf(numbers[i]);
            while (target.length() <= 4) {
                target += target;
            }
            compareArray[i] = target.substring(0, 4) + String.valueOf(i);

        }
        Arrays.sort(compareArray);
        for (int i = numbers.length - 1; i >= 0; i--) {
            int index= Integer.parseInt(compareArray[i].substring(4));
            answer += String.valueOf(numbers[index]);
        }
        while (true) {
            if (answer.charAt(0) != '0' || answer.length() == 1)
                break;
            answer = answer.substring(1);
        }

        return answer;
    }
}
