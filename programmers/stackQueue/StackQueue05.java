package programmers.stackQueue;

import java.util.ArrayList;
import java.util.Stack;

public class StackQueue05 {
    public int[] solution(int[] heights) {

        ArrayList receivedList=new ArrayList();
        Stack towerStack=new Stack();
        for (int i=0;i<heights.length;i++){
            towerStack.push(heights[i]);
        }
        while (!towerStack.isEmpty()){
            int target= (int) towerStack.pop();
            boolean isReceived=false;
            int count=0;
            for (int i=0;i<towerStack.size();i++){
                if ((int)towerStack.get(i)>target){
                    count=i+1;
                    isReceived=true;
                }
            }
            if (!isReceived)
                count=0;
            receivedList.add(count);
        }
        int[] answer = new int[receivedList.size()];
        for (int i=0;i<answer.length;i++){
            answer[answer.length-i-1]= (int) receivedList.get(i);
        }

        return answer;
    }
}
