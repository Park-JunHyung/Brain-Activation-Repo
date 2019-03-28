package programmers;

/* [Camouflage]
 * Calculate how much each different clothes can combine another clothes
 * spy must wears at least one cloth
 * */

import java.util.ArrayList;
import java.util.HashMap;

public class hash03 {
    public int solution(String[][] clothes) {
        int answer = 1;

        ArrayList<String> clothList = new ArrayList<>();
        HashMap<String, Integer> clothMap = new HashMap<>();

        for (String[] c : clothes) {
            if (clothMap.containsKey(c[1])) {
                clothMap.put(c[1], clothMap.get(c[1]) + 1);
            } else {
                clothMap.put(c[1], 1);
                clothList.add(c[1]);
            }
        }

        for (String cloth : clothList) {
            answer *= (clothMap.get(cloth) + 1);
        }
        return answer-1;
    }
}
