package com.recursionleetcode;

public class SkipTheLetter {
    public static void main(String[] args) {
        String qs = "";
        skip("", "baccad");

        System.out.println(skip2("baccad"));

        System.out.println(skipTheString("bcadapplesf"));
        System.out.println(skipTheAppString("bcadapplesf"));
    }

    // using new string variable
    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p, up.substring(1));
        }
        else {
            skip(p + ch, up.substring(1));
        }
    }

    // without using string variable
    static String skip2(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }

    // skipping the substring 'apple'
    static String skipTheString(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")) {
            return skipTheString(up.substring(5));
        } else {
            return up.charAt(0) + skipTheString(up.substring(1));
        }
    }

    // skipping 'app' but not from 'apple'
    static String skipTheAppString(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipTheAppString(up.substring(3));
        } else {
            return up.charAt(0) + skipTheAppString(up.substring(1));
        }
    }

}
