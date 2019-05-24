package programmers.etc;

import java.util.HashSet;

public class WordChain {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        char lastChar = words[0].charAt(0);

        HashSet<String> wordSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            if (lastChar == words[i].charAt(0) && !wordSet.contains(words[i])) {
                lastChar = words[i].charAt(words[i].length() - 1);
                wordSet.add(words[i]);
            } else {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

        }

        System.out.println(answer[0] + " " + answer[1]);

        return answer;
    }

}
