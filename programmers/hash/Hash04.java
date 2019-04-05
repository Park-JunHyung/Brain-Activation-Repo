package programmers.hash;
/* Best Album
 * - Return song id list that is satisfied below conditions
 * - - The genre that played many times locates first
 * - - In same genre, the song that played many times locates first
 * - - In same genre and play times, the song that had lowest song id locates first
 * */

import java.util.*;

public class Hash04 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer;
        // nice solution
        HashMap<String, HashMap<Integer, Integer>> albumMap = new HashMap<>();
        HashMap<Integer, Integer> mapInMap;
        HashMap<String, Integer> albumTotalMap = new HashMap<>();

        ArrayList<Integer> genreSort = new ArrayList();
        ArrayList songSort;
        ArrayList idSort = new ArrayList();

        ArrayList answerList = new ArrayList();

        for (int i = 0; i < genres.length; i++) {
            if (!albumMap.containsKey(genres[i])) {
                mapInMap = new HashMap<>();
            } else {
                mapInMap = albumMap.get(genres[i]);
            }
            mapInMap.put(i, plays[i]);
            albumMap.put(genres[i], mapInMap);
        }

        for (int i = 0; i < genres.length; i++) {
            if (!albumTotalMap.containsKey(genres[i])) {
                albumTotalMap.put(genres[i], plays[i]);
            } else {
                albumTotalMap.put(genres[i], albumTotalMap.get(genres[i]) + plays[i]);
            }
        }
        for (String genre : albumTotalMap.keySet()) {
            genreSort.add(albumTotalMap.get(genre));
        }
        Collections.sort(genreSort);
        Collections.reverse(genreSort);

        for (int i = 0; i < genreSort.size(); i++) {
            songSort = new ArrayList();
            String genre = getKey(albumTotalMap, genreSort.get(i));
            HashMap sortMap = albumMap.get(genre);
            for (Object n : sortMap.keySet()) {
                songSort.add(sortMap.get(n));
            }
            Collections.sort(songSort);
            Collections.reverse(songSort);
            int count = 0;
            if (songSort.size() == 1) {

                answerList.add(getKey(sortMap, songSort.get(count)));
            } else
                while (count < songSort.size()) {
                    if (count == 2)
                        break;
                    if (count<=songSort.size()-2&&songSort.get(count).equals(songSort.get(count + 1))) {
                        for (Object n : sortMap.keySet()) {
                            if (sortMap.get(n).equals(songSort.get(count)))
                                idSort.add(n);
                        }
                        Collections.sort(idSort);
                        answerList.add(idSort.get(0));
                        if (count == 0)
                            answerList.add(idSort.get(1));
                        break;
                    } else {
                        answerList.add(getKey(sortMap, songSort.get(count++)));
                    }
                }
        }
        System.out.println();
        int size=answerList.size();
        answer=new int[size];
        for (int i=0;i<size;i++){
            answer[i]= (int) answerList.get(i);
        }
        return answer;
    }

    public static <K, V> K getKey(HashMap<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key)))
                return key;
        }
        return null;
    }
}
