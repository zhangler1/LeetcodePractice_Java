package pers.maplearning.findthedifference;

import java.util.HashMap;

class Solution
{
    public
    char findTheDifference(String s, String t)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character c : s.toCharArray())
        {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (Character c : t.toCharArray())
        {
            if (hashMap.containsKey(c))
            {
                hashMap.put(c, hashMap.get(c) - 1);
            }
            else
            {
                return c;
            }
        }
        for (var a : hashMap.keySet())
        {
            if (hashMap.get(a) != 0)
            {
                return a;
            }
        }
        return ' ';//程序路径上的问题，虽然对于特定的数据，在此路径上不会出现问题，但是总归是此路径

    }
}