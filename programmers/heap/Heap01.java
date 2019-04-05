package programmers.heap;

import java.util.PriorityQueue;

public class Heap01 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue prQ=new PriorityQueue();

        for (int i=0;i<scoville.length;i++){
            prQ.add(scoville[i]);
        }
        while (prQ.size()>1&&(int)prQ.peek()<K){
            int first=(int)prQ.poll();
            int second=(int)prQ.poll();
            int newFood=first+second*2;
            prQ.add(newFood);
            answer++;
        }
        if ((int)prQ.peek()<K)
            answer=-1;

        return answer;
    }
}
