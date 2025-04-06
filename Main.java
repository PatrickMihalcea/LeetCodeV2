

public class Main {  
    public static void main(String[] args) {

        


        String[] TestCases = {
            // "[1,2,3,4,5]" used in conjunction with argToIntArray
            // "[racecar, carrace]" using in conjunction with argToStringArray
            "[racecar, carrace]"
        };

        // Loop through test cases and call function here. 
        int i = 1;
        for (String testCase : TestCases) {
            String[] input = InputHelper.argToStringArray(testCase);
            System.out.println(
                "Test Case " + Integer.toString(i) + ": " + 
                // Function Call!
                ValidAnagram_242.Solution(input[0], input[1]));

            i++;
        }
        
        
    }  

}
