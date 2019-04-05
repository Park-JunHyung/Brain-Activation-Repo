package programmers.hash;

/* [Unfinished Player]
* - find participant who can't complete race 'Efficiently'
* - participants can duplicated
* */

import java.util.HashMap;
public class Hash01 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> part = new HashMap<>();

        for (String p : participant) {
            if (part.containsKey(p)) {
                part.put(p, part.get(p) + 1);
            } else
                part.put(p, 1);
        }
        for (String p : completion) {
            part.put(p, part.get(p) - 1);
        }
        for (String p : participant) {
            if (part.get(p) == 1) {
                answer = p;
                break;
            }
        }

        return answer;
    }
}
