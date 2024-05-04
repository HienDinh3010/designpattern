package hackerank;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println("isPalindrome " + isPalindrome("bbaaabb"));
        System.out.println("isPalindrome " + isPalindrome("ddcceefeeccdd"));
        System.out.println("isPalindrome " + isPalindrome("abbabba")); //abbabba

        System.out.println("----");
        System.out.println("gameOfThrones " + gameOfThrones("aaabbbb"));
    }

    /**
     * The attendee data is aligned for clarity below:
     *
     * 10101
     * 11110
     * 00010
     * These are all possible teams that can be formed:
     *
     * Members Subjects
     * (1,2)   [1,2,3,4,5]
     * (1,3)   [1,3,4,5]
     * (2,3)   [1,2,3,4]
     */
    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        int attendees = topic.size();
        int topicNum = 0;
        if (topic.size() > 0) {
            topicNum = topic.get(0).length();
        }
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < attendees; i++) {
            for (int j = i + 1; j < attendees; j++) {
                String topicAtI  = topic.get(i);
                String topicAtJ = topic.get(j);
                int count = countKnowTopic(topicAtI, topicAtJ);
                map.put(Arrays.asList(i, j), count);
            }
        }
        int maxKnowTopic = Integer.MIN_VALUE;
        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxKnowTopic) {
                maxKnowTopic = entry.getValue();
            }
        }
        int countTeam = 0;
        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxKnowTopic) {
                countTeam++;
            }
        }
        return List.of(maxKnowTopic, countTeam);
    }

    public static int countKnowTopic(String topicA, String topicB) {
        int count = 0;
        for (int i = 0; i < topicA.length(); i++) {
            if (topicA.charAt(i) == 1 || topicB.charAt(i) == 1) {
                count++;
            }
        }
        return count;
    }

    public static int countValley(int steps, String path) {
        // Write your code here
        //UDDDUDUU
        int count = 0, trackSeaLevel = 0;
        char[] paths = path.toCharArray();
        for (int i = 0; i < paths.length; i++) {
            if (trackSeaLevel == 0 && paths[i] == 'D') {
                count++;
            }
            if (paths[i] == 'U') {
                trackSeaLevel++;
            } else {
                trackSeaLevel--;
            }
        }
        return count;
    }


    /**
     * Sample Input 0
     *
     * aaabbbb
     * Sample Output 0
     *
     * YES
     * Explanation 0
     *
     * A palindromic permutation of the given string is bbaaabb.
     * @param s
     * @return
     */
    public static String gameOfThrones(String s) {
        // Write your code here
        //s = "aabbccdd" => abcddcba
        //    cdcdcdcdeeeef "YES"
        //    cdefghmnopqrstuvw "NO"
        //aaabbbb
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                count++;
            }
        }
        if (count > 1) {
            return "NO";
        }
        return "YES";
    }

    //bbaaabb
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            if (chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
