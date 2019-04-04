package programmers.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class sorting02 {
    public String solution(int[] numbers) {
        String answer = "";

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] compareArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            String target = String.valueOf(numbers[i]);
            while (target.length() <= 4) {
                target += target;
            }
            compareArray[i] = Integer.parseInt(target.substring(0, 4));
            map.put(i, compareArray[i]);
        }
        Arrays.sort(compareArray);
        for (int i = numbers.length - 1; i >= 0; i--) {
            for (Integer k:map.keySet()){
                if (map.get(k)==compareArray[i]){
                    answer += String.valueOf(numbers[k]);
                    map.remove(k);
                    break;
                }
            }
        }
        while (true){
            if (answer.charAt(0)!='0'||answer.length()==1)
                break;
            answer=answer.substring(1);
        }

        return answer;
    }
}
