# ASD-Task_8
Task №8 for Advanced Software Design by Application not responding team

## Applied methods: ##
**Problem A. Key Word in Context (KWIC)** - Pipes-and-filters\

The program consists of four main modules:
1. **Input Module:** This module is responsible for reading input data. It reads lines of text from the console until it encounters an empty line, and saves them to a list.
2. **Circular Shift Module:** This module performs a cyclic shift of words in each line. It takes a list of strings from the Input Module, splits each string into words, and then creates several new strings for each string, shifting the words to the left by one word each time. The result is saved in a new list.
3. **AlphabeticalSortModule:** This module sorts the strings received from CircularShiftModule in alphabetical order. It just uses Collections.sort() to perform sorting.
4. **Output Module:** This module is responsible for output of results to the console. It takes a sorted list of strings and displays it on the screen.

The sequence of application of modules: Input Module -> Circular Shift Module -> Alphabetic Sort Module -> Output Module.

**Problem B. Eight Queens (8Q)** - Abstract Data Types

1. Queen class is used to represent the queen on the chessboard. It has two private fields row and col, which represent the coordinates of the queen on the board. This class also contains the methods getRow(), getCol(), and isAttacking(Queen other), which allow you to get information about the position of the queen and check whether one queen attacks the other.
Queen is an abstract data type that provides abstraction for queens and their interactions.


2. The EightQueens class presents the problem of placing eight queens on a chessboard in such a way that they do not beat each other.
The constructor of this class defines the size of the board and creates an array of queens to store queens. This class also contains a solutionsCount variable to track the number of solutions found.
The placeQueens() method solves the problem using a recursive algorithm. He tries to place queens on the board, checking that they do not attack each other, and increases solutionsCount when finding a valid solution.
EightQueens is an abstract data type that provides an abstraction for solving the eight queens problem.

3. The Problem_B_runner class is client code that interacts with the abstract data types EightQueens and Queen.
It requests the size of the chessboard from the user, creates an instance of EightQueens, solves the problem and outputs the number of solutions found.

## How to run "Problem A" application: ###

### Steps: ###
1. Open command console in project directory.
2. Enter "cd runners" in console.
3. Enter "java -jar problem_a.jar" to run application.
4. Enter lines of text and then when you finish typing just press "Enter" on an empty line.
5. See the result of the program.

*Important! To run the program, Java version 8 and higher must be installed on the computer*
### Template for input data: ###
**Enter:** "This is an example of text." **(Then press Enter)**\
**Enter:** The KWIC method is very useful. **(Then press Enter)**\
**Enter:** We use it for text analysis. **(Then press Enter)**\
**Enter:** Keywords help quickly find information. **(Then press Enter)**\
**Enter:** Example - this is a keyword in the first sentence. **(Then press Enter)**\
**Press Enter again to finish entering data**

## How to run "Problem B" application: ##

### Steps: ###
1. Open command console in project directory.
2. Enter "cd runners" in console.
3. Enter "java -jar problem_b.jar" to run application.
4. Enter the size of the playing field and then press "Enter".
5. See the result of the program.

*Important! To run the program, Java version 8 and higher must be installed on the computer*

### Template for input data: ###
**Enter:** "8" **(Then press Enter)**
