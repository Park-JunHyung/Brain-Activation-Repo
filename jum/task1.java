package jum;/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

        For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

        Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

        For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].
*/

import java.util.ArrayList;
import java.util.StringTokenizer;

public class task1 {
    public static void main(String[] args) {
        String S = "Forgetdf! as.k a sd.!.f i i sa??f";
        ArrayList<String> sentense = new ArrayList<>();

        int maxNum = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.' || S.charAt(i) == '?' || S.charAt(i) == '!') {
                String tmp=S.substring(0,i);
                int index=i+1;
                sentense.add(tmp);
                for (int j=index;j<S.length();j++){
                    if (S.charAt(j) == '.' || S.charAt(j) == '?' || S.charAt(j) == '!'){
                        index++;
                    }else {
                        break;
                    }
                }
                S=S.substring(index);
                i=0;
            }
        }
        sentense.add(S);
        for (int i=0;i<sentense.size();i++){
            StringTokenizer tokenizer=new StringTokenizer(sentense.get(i));
            int token=tokenizer.countTokens();
            if (maxNum<=token){
                maxNum=token;
            }
        }
        System.out.println(maxNum);
    }
}
