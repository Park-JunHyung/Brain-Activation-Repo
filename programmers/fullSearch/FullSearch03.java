package programmers.fullSearch;

import java.util.HashSet;
import java.util.Iterator;

public class FullSearch03 {
    public int solution(int[][] baseball) {
        int answer = 0;
        HashSet set = new HashSet();
        for (int x = 100; x < 1000; x++) {
            set.add(String.valueOf(x));
        }

        for (int i = 0; i < baseball.length; i++) {
            HashSet possibleSet = new HashSet();
            String numbers = String.valueOf(baseball[i][0]);
            char first = numbers.charAt(0);
            char second = numbers.charAt(1);
            char third = numbers.charAt(2);
            int strike = baseball[i][1];
            int ball = baseball[i][2];

            switch (strike) {
                case 0: {

                }
                case 1: {
                    for (Iterator it = set.iterator(); it.hasNext(); ) {
                        String tmp = String.valueOf(it.next());
                        if ((tmp.charAt(0) == first && tmp.charAt(1) != second && tmp.charAt(2) != third && tmp.indexOf(first) == tmp.lastIndexOf(first))
                                || (tmp.charAt(0) != first && tmp.charAt(1) == second && tmp.charAt(2) != third && tmp.indexOf(second) == tmp.lastIndexOf(second))
                                || (tmp.charAt(0) != first && tmp.charAt(1) != second && tmp.charAt(2) == third && tmp.indexOf(third) == tmp.lastIndexOf(third)))
                            possibleSet.add(tmp);
                    }
                    set= (HashSet) possibleSet.clone();
                }
                case 2: {

                }
            }
        }


        return answer;
    }
}
