package programmers;

/* [Phone Number List]
 * - Return false when some phoneNo locates as a prefix to others
 * - else return true
 * */


import java.util.HashSet;

class hash02 {
    public boolean solution(String[] phone_book) {
        long before = System.currentTimeMillis();

        boolean answer = true;

        HashSet<String> set = new HashSet<>();

        for (String p : phone_book) {
            set.add(p);
        }

        for (String p : phone_book) {
            if (answer) {
                HashSet<String> targetSet = (HashSet<String>) set.clone();
                targetSet.remove(p);
                for (String t : targetSet) {
                    if (t.startsWith(p)) {
                        answer = false;
                        break;
                    }
                }
            }
        }

        long after = System.currentTimeMillis() - before;
        System.out.println("Estimated Time : " + after + "ms");
        return answer;
    }
}
