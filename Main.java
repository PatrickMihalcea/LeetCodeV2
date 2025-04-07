
import java.util.Arrays;

public class Main {  
    public static void main(String[] args) {
        int inputSize = 2;
        String[] TestCases = {
            // "[1,2,3,4,5]" used in conjunction with argToIntArray
            // "[racecar, carrace]" using in conjunction with argToStringArray
            "[1,2,3,4]", "7",

        };
        

        // Loop through test cases and call function here. 
        for (int i = 0; i < TestCases.length; i+=inputSize) {
            int[] nums = InputHelper.argToIntArray(TestCases[i]);
            System.out.println(
                "Test Case " + Integer.toString(i+1) + ": " + 
                // Function Call!
                Arrays.toString(TwoSum_1.Solution(nums, Integer.parseInt(TestCases[i+1]))));
        }
        
        
    }  

}
