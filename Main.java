
public class Main {  
    public static void main(String[] args) {
        int inputSize = 1;
        boolean checkSolutions = true;
        
        String[] TestCases = {
            "Was it a car or a cat I saw?",
            "NOOOO",
            "0P"
        };

        String[] Solutions = {
            "true",
            "false",
            "false"
        };
        
        int testCaseNumber = 0;
        // Loop through test cases and call function here. 
        for (int i = 0; i < TestCases.length; i+=inputSize) {
            //String[] ins = InputHelper.argToStringArray(TestCases[i]);
            //int[] ins = InputHelper.argToIntArray(TestCases[i]);
            System.out.print("Test Case " + Integer.toString(testCaseNumber+1) + ": "); 

            // Function Call!
            String attempt = Boolean.toString(ValidPalindrome_125.Solution(TestCases[i]));

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
