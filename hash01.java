package programmers;

import java.util.HashMap;

public class hash01 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden","leo"};
        String[] completion = {"kiki", "eden","leo"};
        String answer = "";

        HashMap<String,Integer> part=new HashMap<>();

        for (String p :participant){
            if (part.containsKey(p)){
                part.put(p,part.get(p)+1);
            }else
                part.put(p,1);
        }
        for (String p : completion){
            part.put(p,part.get(p)-1);
        }
        for (String p : participant){
            if (part.get(p)==1){
                answer=p;
                break;
            }
        }

        System.out.println(answer);
    }
}
