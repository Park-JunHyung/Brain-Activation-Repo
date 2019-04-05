package programmers.stackQueue;

import java.util.*;

public class StackQueue02 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        int count = 0;
        int truck_length = truck_weights.length;
        int sumOfTruckWeight = 0;
        Queue bridgeQueue = new LinkedList<>();
        ArrayList finishList=new ArrayList();

        while (finishList.size() < truck_length) {
            if (bridgeQueue.size() == bridge_length) {
                int LastTruck= (int) bridgeQueue.poll();
                if (LastTruck!=0){
                    finishList.add(LastTruck);
                    sumOfTruckWeight-=LastTruck;
                }
            }
            int nextWeight = sumOfTruckWeight + truck_weights[count];
            if (nextWeight <= weight) {
                bridgeQueue.offer(truck_weights[count]);
                sumOfTruckWeight+=truck_weights[count];
                if (count!=truck_length-1)
                    count++;
            } else {
                bridgeQueue.offer(0);
            }
            answer++;
        }


        return answer;
    }
}
