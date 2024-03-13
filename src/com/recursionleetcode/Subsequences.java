package com.recursionleetcode;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseq2("", "abc"));
        subseqAscii("", "abc");
        System.out.println(subseqAscii2("", "abc"));
    }

    // find the substrings of the given String (recursion)
    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));

    }

    // printing an arraylist of the subsequences
    static ArrayList<String> subseq2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseq2(p+ch, up.substring(1));
        ArrayList<String> right = subseq2(p, up.substring(1));

        left.addAll(right);
        return left;

    }

    // printing the subsets - subsequences with ascii values
    static void subseqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));

    }


    // subsquence Ascii using ArrayList
    static ArrayList<String> subseqAscii2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqAscii2(p+ch, up.substring(1));
        ArrayList<String> second = subseqAscii2(p, up.substring(1));
        ArrayList<String> third = subseqAscii2(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
