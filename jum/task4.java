package jum;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int N = 5;
        int K = 3;

        double upNum = 1, downNum = 1;

        int factN_K = N - K;
        double tmp=0;
        int result=0;
        for (int x = 1; x <= factN_K; x++) {
            downNum *= x;
        }
        tmp=(factN_K+1)*(1/downNum);
        for (int i = factN_K+ 2; i <= N; i++) {
            tmp *= i;
            if (tmp>1000000000){
                result=-1;
            }
        }
        result= (int) tmp;

        System.out.println(result);
    }

}
