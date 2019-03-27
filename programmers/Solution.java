package programmers;

public class Solution {
    public static void main(String[] args) {

//        runHash01();
        runHash02();
    }
    static void runHash01(){
        hash01 hash01 = new hash01();

        System.out.println("Hash01 testcase 1");
        String[] participant = {"leo", "kiki", "eden", "leo"};
        String[] completion = {"kiki", "eden", "leo"};
        System.out.println(hash01.solution(participant, completion));
    }
    static void runHash02(){
        hash02 hash02 = new hash02();

        System.out.println("Hash02 testcase 1");
        String[] phone_book = {"119", "97674223", "1195524421"};
//        System.out.println(hash02.solution(phone_book));

        System.out.println("Hash02 testcase 1");
        phone_book = new String[]{"12223232", "12", "22222222"};
        System.out.println(hash02.solution(phone_book));
    }
}
