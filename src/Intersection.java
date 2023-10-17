package com.Chevy;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {
        int[] num1 = {1, 3, 4, 5, 9, 48};

        int[] num2 = {1, 3, 9, 23, 48, 101};

        int[] answer = intersection2(num1, num2);

        for (int num : answer) {
            System.out.println(num);
        }
    }

    // Hashset solution.
    public static int[] intersection(int[] num1, int[] num2) {

        // We will need an initial set that will contain all non duplicate values of array num1
        Set<Integer> set1 = new HashSet<>();

        // You add all the values from array num1 into the set.
        // Repeated values in num1 will not be added per HashSet rules.
        for (int i : num1) {
            set1.add(i);
        }

        // We create another hashset which will include the values in the array num2 that are present in set1
        Set<Integer> set2 = new HashSet<>();
        // This pointer will iterate through num2 in the loop below
        int pointer = 0;
        for(int j : num2) {
            if(set1.contains(j)) {
                set2.add(j);
            }
            pointer++;
        }

        // We will loop through set2 (which includes the intersection) and add the values into a new array which we will return
        int index = 0;
        int[] answer = new int[set2.size()];
        for (int m : set2) {
            answer[index++] = m;
        }

        return answer;

    }

    // My initial approach to this problem during the interview
    public static int[] intersection2(int[] num1, int[] num2) {
        // We will iterate through the first array first.
        if (num2.length > num1.length) {
            return intersection2(num2, num1);
        }

        // This list will hold all the values of the first array
        List<Integer> list = new ArrayList<>();

        for (int num : num1) {
            list.add(num);
        }

        // This array will contain all the values that intercept between list and array 2
        List<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < num2.length; i++) {
            // The second condition here will prevent duplicates from populating the list
            if (list.contains(num2[i]) && !intersection.contains(num2[i])) {
                intersection.add(num2[i]);
            }
        }

        // This array holds everything in the interception list and will be returned
        int[] answer = new int[intersection.size()];

        // This pointer will keep track of the following loop
        int pointer = 0;

        for (int num : intersection) {
            answer[pointer++] = num;
        }

        return answer;
    }
}
