package com.codedifferently;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers){
        ArrayList<Integer> longest = new ArrayList<>();
        Arrays.sort(allNumbers, Comparator.naturalOrder());
        int start = 0;
        for(int i = 0; i < allNumbers.length-1; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            while(allNumbers[i] +1== allNumbers[i+1]){
                temp.add(allNumbers[i]);
                i++;
                if(i == allNumbers.length-1){
                    temp.add(allNumbers[i]);
                    break;
                }
            }
            if(i != allNumbers.length-1) {
                temp.add(allNumbers[i]);
            }
            if(temp.size() > longest.size()) {
                longest = temp;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Longest Set: {");
        for(int i = 0; i < longest.size(); i++){
            stringBuilder.append(String.valueOf(longest.get(i)));
            if(i != longest.size()-1){
                stringBuilder.append(" ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
