package com.exception;

import java.util.*;

public class Variables {
	
		
		    public static int lengthOfLongestSubstring(String s) {
		        int n = s.length();
		        int maxLength = 0;
		        int i = 0; // starting index of the window
		        int j = 0; // ending index of the window
		        HashSet<Character> set = new HashSet<>();

		        while (i < n && j < n) {
		            if (!set.contains(s.charAt(j))) {
		                // Expand the window to the right
		                set.add(s.charAt(j));
		                j++;
		                maxLength = Math.max(maxLength, j - i);
		            } else {
		                // Shrink the window from the left
		                set.remove(s.charAt(i));
		                i++;
		            }
		        }
		        return maxLength;
		    }

		    public static void main(String[] args) {
		        String s = "abcabcbb";
		        int length = lengthOfLongestSubstring(s);
		        System.out.println("Length of the longest substring without repeating characters: " + length);
		    }
		

		
	}
		
		

	


