package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    // Let's make a cake!

    /*
        5. Create a method named bakingTime that returns the number 50
     */

    public int bakingTime(){
        return 50;
    }


    /*
        6. Create a method named remainingBakeTime that accepts one input:
        - the number of minutes the cake has been in the oven

        It must return how many minutes are left to bake based on the input
        and the result of calling the bakingTime method
     */

    public int remainingBakeTime(int remTime){
        return bakingTime()-remTime;
    }




    /*
        7. Create a method named calculatePrepTime that accepts one input:
        - the number of layers the cake has

        It must return how many minutes it will take to prepare the cake based on
        each layer taking 3 minutes to prepare
     */

    public int calculatePrepTime(int layers){
        return 3*layers;
    }


    /*
        8. Create a method named totalTimeSpent that accepts two inputs in this order:
        - the number of layers the cake has
        - the number of minutes the cake has already been in the oven

        It must return how many minutes in total you have spent making the cake,
        which is the sum of the preparation time and the number of minutes it's been
        in the oven. Use your calculatePrepTime method in the calculation
     */
    public int totalTimeSpent(int layers, int timeSpent){
        return calculatePrepTime(layers)+timeSpent;
    }



}
