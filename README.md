# Module 7 Lab Guide (part 2)

## Lab Activity 2 - Mandelbrot
First some background on the Mandelbrot set, please watch [Mandelbrot Sets Back to Basics by Numberphile](https://youtu.be/FFftmWSzgmk) before proceeding with this Lab.

### Problem Description
Generating a Mandelbrot set is a classic Computer Science and Mathematics exercise that we are going to use to demonstrate arrays.  In this activity you will write an application that generates a Mandelbrot set in a two dimensional array of integer values. Each location within the two dimensional array represents a pixel on the display panel with the value at index [0][0] representing the upper left corner of the panel and index [numRows - 1] [numCols - 1] representing the pixel in the lower right corner of the panel. The value stored at each index represents the number of iterations of the Mandelbrot equation before that cell "fell" out of the set. 

Having a two dimensional array of integer values, is great, but not very useful.  In order to visualize this Mandelbrot set, you will need to provide a color palette that will map a given number of iterations to a Color. To do this you will write a function that will generate an array of Color objects where the objects sorted at index [0] will be the Color to use for 0 iterations, index [1] will be the Color to use for 1 iterations, and so forth up to index [MAX_ITERATIONS -1] which should be the Color black.



### Implementation Guide
1. Expand the folder named A1-NumberCounter and create a new file named NumberCounter.java
2. Design a program to satisfy the requirement in the Problem Description and enter the program code in NumberCounter.java
3. Test the program and pay particular attention to boundary/edge cases and invalid input.
4. Commit the changes to your local repository with a message stating that Activity 1 is completed.
5. Push the changes from your local repository to the github classroom repository.


## Coding Journal (Optional)
Keep a journal of your activities as you work on this lab. Many of the best engineers that I have worked with professionally have kept some sort of engineering journal. I personally packed notebooks around with me for nearly 8 years before I began keeping my notes electronically.   

Your journal can track ideas, bugs, cool links, code snippets, shell commands, rants, or simply a reflection on what worked well or not-so-well with this lab activity. I will not be grading the content of your journal, but I will expect at least two timestamped journal entries of at least a 75 to 150 words each added to the provided Journal.md file.  The purpose of this component is to help develop the habit of taking notes and creating documentation while you code. The more detail you provide the better as that will help you if you ever need to refer back to this project in the future.

## Markdown Resources
Markdown is a notation that is used to format text documents.  It is widely used in Software Development shops around the world, which is why we're asking you to use it in your lab documentation.  

Github provides a guide for getting started:  [Mastering Markdown](https://guides.github.com/features/mastering-markdown/)

