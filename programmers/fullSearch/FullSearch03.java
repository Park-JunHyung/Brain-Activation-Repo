package programmers.fullSearch;

import java.util.HashSet;
import java.util.Iterator;

public class FullSearch03 {
    public int solution(int[][] baseball) {

        HashSet set = new HashSet();
        for (int x = 100; x < 1000; x++) {
            String tmp = String.valueOf(x);
            if (tmp.charAt(0) != tmp.charAt(1) && tmp.charAt(1) != tmp.charAt(2) && tmp.charAt(0) != tmp.charAt(2) && !tmp.contains("0"))
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
                    for (Iterator it = set.iterator(); it.hasNext(); ) {
                        String tmp = String.valueOf(it.next());
                        if ((tmp.charAt(0) != first && tmp.charAt(1) != second && tmp.charAt(2) != third))
                            possibleSet.add(tmp);
                    }
                    break;
                }
                case 1: {
                    for (Iterator it = set.iterator(); it.hasNext(); ) {
                        String tmp = String.valueOf(it.next());
                        if ((tmp.charAt(0) == first && tmp.charAt(1) != second && tmp.charAt(2) != third && tmp.indexOf(first) == tmp.lastIndexOf(first))
                                || (tmp.charAt(0) != first && tmp.charAt(1) == second && tmp.charAt(2) != third && tmp.indexOf(second) == tmp.lastIndexOf(second))
                                || (tmp.charAt(0) != first && tmp.charAt(1) != second && tmp.charAt(2) == third && tmp.indexOf(third) == tmp.lastIndexOf(third)))
                            possibleSet.add(tmp);
                    }
                    break;
                }
                case 2: {
                    for (Iterator it = set.iterator(); it.hasNext(); ) {
                        String tmp = String.valueOf(it.next());
                        if ((tmp.charAt(0) == first && tmp.charAt(1) == second)
                                || (tmp.charAt(1) == second && tmp.charAt(2) == third)
                                || (tmp.charAt(0) == first && tmp.charAt(2) == third))
                            possibleSet.add(tmp);
                    }
                    break;
                }
                case 3:
                    return 1;
            }
            set = (HashSet) possibleSet.clone();
            possibleSet = new HashSet();
            switch (ball) {
                case 0: {
                    for (Iterator it = set.iterator(); it.hasNext(); ) {
                        String tmp = String.valueOf(it.next());
                        if ((tmp.charAt(0) != second && tmp.charAt(0) != third)
                                && (tmp.charAt(1) != first && tmp.charAt(1) != third)
                                && (tmp.charAt(2) != first && tmp.charAt(2) != second))
                            possibleSet.add(tmp);
                    }
                    break;
                }
                case 1: {
                    for (Iterator it = set.iterator(); it.hasNext(); ) {
                        String tmp = String.valueOf(it.next());
                        if (((tmp.charAt(0) == second || tmp.charAt(0) == third) && (tmp.charAt(1) != first && tmp.charAt(1) != third) && (tmp.charAt(2) != first && tmp.charAt(2) != second))
                                || ((tmp.charAt(0) != second && tmp.charAt(0) != third) && (tmp.charAt(1) == first || tmp.charAt(1) == third) && (tmp.charAt(2) != first && tmp.charAt(2) != second))
                                || ((tmp.charAt(0) != second && tmp.charAt(0) != third) && (tmp.charAt(1) != first && tmp.charAt(1) != third) && (tmp.charAt(2) == first || tmp.charAt(2) == second)))
                            possibleSet.add(tmp);
                    }
                    break;
                }
                case 2: {
                    for (Iterator it = set.iterator(); it.hasNext(); ) {
                        String tmp = String.valueOf(it.next());
                        if (tmp.charAt(0) == second && tmp.charAt(1) == first
                                || tmp.charAt(0) == second && tmp.charAt(1) == third && tmp.charAt(2) != first
                                || tmp.charAt(0) == third && tmp.charAt(1) == first && tmp.charAt(2) != second
                                || tmp.charAt(1) == first && tmp.charAt(2) == second && tmp.charAt(0) != third
                                || tmp.charAt(1) == third && tmp.charAt(2) == first && tmp.charAt(0) != second
                                || tmp.charAt(1) == third && tmp.charAt(2) == second
                                || tmp.charAt(0) == second && tmp.charAt(2) == first && tmp.charAt(1) != third
                                || tmp.charAt(0) == third && tmp.charAt(2) == first
                                || tmp.charAt(0) == third && tmp.charAt(2) == second && tmp.charAt(1) != first)
                            possibleSet.add(tmp);
                    }
                    break;
                }
                case 3: {
                    for (Iterator it = set.iterator(); it.hasNext(); ) {
                        String tmp = String.valueOf(it.next());
                        if ((tmp.charAt(0) == second && tmp.charAt(1) == third && tmp.charAt(2) == first)
                                || (tmp.charAt(0) == third && tmp.charAt(1) == first && tmp.charAt(2) == second))
                            possibleSet.add(tmp);
                    }
                }
            }
            set = (HashSet) possibleSet.clone();

        }


        return set.size();
    }
}
