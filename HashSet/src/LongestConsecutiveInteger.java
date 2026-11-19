import java.util.HashSet;

public class LongestConsecutiveInteger {
    public static int LongInt(int[] arr) {
        if(arr.length<0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {

                int currentStreak = 1;
                int currentNum = num;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longest=Math.max(longest,currentStreak);
            }


        }
        return longest;
    }

    public static void main(String[] args) {
        int [] arr = {1,6,2,5,79,4,3};
        System.out.println(LongInt(arr));
    }
}
/*
longest = 0;

First loop will add every element in the set.

The second loop will check each element in the set.

The num is 1.

If the set does not contain num-1 (1-1 = 0), then we start the streak by 1 and initialise currentNum with num, i.e. 1.

In the while loop, if the set contains currentNum+1, then it's true, so currentNum is incremented and currentStreak is also incremented.

This continues until the condition becomes false, i.e. when it checks for 7 and 7 is not present in the set.

Now longest will find the maximum between longest and currentStreak.

This process will continue for all elements in the set, but numbers that have a previous consecutive number will be skipped.

For the input {1, 6, 2, 5, 79, 4, 3}, the longest consecutive sequence is 1, 2, 3, 4, 5, 6.

So the output is 6.
 */