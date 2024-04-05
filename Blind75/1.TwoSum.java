package Blind75;

import java.util.*;
 
//One pass hash map
//can handle negative numbers
class TwoSum 
{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0 ;i<nums.length; i++){
            int curr = nums[i];
            if(hm.containsKey(target-curr)){
                return new int[]{i, hm.get(target-curr)};
            }
            hm.put(curr, i);

        }
        return null;
    }
}

/**
Time complexity: O(n).
We traverse the list containing nnn elements only once. Each lookup in the table costs only O(1)O(1)O(1) time.

Space complexity: O(n).
The extra space required depends on the number of items stored in the hash table, which stores at most nnn elements.
 */