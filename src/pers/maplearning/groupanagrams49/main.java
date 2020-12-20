package pers.maplearning.groupanagrams49;


import java.util.List;

public class main {
    public static void main(String[] args) {

        List<List<String>> strs =new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for (List<String> a : strs) {
            System.out.println(a);
        }


    }
}


