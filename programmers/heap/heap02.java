package programmers.heap;

public class heap02 {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;

        int dayCount = 0;
        int index = 0;
        int size = dates.length;
        int[] targetStock = new int[size];
        targetStock[size - 1] = k - dates[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            targetStock[i] = targetStock[i + 1] - (dates[i + 1] - dates[i]);
        }
        while (dayCount < k) {
            if (index == size)
                break;
            if (dayCount != dates[index]) {
                stock--;
                dayCount++;
                continue;
            }
            if (stock < targetStock[index]) {
                stock += supplies[index];
                answer++;
            }
            index++;
            dayCount++;
            stock--;
        }

        return answer;
    }
}
