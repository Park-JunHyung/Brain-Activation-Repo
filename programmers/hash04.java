package programmers;
/* Best Album
* - Return song id list that is satisfied below conditions
* - - The genre that played many times locates first
* - - In same genre, the song that played many times locates first
* - - In same genre and play times, the song that had lowest song id locates first
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class hash04 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, HashMap<Integer,Integer>> albumMap=new HashMap<>();
        HashMap<Integer,Integer> mapInMap;
        HashMap<String,Integer> albumTotal=new HashMap<>();

        ArrayList genreSort=new ArrayList();
        ArrayList songSort=new ArrayList();
        ArrayList idSort=new ArrayList();

        for (int i=0;i<genres.length;i++){
            if (!albumMap.containsKey(genres[i])){
                mapInMap=new HashMap<>();
            }else {
                mapInMap=albumMap.get(genres[i]);
            }
            mapInMap.put(i,plays[i]);
            albumMap.put(genres[i],mapInMap);
        }

        for (int i=0;i<genres.length;i++){
            if (!albumTotal.containsKey(genres[i])){
                albumTotal.put(genres[i],plays[i]);
            }else {
                albumTotal.put(genres[i],albumTotal.get(genres[i])+plays[i]);
            }
        }
        System.out.println();
        return answer;
    }
}
