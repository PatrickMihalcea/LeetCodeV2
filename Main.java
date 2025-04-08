import java.util.Arrays;

public class Main {  
    public static void main(String[] args) {
        int inputSize = 2;
        boolean checkSolutions = false;
        
        String[] TestCases = {
            "[1,2,2,3,3,3]", "2",
            "[7, 7]", "1"
        };

        String[] Solutions = {
            "[[hat], [act, cat], [stop, pots, tops]]",
            "[[]]"
        };
        
        int testCaseNumber = 0;
        // Loop through test cases and call function here. 
        for (int i = 0; i < TestCases.length; i+=inputSize) {
            // String[] strs = InputHelper.argToStringArray(TestCases[i]);
            int[] nums = InputHelper.argToIntArray(TestCases[i]);
            System.out.print("Test Case " + Integer.toString(testCaseNumber+1) + ": "); 

            // Function Call!
            String attempt = Arrays.toString(TopKFrequentElements_347.Solution(nums, Integer.parseInt(TestCases[i+1])));

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
