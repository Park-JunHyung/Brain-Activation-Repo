package programmers.fullSearch;

import java.util.ArrayList;

public class FullSearch02 {
    public int solution(String numbers) {
        int answer = 0;
        int n=numbers.length();
        int max = 1<<n;
        int[] permList;
        ArrayList<Integer> answerList= new ArrayList();
        for(int i=1;i<max;i++){
            String stringNumber="";
            for(int j=0;j<n;j++){
                int tmp=i&(1<<j);
                if(tmp!=0)
                    stringNumber+=numbers.charAt(j);
            }
            int targetNumber=Integer.valueOf(stringNumber);
            String newTargetString=String.valueOf(targetNumber);
            permList=new int[newTargetString.length()];
            for (int x=0;x<newTargetString.length();x++){
                permList[x]=newTargetString.charAt(x);
            }
            permutation(permList,0,newTargetString.length(),newTargetString.length());
            System.out.println(stringNumber);
            if (answerList.contains(targetNumber))
                continue;
            else {
                boolean isFraction=true;
                for (int x=2;x<targetNumber;x++){
                    if (targetNumber%x==0){
                        isFraction=false;
                        break;
                    }
                }
                if (isFraction)
                    answerList.add(targetNumber);
            }
        }

        return answer;
    }

    static void permutation(int[] arr, int depth, int n, int r) {
        if(depth == r) {
            System.out.print(arr[r]);
            return;
        }

        for(int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }


}
