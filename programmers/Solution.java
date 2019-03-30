package programmers;

import programmers.hash.*;
import programmers.stackQueue.*;

public class Solution {
    public static void main(String[] args) {

//        runHash01();
//        runHash02();
//        runHash03();
//        runHash04();
//        runStackQueue();
//        runStackQueue2();
        runStackQueue3();
    }

    private static void runStackQueue3() {
        stackQueue03 stackQueue03=new stackQueue03();

        int[] priorities={2,1,3,2};
        int location=2;
        System.out.println("StackQueue03 testcase1");
        System.out.println(stackQueue03.solution(priorities,location));
    }

    private static void runStackQueue2() {
        stackQueue02 stackQueue02=new stackQueue02();

        int bridge_length=2;
        int weight=10;
        int [] truck_weight={7,4,5,6};
        System.out.println("StackQueue02 testcase1");
        System.out.println(stackQueue02.solution(bridge_length,weight,truck_weight));
    }

    private static void runStackQueue() {
        stackQueue01 stackQueue01=new stackQueue01();
        String arrangement= "()(((()())(())()))(())";

        System.out.println("StackQueue01 testcase 1");
        System.out.println(stackQueue01.solution(arrangement));
    }


//    private static void powerset(int[] data, int n) {
//        int i,j;
//        int max = 1<<n;
//        for(i=0;i<max;i++){
//            System.out.print("{");
//            for(j=0;j<n;j++){
//                int tmp=i&(1<<j);
//                if(tmp!=0)
//                    System.out.printf("%d ",data[j]);
//            }
//            System.out.println("}");
//        }
//    }

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

        System.out.println("Hash03 testcase 1");
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(hash03.solution(clothes));


        System.out.println("Hash03 testcase 2");
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(hash03.solution(clothes2));

    }


    private static void runHash04() {
        hash04 hash04=new hash04();

        System.out.println("Hash04 testcase 2");
        String[] genre={"classic", "pop", "classic", "classic", "pop"};
        int[] plays={800, 600, 150, 800, 2500};
        System.out.println(hash04.solution(genre,plays));
    }

}
