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
        return number+1;
    }

    /*
        2. Construct a friendly greeting
        Complete this method so that it accepts a name as an input and returns a friendly greeting
        with a smiley face. Example input and output:

        Input  | Output
        -------|-------
        Nathan | Hi, Nathan :)
        Edward | Hi, Edward :)
     */
    public String happilyGreet(String name) {
        return "Hi, " + name + " :)";
    }

    /*
        3. Construct an array of numbers
        Create a method named constructNumberArray that accepts two whole numbers named lower and upper.
        The method must return an array containing all the whole numbers between lower and upper,
        including lower and upper. Example input and output:

        Input  | Output
        -------|-------
        1, 3   | [1,2,3]
        10, 13 | [10,11,12,13]
        -1, 1  | [-1,0,1]
     */

    public int[] constructNumberArray(int lower, int upper){
        int count = upper-lower+1;
        int[] retArray = new int[count];
        for (int i = 0; i < count; i++){
            retArray[i] = lower+i;
        }
        return retArray;
    }


    /*
        4. Shout at a dev
        Create a method named shout that accepts a string and a whole number.
        The method must return the same string in upper case with exclamation marks (!) appended to the end.
        The number of exclamation marks appended must be determined by the number provided.
        Example input and output:

        Input       | Output
        ------------|-------
        disaster, 5 | DISASTER!!!!!
        error, 10   | ERROR!!!!!!!!!!
     */
    public String shout(String str, int num){
        StringBuilder sb = new StringBuilder();
        sb.append(str.toUpperCase());
        for(int i = 0; i < num; i++){
            sb.append("!");
        }
        return sb.toString();
    }



}
