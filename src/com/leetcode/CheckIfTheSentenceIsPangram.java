package com.leetcode;

/*
*   1832. Check if the Sentence Is Pangram
*
*   Problem Statement - A pangram is a sentence where every letter of the English alphabet appears at least once.
*
* */

import java.util.Locale;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxj"));
    }

    static boolean checkIfPangram(String sentence){
        if (sentence.length() < 26){
            return false;
        }

        sentence = sentence.toLowerCase();
        boolean isContained = true;
        for (char ch = 'a'; ch <= 'z'; ch++){
            // check if the letter is present in the string given
            if (!sentence.contains(String.valueOf(ch))){
                isContained = false;
                break;
            }
        }

        if (isContained){
            return true;
        }
        else {
            return false;
        }
    }
}
