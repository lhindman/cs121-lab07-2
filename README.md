# Lab07 Guide
## Getting Started
[Lab Introduction Video](https://youtu.be/y6G2ucQTEBw)
- Please clone the [Mod07 Code Examples](https://github.com/lhindman/cs121-mod07-examples.git).
- Please watch the [Activity 5 Walkthough Videos](https://www.youtube.com/playlist?list=PLbxWwkW_BhyAyr--jgUd-naSUUj8NfihJ).  


### Code Style Requirements
Please review the [CS121 Style Guide](https://docs.google.com/document/d/1LWbGQBKkApnNAzzgwOSvRM03DmhYWx5yEfecT2WXfjI/edit?usp=sharing) and apply it in all lab activities and projects this semester. Coding Style will assessed as part of your lab and project grades.

### Code Quality Requirements
- Code must compile without warnings using openjdk11
- Code must run without errors or warnings on safe-path and edge test cases
- More to come as we learn about input validation and exception handling  
## Activity 1 - NumberCounter
### Problem Description
Design and implement an application that reads an arbitrary number of integers that are in the range 0 to 50 inclusive and counts how many occurrences of each are entered. After all input has been processed, print all of the values (with the number of occurrences) that were entered one or more times. User input must be validated and invalid input should be handled gracefully.

### Implementation Guide
1. Expand the folder named A1-NumberCounter and create a new file named NumberCounter.java
2. Design a program to satisfy the requirement in the Problem Description and enter the program code in NumberCounter.java
3. Test the program and pay particular attention to boundary/edge cases and invalid input.
4. Commit the changes to your local repository with a message stating that Activity 1 is completed.
5. Push the changes from your local repository to the github classroom repository.

## Activity 2 - NumberStats
### Problem Description
Design and implement an application that creates a histogram that allows you to visually inspect the frequency distribution of a set of values. The program should read in an arbitrary number of integers that are in the range of 1 to 100 inclusive; then it should produce a chart similar to the following on that indicates how many input values fell in the range 1 to 10, 11 to 20, and so on. Print one asterisk for each value entered.

     1 - 10   | *****  
    11 - 20   | **  
    21 - 30   | *************************  
    31 - 40   |   
    41 - 50   | ***  
    51 - 60   | *******  
    61 - 70   | **  
    71 - 80   | *****  
    81 - 90   | *******  
    91 - 100  | *********  

### Implementation Guide
1. Expand the folder named A2-NumberStats and create a new file named NumberStats.java
2. Design a program to satisfy the requirements in the Problem Description and enter the program code in NumberStats.java
3. Test the program and pay particular attention to boundary/edge cases and invalid input.
4. Commit the changes to your local repository with a message stating that Activity 2 is completed.
5. Push the changes from your local repository to the github classroom repository.

## Activity 3 - BubbleSorter
### Problem Description
Design and implement an application that fills an array with random numbers and uses the Bubble Sort algorithm to sort the contents of the array.  

The details for this activity are in the guide below:

[BubbleSorter Activity Guide](https://docs.google.com/document/d/1P92BHqXGEkyCTdoOBWESo1iF7h1p6KSMtuJPaHNd6bU/edit?usp=sharing)

### Impementation Guide
1. Expand the folder named A3-BubbleSorter and create two new files named BubbleSorter.java and Driver.java
2. Implement the program as specified in the BubbleSorter Activity Guide
3. Test the program using the run link above the main method
4. Commit the changes to your local repository with a message stating that Activity 3 is completed.
5. Push the changes from your local repository to the github classroom repository.


## Activity 4 - QuickDraw Game
### Problem Description
Design and implement an application that plays the Quick Draw Game.  

The details for this activity are in the guide below:

[QuickDraw Activity Guide](https://docs.google.com/document/d/1wickOaQSKScPR0EAizBDAdmYBEj1JXJwiNuzzFji8-Q/edit?usp=sharing)

### Impementation Guide
1. Expand the folder named A4-QuickDraw and create two new files named DeckOfCards.java and QuickDraw.java
2. Implement the program as specified in the QuickDraw Activity Guide
3. Test the program using the run link above the main method
4. Commit the changes to your local repository with a message stating that Activity 4 is completed.
5. Push the changes from your local repository to the github classroom repository.

## Activity 5 - Gradebook Revisited
### Problem Description
Redesign the Gradebook application created in Lab05 to use arrays instead of the ArrayList class.  The initial size of the gradebook internal array should start at 4 elements and should used the heuristic discussed in the lecture to grow the array by doubling its size each time it runs out of space.  A gradebook csv file containing 1000+ student records has been provided.

### Implementation Guide
1. Copy Gradebook.java, Student.java, and gradebook.csv from Lab05 into the A5-Gradebook folder.
2. Modify Gradebook.java satisfy the requirements in the Problem Description 
3. Test the program using the gradebook-xl.csv dataset
4. Commit the changes to your local repository with a message stating that Activity 5 is completed.
5. Push the changes from your local repository to the github classroom repository


