package com.booleanuk.core;

import com.booleanuk.helpers.ExerciseBase;

public class Exercise extends ExerciseBase {
    /*
        A method is a function, a single piece of logic that can run. In Java, a class is a convenient
        encapsulation of related state and behaviour; members contain state (values like ints, strings, etc.),
        and methods perform behaviours. You've been using String methods in previous exercises, now it's time
        to start writing your own.

        Methods are defined by a signature line followed by a set of curly braces. The code inside the curly
        braces is the logic specific to that method, and any variables created in those curly braces
        are not accessible to any other method or class outside that method.

        The signature line describes the method and is constructed in the following format:
        visibility returnType nameOfMethod(inputs)

        You must specify what data type the method outputs (returnType) when it finishes running, or use `void`
        if it doesn't output anything. You can name a method anything you like but the name should be descriptive
        and short. Methods can also take inputs, which require data types and names, which is can use inside its
        logic. See the example below and take some time to break it down and understand it.
     */

    /*
        0. Example requirement
        Create a method that accepts a name and returns a greeting
     */
    public String greet(String name) {
        return "Hello " + name + "!";
    }

    /*
        1. Increment a number
        Complete this method so that it increases the number given by 1 and returns the result
     */
    public int increment(int number) {
        return number + 1;
    }
    System.out.println("Test check");

    /*
        2. Construct a friendly greeting
        Complete this method so that it accepts a name as an input and returns a friendly greeting
        with a smiley face. Example input and output:

        Input  | Output
        -------|-------
        Nathan | Hi, Nathan :)
        Edward | Hi, Edward :)
     */
    // same as in previous one, first name what type it is (number(int) or a string (String)) than the name of the variable
    public String happilyGreet(String name) {
        String greet = "Hi, " + name + " :)";
         return greet;
    }

    /*
        3. Construct an array of numbers
        Create a method named constructNumberArray
        that accepts two whole numbers named lower and upper.
        The method must return an array containing all the whole numbers between lower and upper,
        including lower and upper. Example input and output:

        Input  | Output
        -------|-------
        1, 3   | [1,2,3]
        10, 13 | [10,11,12,13]
        -1, 1  | [-1,0,1]
     */
        public int[] constructNumberArray (int lower, int upper) { //Create a method that accepts two integers and will return an array
            //lower = 10, upper = 13
            int length = upper - lower; //determine length to know how many times to loop through the array
            int count = lower; //create counter variable to keep track of our position in the array (starting from lower)
            int[] array = new int[length+1]; //create an empty array, specify how many numbers will be in that array (length+1)
            for (int i = 0; i <= length; i++) { //create for loop that runs through array. i starts at index 0 and ends at length
                array[i] = count; //At index of i, insert count value into array
                count++; //increases count by one
            }
            // array[0] = 10;
            // array[1] = 11;
            // array[2] = 12;
            // array[3] = 13;
            return array;
        }



    /*
        4. Shout at a dev
        Create a method named shout that accepts a string and a whole number.
        The method must return the same string in upper case
        with exclamation marks (!) appended to the end.
        The number of exclamation marks appended must be determined by the number provided.
        Example input and output:

        Input       | Output
        ------------|-------
        disaster, 5 | DISASTER!!!!!
        error, 10   | ERROR!!!!!!!!!!
     */

        public String shout (String word, int number) { //create a method named shout that will return a String and accepts a String and an integer
            String exclamations = ""; //Create an empty string to hold the exclamations (!)

            for (int i = 1; i <= number; i++) { //create a loop starting at 1 and ending at number to add the exclamations
                exclamations = exclamations + "!"; //In each loop, add an extra exclamation, until we have reached the number
            }
            return word.toUpperCase() + exclamations; //returns the string in uppercase followed by the exclamations
        }


}
