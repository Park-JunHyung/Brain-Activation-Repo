package programmers;

import programmers.hash.*;
import programmers.stackQueue.*;
import programmers.heap.*;
import programmers.sorting.*;

public class Solution {
    public static void main(String[] args) {
//        runHeap1();
//        runHeap2();
//        runSorting1();
        runSorting2();
    }

    private static void runSorting2() {
        sorting02 sorting02=new sorting02();
        int [] numbers={12,121};
        System.out.println("Sorting02 testcase1");
        System.out.println(sorting02.solution(numbers));
        int [] numbers2={2,22};
        System.out.println("Sorting02 testcase1");
        System.out.println(sorting02.solution(numbers2));
    }

    private static void runSorting1() {
        sorting01 sorting01=new sorting01();

        int [] array={1, 5, 2, 6, 3, 7, 4};
        int [][] command={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println("Sorting01 testcase1");
        System.out.println(sorting01.solution(array,command));
    }

    private static void runHeap2() {
        heap02 heap02=new heap02();
        int stock=4;
        int [] dates= {4,10,15};
        int [] supplies={20,5,10};
        int k=30;
        System.out.println("Heap02 testcase1");
        System.out.println(heap02.solution(stock,dates,supplies,k));

        int stock2=4;
        int [] dates2= {1,2,3,4};
        int [] supplies2={10,40,30,20};
        int k2=100;
        System.out.println("Heap02 testcase2");
        System.out.println(heap02.solution(stock2,dates2,supplies2,k2));


    }

    private static void runHeap1() {
        heap01 heap01=new heap01();
        int [] scoville= {1, 2, 3, 9, 10, 12};
        int K=7;
        System.out.println("Heap01 testcase1");
//        System.out.println(heap01.solution(scoville,K));

        int [] scoville2= {1, 2, 3, 9, 10, 12};
        int K2=1100;
        System.out.println("Heap01 testcase2");
        System.out.println(heap01.solution(scoville2,K2));
    }

    private static void runStackQueue5() {
        stackQueue05 stackQueue05=new stackQueue05();
        int[] heights={6,9,5,7,4};
        System.out.println("StackQueue05 testcase1");
        System.out.println(stackQueue05.solution(heights));

    }

    private static void runStackQueue4() {
        stackQueue04 stackQueue04 = new stackQueue04();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println("StackQueue04 testcase1");
//        System.out.println(stackQueue04.solution(progresses, speeds));

        int[] progresses2 = {40, 93, 30, 55, 60, 65};
        int[] speeds2 = {60, 1, 30, 5 , 10, 7};
        System.out.println("StackQueue04 testcase2");
        System.out.println(stackQueue04.solution(progresses2, speeds2));

        int[] progresses3 = {93, 30, 55, 60, 40, 65};
        int[] speeds3 = {1, 30, 5 , 10, 60, 7};
        System.out.println("StackQueue04 testcase3");
        System.out.println(stackQueue04.solution(progresses3, speeds3));
    }

    private static void runStackQueue3() {
        stackQueue03 stackQueue03 = new stackQueue03();

        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println("StackQueue03 testcase1");
        System.out.println(stackQueue03.solution(priorities, location));


        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        System.out.println("StackQueue03 testcase2");
        System.out.println(stackQueue03.solution(priorities2, location2));
    }

    private static void runStackQueue2() {
        stackQueue02 stackQueue02 = new stackQueue02();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight = {7, 4, 5, 6};
        System.out.println("StackQueue02 testcase1");
        System.out.println(stackQueue02.solution(bridge_length, weight, truck_weight));
    }

    private static void runStackQueue() {
        stackQueue01 stackQueue01 = new stackQueue01();
        String arrangement = "()(((()())(())()))(())";

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
        hash04 hash04 = new hash04();

        System.out.println("Hash04 testcase 2");
        String[] genre = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {800, 600, 150, 800, 2500};
        System.out.println(hash04.solution(genre, plays));
    }

}
