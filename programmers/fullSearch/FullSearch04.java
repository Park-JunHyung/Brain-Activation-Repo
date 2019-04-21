package programmers.fullSearch;

public class FullSearch04 {
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int width = 3, height=0;
        int b = 8, r = 1;
        while (brown>=b) {
            height = 3;
            if (red % r == 0) {
                int tmp_red = r;
                int tmp_brown = b;
                while (red != tmp_red) {
                    if (height<=width-1){
                        tmp_red += r;
                        tmp_brown += 2;
                        height++;
                    }else
                        break;
                }
                if (red == tmp_red && brown == tmp_brown)
                    break;
            }
            b += 2;
            r++;
            width++;
        }
        answer[0]=width;
        answer[1]=height;

        return answer;
    }
}
