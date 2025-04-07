## Workspace Instructions
Each solution is written into an independent file.

Naming convention:
ProblemName_Problem#.java
Ex. ContainsDuplicate_217.java

Within the file, write solution in function call as such:
public static returnType Solution() {}

Change Main.java to run the desired solution.
Run to see results.

## Running Code
Write test cases in the main function.
Format:
String[] testCases = {
    "[1,2,3,4,5]",
    "[6,7,8,9,0]
}

OR

String[] testCases = {
    "[racecar, carrace]",
    "[sample, ideas]"
}

IMPORTANT
If you need multiple types like int[], and int as input:
Change input Size variable to 2, this means you will use testCases[0] and testCases[1] as input and increment i by 2 in the for loop.
So format becomes:
int inputSize = 2;
String[] testCases = {
    "[1,2,3,4,5]","7",
    "[6,7,8,9,0], "20"
}

Use helper functions from InputHelper.java to convert test cases into a useable format for the solution function.

Change Main.java to run the desired solution.
Run to see results.