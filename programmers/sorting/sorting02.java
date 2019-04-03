package programmers.sorting;

import java.util.ArrayList;

public class sorting02 {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList list=new ArrayList();
        ArrayList firstNumberList=new ArrayList();
        ArrayList digitNumberList=new ArrayList();
        for (int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
            int digitNumber = 1;
            int target= numbers[i];
            while (target>=10){
                target/=10;
                digitNumber++;
            }
            int firstNumber=target;
            firstNumberList.add(firstNumber);
            digitNumberList.add(digitNumber);
        }
        while (!list.isEmpty()){
            int bigNumber=0;
            int bigNumberDigit=4;
            for (int i=0;i<list.size();i++){
                int targetFirstNumber= (int) firstNumberList.get(i);
                int targetDigitNumber= (int) digitNumberList.get(i);
                if (bigNumber<=targetFirstNumber&&bigNumberDigit>=targetDigitNumber){
                    b
                }

            }
        }

        return answer;
    }
}
