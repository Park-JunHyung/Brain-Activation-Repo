package programmers.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap02 {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        PriorityQueue<Integer> pqSupplies = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int spIdx = 0;
        int cnt = 0;
        for (int day=0; day<k; day++) {
            if (spIdx < dates.length && day >= dates[spIdx]) {
                pqSupplies.add(supplies[spIdx]);
                spIdx++;
            }
            if (stock <= 0) {
                stock += pqSupplies.remove();
                cnt++;
            }

            stock--;
        }

        return cnt;
    }
}
