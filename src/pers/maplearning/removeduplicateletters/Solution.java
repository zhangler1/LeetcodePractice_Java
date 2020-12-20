package pers.maplearning.removeduplicateletters;

import java.util.ArrayList;
import java.util.Collections;

class Solution
    {
    public String removeDuplicateLetters(String s)
        {
        ArrayList<Integer> characters=new ArrayList<Integer>(Collections.nCopies(26,0));
        for(Character c: s.toCharArray())
            {
            int codepoint=c-'a';
            characters.set(codepoint,characters.get(codepoint)+1);
            }
        StringBuilder stringBuilder=new StringBuilder();
        for(var i=characters.listIterator();i.hasNext();)
            {
             var idx =i.nextIndex();
             var v=i.next();
            if(v>0)

                {
                stringBuilder.append((char)(idx+'a'));
                }
            }
        return stringBuilder.toString();
        }
    }
