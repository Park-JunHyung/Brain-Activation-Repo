package programmers.stackQueue;

import java.util.Stack;

public class stackQueue01 {
    public int solution(String arrangement) {
        int answer = 0;

        String tmp=arrangement.replace("()","1");

        Stack stack=new Stack();

        for (int i=0;i<tmp.length();i++){
            if (tmp.charAt(i)=='1'){
                answer+=stack.size();
            }else if(tmp.charAt(i)=='('){
                stack.push('(');
            }else {
                stack.pop();
                answer++;
            }
        }

        return answer;
    }
}
