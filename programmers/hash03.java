package programmers;

/* [Camouflage]
 * Calculate how much each different clothes can combine another clothes
 * spy must wears at least one cloth
 * */

import java.util.ArrayList;
import java.util.HashMap;

public class hash03 {
    public int solution(String[][] clothes) {
        int answer = 0;

        ArrayList<String> clothList = new ArrayList<>();
        ArrayList<Integer> sumList = new ArrayList<>();
        HashMap<String, Integer> clothMap = new HashMap<>();

        for (String[] c : clothes) {
            if (clothMap.containsKey(c[1])) {
                clothMap.put(c[1], clothMap.get(c[1]) + 1);
            } else {
                clothMap.put(c[1], 1);
                clothList.add(c[1]);
            }
        }

        int i, j,count=0,value=1;
        int max = 1 << clothList.size();
        for (i = 0; i < max; i++) {
            for (j = 0; j < clothMap.size(); j++) {
                int tmp = i & (1 << j);
                if (tmp != 0){
                    count++;
                    value*=clothMap.get(clothList.get(j));
                    System.out.println(clothList.get(j)+value+" ");
                }
            }
            if (count==0)
                value=0;
            sumList.add(count,value);
            count=0;
            value=1;
        }
        for (int x=0;x<sumList.size();x++){
            answer+=sumList.get(x);
        }

        return answer;
    }
}
