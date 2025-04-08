
import java.util.Arrays;

public class Main {  
    public static void main(String[] args) {
        int inputSize = 2;
        boolean checkSolutions = true;
        
        String[] TestCases = {
            "[1,2,3,4]", "7",
        };

        String[] Solutions = {
            "[2, 3]"
        };
        
        int testCaseNumber = 0;
        // Loop through test cases and call function here. 
        for (int i = 0; i < TestCases.length; i+=inputSize) {
            int[] nums = InputHelper.argToIntArray(TestCases[i]);
            System.out.print("Test Case " + Integer.toString(testCaseNumber+1) + ": "); 

            // Function Call!
            String attempt = Arrays.toString(TwoSum_1.Solution(nums, Integer.parseInt(TestCases[i+1])));

            if (checkSolutions) {
                if (attempt.equals(Solutions[testCaseNumber])) {
                    System.out.println("PASS   Output: " + attempt);
                }
                else {
                    System.out.println("FAIL   Output: " + attempt + "   Target: " + Solutions[testCaseNumber]);
                }
            }
            else {
                System.out.println(attempt);
            }
            testCaseNumber++;
        }
        
        
    }  

}
