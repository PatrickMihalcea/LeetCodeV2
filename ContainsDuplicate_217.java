import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    // Add function here. Make 'static' in order to run.
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> table = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (table.contains(nums[i])) {
                return true;
            } else {
                table.add(nums[i]);
            }
        }
        return false;
    }
}
