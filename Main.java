

public class Main {  
    public static void main(String[] args) {
        int inputSize = 1;
        boolean checkSolutions = true;
        
        String[] TestCases = {
            "[act, pots, tops, cat, stop, hat]",
            "[]"
        };

        String[] Solutions = {
            "[[hat], [act, cat], [stop, pots, tops]]",
            "[[]]"
        };
        
        int testCaseNumber = 0;
        // Loop through test cases and call function here. 
        for (int i = 0; i < TestCases.length; i+=inputSize) {
            String[] strs = InputHelper.argToStringArray(TestCases[i]);
            System.out.print("Test Case " + Integer.toString(testCaseNumber+1) + ": "); 

            // Function Call!
            String attempt = GroupAnagrams_49.Solution(strs).toString();

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
