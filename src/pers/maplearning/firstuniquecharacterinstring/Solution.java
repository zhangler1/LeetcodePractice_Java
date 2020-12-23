package pers.maplearning.firstuniquecharacterinstring;

import java.util.ArrayList;
import java.util.Collections;

class Solution{
    public int firstUniqChar(String s){
        Integer index=-1;
        ArrayList<Integer> arrayList=new ArrayList(Collections.nCopies(26,0));
        for(int i=0;i<s.length();i++){
            var idx=s.charAt(i)-'a';
            arrayList.set(idx,arrayList.get(idx)+1);
        }
        for(int i=0;i<s.length();i++){
            if(arrayList.get(s.charAt(i)-'a')==1){
                index=i;
                break;
            }
        }
        return index;

    }
}

