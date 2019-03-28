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

        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int n;
        boolean[] include;

        for (String[] c : clothes) {
            if (map.containsKey(c[1])) {
                map.put(c[1], map.get(c[1]) + 1);
            } else {
                map.put(c[1], 1);
                list.add(c[1]);
            }
        }
        n = map.size();
        include = new boolean[n];
        answer = powerSet(0, include, map, list, n);
        return answer;
    }

    public int powerSet(int k, boolean[] include, HashMap<String, Integer> map, ArrayList<String> list, int n) {
        int x = 1;
        boolean isInclude = false;
        if (k == n) {
            for (int i = 0; i < n; i++) {
                if (include[i]) {
                    isInclude = true;
                    x *= map.get(list.get(i));
                }
            }
            if (!isInclude)
                x = 0;
            return x;
        }
        if (!isInclude)
            x = 0;
        include[k] = false;
        x += powerSet(k + 1, include, map, list, n);
        include[k] = true;
        x += powerSet(k + 1, include, map, list, n);
        return x;
    }
}
