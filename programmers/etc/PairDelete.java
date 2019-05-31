package programmers.etc;


public class PairDelete {
    public int solution(String s) {
        int answer = 1;
        while (s.length() > 0) {
            char[] charArray = s.toCharArray();
            int index = 0;
            for (int i = 0; i < charArray.length - 1; i = index) {
                int next = i + 1;
                for (int x = i; x < charArray.length; x++) {
                    if (charArray[next] != 0) {
                        break;
                    } else
                        next++;
                }
                if (charArray[i] == charArray[next]) {
                    charArray[i] = 0;
                    charArray[next] = 0;
                    index = next;
                    for (int y = index + 1; y < charArray.length - 1; y++) {
                        if (charArray[y] != 0) {
                            index++;
                            break;
                        }
                    }
                    answer = 1;
                } else {
                    index++;
                }
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] != 0)
                    builder.append(charArray[i]);
            }
            String tmp = builder.toString();
            if (s.length() == tmp.length()) {
                answer = 0;
                break;
            } else s = tmp;
        }


        return answer;
    }
}
