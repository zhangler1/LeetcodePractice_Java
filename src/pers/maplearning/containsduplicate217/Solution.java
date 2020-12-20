package pers.maplearning.containsduplicate217;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> charset = new HashSet<Integer>();
        for (int a : nums) {
            if (!charset.contains(a)) {
                charset.add(a);
            } else {
                return true;
            }
        }
        return false;


    }
}