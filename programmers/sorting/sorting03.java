package programmers.sorting;

import java.util.Arrays;

/*
 * H-Index problem
 * */
public class sorting03 {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i <= length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (citations[j] >= i)
                    count++;
            }
            if (i <= count && length - count <= i)
                answer = i;
        }

        return answer;
    }
}
