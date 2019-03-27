package programmers;

public class Solution {
    public static void main(String[] args) {

        hash01 hash01 = new hash01();
        System.out.println("Hash01 testcase 01");
        String[] participant = {"leo", "kiki", "eden", "leo"};
        String[] completion = {"kiki", "eden", "leo"};
        System.out.println(hash01.solution(participant, completion));

        hash02 hash02 = new hash02();
        System.out.println("Hash02 testcase 01");
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(hash02.solution(phone_book));
    }
}
