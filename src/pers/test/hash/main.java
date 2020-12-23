package pers.test.hash;


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        for (int b : new int[]{1, 2, 3}) {
            a.add(b);
        }
        ArrayList<Integer> b= new ArrayList<>();
        for (int c : new int[]{1, 2, 3}) {
            b.add(c);
        }


        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        b.add(4);
        System.out.println(b.hashCode());
        b.remove(3);
        System.out.println(b.hashCode());
    }
}
