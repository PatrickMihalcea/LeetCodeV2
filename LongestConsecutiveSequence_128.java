import java.util.*;

public class LongestConsecutiveSequence_128 {
    public static int Solution(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int num : nums) {
            if (set.containsKey(num)) {
                if (set.get(num) < num) {
                    if (set.containsKey(num+1)) {
                        int high = set.get(num+1);
                        int low = set.get(num);
                        set.replace(low, high);
                        set.replace(high, low);
                        set.replace(num, high); // Prevent future repeats.
                    }
                    else {
                        int high = num + 1;
                        int low = set.get(num);
                        set.put(high, low);
                        set.replace(low, high);
                        set.replace(num, high);
                    }
                }
            } 
            else {
                if (set.containsKey(num+1)) {
                    int high = set.get(num+1);
                    set.put(num, high);
                    set.replace(high, num);
                }
                else {
                    set.put(num, num + 1);
                    set.put(num + 1, num);
                }
            }
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> pair : set.entrySet()) {
            int sequenceLength = pair.getValue() - pair.getKey();
            ans = Math.max(ans, sequenceLength);
        }


        return ans;
    }
}
