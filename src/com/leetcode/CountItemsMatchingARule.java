package com.leetcode;

/*
*   1773. Count Items Matching a Rule
*
* */

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        switch (ruleKey){

            case "type":
                for (List l: items){
                    if (ruleValue.equals(l.get(0))){
                        count++;
                    }
                }
                break;

            case "color":
                for (List l: items){
                    if (ruleValue.equals(l.get(1))){
                        count++;
                    }
                }
                break;

            case "name":
                for (List l: items){
                    if (ruleValue.equals(l.get(2))){
                        count++;
                    }
                }
                break;
        }

        return count;
    }

}
