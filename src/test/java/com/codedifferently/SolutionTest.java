package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void findLongestConsecutiveSetTest01(){
        Solution solution = new Solution();
        Integer[] possibleFamilyMembers = new Integer[]{1,3,2,10,6,5,7,8};
        String expected = "Longest Set: {5 6 7 8}";
        String actual = solution.findLongestConsecutiveSet(possibleFamilyMembers);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void findLongestConsecutiveSetTest02(){
        Solution solution = new Solution();
        Integer[] possibleFamilyMembers = new Integer[]{11,8,9,1,10,2,7};
        String expected = "Longest Set: {7 8 9 10 11}";
        String actual = solution.findLongestConsecutiveSet(possibleFamilyMembers);
        Assertions.assertEquals(expected,actual);
    }







}
