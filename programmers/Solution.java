package programmers;

public class Solution {
    public static void main(String[] args) {

//        runHash01();
//        runHash02();
        runHash03();
    }

    private static void runHash01() {
        hash01 hash01 = new hash01();

        System.out.println("Hash01 testcase 1");
        String[] participant = {"leo", "kiki", "eden", "leo"};
        String[] completion = {"kiki", "eden", "leo"};
        System.out.println(hash01.solution(participant, completion));
    }

    private static void runHash02() {
        hash02 hash02 = new hash02();

        System.out.println("Hash02 testcase 1");
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(hash02.solution(phone_book));

        System.out.println("Hash02 testcase 1");
        phone_book = new String[]{"12223232", "12", "22222222"};
        System.out.println(hash02.solution(phone_book));
    }

    private static void runHash03() {
        hash03 hash03 = new hash03();

        System.out.println("Hash02 testcase 1");
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(hash03.solution(clothes));


        System.out.println("Hash02 testcase 2");
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(hash03.solution(clothes2));

    }

}
