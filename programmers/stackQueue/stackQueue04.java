package programmers.stackQueue;

import java.util.ArrayList;
import java.util.Stack;

public class stackQueue04 {
    public int[] solution(int[] progresses, int[] speeds) {

        Stack progressStack = new Stack();
        ArrayList finishList = new ArrayList();
        int arrayLength=speeds.length;

        for (int i = progresses.length - 1; i >= 0; i--)
            progressStack.push(progresses[i]);

        while (!progressStack.isEmpty()) {
            int count=0;
            int size;
            int peek = (int) progressStack.peek();
            if (peek >= 100) {
                progressStack.pop();
                size = progressStack.size();
                count++;
                for (int i = size - 1; i >= 0; i--) {
                    if ((int) progressStack.peek()< 100)
                        break;
                    progressStack.pop();
                    count++;
                }
                finishList.add(count);
            }
            size = progressStack.size();
            for (int i=0;i<size;i++){
                int curVal= (int) progressStack.get(i);
                if (curVal<100)
                    curVal+=speeds[arrayLength-i-1];
                progressStack.set(i,curVal);
            }
        }
        int[] answer = new int[finishList.size()];

        for (int i=0;i<answer.length;i++){
            answer[i]= (int) finishList.get(i);
        }

        return answer;
    }
}
