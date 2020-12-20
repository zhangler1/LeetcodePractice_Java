package pers.maplearning.groupanagrams49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.nCopies;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();

        Map<ArrayList<Integer>, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            var charArray = new ArrayList<>(nCopies(26,0));//忘记了没回要清空在这里直接使用新的变量吧。
            for (Character c : s.toCharArray()) {
                int codepoint=c.charValue()-((Character)'a').charValue();
                charArray.set(codepoint,charArray.get(codepoint)+1);

            }

            if (map.keySet().contains(charArray)) {
                map.get(charArray).add(s);
            } else {
                map.put(charArray,new ArrayList<String>());
                map.get(charArray).add(s);
            }

        }
        for (var a : map.keySet()) {
            ans.add(map.get(a));
        }
        return ans;
    }
}