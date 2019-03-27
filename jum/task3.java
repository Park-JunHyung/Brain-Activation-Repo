package jum;

import java.util.HashMap;

public class task3 {
    public static void main(String[] args) {
        String S = "CAABABO";
        HashMap<String, Integer> map = new HashMap<>();
        String sub;
        int result=0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                sub = S.substring(i, j+1);
                if (sub.equals("")){
                    continue;
                }
                if (!map.containsKey(sub)) {
                    String tmpString=sub;
                    int count=0;
                    while (true){
                        String target=String.valueOf(tmpString.charAt(0));
                        tmpString=tmpString.substring(1);
                        if (!tmpString.contains(target)){
                            count++;
                        }
                        tmpString=tmpString.replace(target,"");
                        if (tmpString.length()==0){
                            break;
                        }else if (tmpString.length()==1){
                            count++;
                            break;
                        }
                    }
                    map.put(sub,count);
                    result+=count;
                }else {
                    result+=map.get(sub);
                }
            }
        }
        System.out.println(result);
    }
}
