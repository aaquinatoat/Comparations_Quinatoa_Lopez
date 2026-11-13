Comparing Algorithms to Find Duplicate Numbers

In this exercise, I worked with Java to find repeated numbers in an array. My goal was to create two different solutions and compare the number of comparisons and the execution time of each one.

How it works

The program receives an array of integers and looks for the numbers that appear more than once.

I created two solutions:

Solution A: Uses two for loops to compare each number with the following elements in the array.

Solution B: Uses HashSet to store the numbers that have already been checked and find out if a number appeared before.

Both solutions display the duplicate numbers, the number of comparisons, and the execution time.

Example

For the following array:

int[] datos = {8, 3, 12, 8, 5, 9, 3, 20};

The expected result is:

Description

Result

Original array

8, 3, 12, 8, 5, 9, 3, 20

Duplicate numbers

8, 3

Comparisons in Solution A

28

Comparisons in Solution B

8

Tools I used

Java

JDK 24

NetBeans

Arrays

ArrayList

HashSet

Random

System.nanoTime()

Project files

src/
    Main.java
    Result.java
    SolutionA.java
    SolutionB.java

Running the project

First, I need to have Java JDK and a development environment such as NetBeans installed.

Then, I open the project and run the Main.java class.

The program first shows a small example and then runs tests with different array sizes:

8 elements.

100 elements.

1,000 elements.

10,000 elements.

100,000 elements.

1,000,000 elements.

For each size, the program runs three tests and calculates the average execution time.

How I organized the solutions

In Solution A, I used two for loops. The first loop goes through the array, and the second loop compares the current number with the elements that come after it. When it finds a repeated number, it saves it in a list.

In Solution B, I used a HashSet. First, it checks if the number already exists. If it exists, the number is a duplicate. If it does not exist, the program stores it for the next checks.

I also used the Result class to store the duplicate numbers, the comparisons, and the execution time of each solution.

Comparing the results

Solution A performs more comparisons when the array gets bigger because it uses two loops to check the numbers.

Solution B checks each element once and uses HashSet to find out if the number appeared before.

To compare execution times, I used System.nanoTime() and ran three tests for each array size. Then, I calculated the average time.

What I learned

With this exercise, I learned that the same problem can be solved in different ways. I also understood that the number of elements affects how much time an algorithm needs to run.

In addition, I practiced using arrays, lists, HashSet, loops, and execution time measurement in Java.

Author

Andy López y Antony Quinatoa
