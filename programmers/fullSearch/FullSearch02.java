package programmers.fullSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class FullSearch02 {
    public int solution(String numbers) {
        int answer = 0;
        HashSet<Integer> numberSet = new HashSet<>();
        String[] numbersArray = numbers.split("");
        for (int i = 1; i <= numbersArray.length; i++) {
            perm(numbersArray, 0, numbersArray.length, i, numberSet);
        }
        for (Iterator<Integer> it = numberSet.iterator(); it.hasNext(); ) {
            boolean isPrime = true;
            Integer targetNumber = it.next();
            if (targetNumber < 2) continue;
            if (targetNumber == 2) {
                answer++;
                continue;
            }
            for (int i = 2; i < targetNumber; i++) {
                if (targetNumber % i == 0) {
                    isPrime = false;
                    continue;
                }
            }
            if (isPrime) answer++;
        }
        return answer;
    }

    public static void perm(String[] arr, int depth, int n, int k, HashSet set) {
        if (depth == k) {
            set.add(print(arr, k));
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, k, set);
            swap(arr, i, depth);
        }
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int print(String[] arr, int k) {
        String tmp = "";
        for (int i = 0; i < k; i++) {
            tmp += arr[i];
        }
        return Integer.parseInt(tmp);
    }


}
