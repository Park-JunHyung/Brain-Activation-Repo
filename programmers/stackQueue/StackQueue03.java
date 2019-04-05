package programmers.stackQueue;

import java.util.LinkedList;

public class StackQueue03 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        LinkedList orderList = new LinkedList();
        LinkedList priorList = new LinkedList();

        for (int i = 0; i < priorities.length; i++) {
            orderList.offer(i);
            priorList.offer(priorities[i]);
        }

        int count = 0;
        boolean isPrinted;
        while (!priorList.isEmpty()) {
            isPrinted = true;
            int target = (int) priorList.poll();
            int order = (int) orderList.poll();
            int size = priorList.size();
            for (int i = 0; i < size; i++) {
                if (target < (int) priorList.get(i)) {
                    priorList.offer(target);
                    orderList.offer(order);
                    isPrinted = false;
                    break;
                }
            }
            if (isPrinted) {
                count++;
                if (order == location) {
                    answer = count;
                    break;
                }
            }
        }

        return answer;
    }
}
