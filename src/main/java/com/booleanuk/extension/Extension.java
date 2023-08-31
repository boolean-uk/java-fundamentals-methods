package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    // Let's make a cake!

    /*
        5. Create a method named bakingTime that returns the number 50
     */

    @Override
    public int bakingTime() {
        return 50;
    }

    /*
        6. Create a method named remainingBakeTime that accepts one input:
        - the number of minutes the cake has been in the oven

        It must return how many minutes are left to bake based on the input
        and the result of calling the bakingTime method
     */

    @Override
    public int remainingBakeTime(int done) {
        return bakingTime() - done;
    }

    /*
        7. Create a method named calculatePrepTime that accepts one input:
        - the number of layers the cake has

        It must return how many minutes it will take to prepare the cake based on
        each layer taking 3 minutes to prepare
     */

    @Override
    public int calculatePrepTime(int layers) {
        return layers * 3;
    }

    /*
        8. Create a method named totalTimeSpent that accepts two inputs in this order:
        - the number of layers the cake has
        - the number of minutes the cake has already been in the oven

        It must return how many minutes in total you have spent making the cake,
        which is the sum of the preparation time and the number of minutes it's been
        in the oven. Use your calculatePrepTime method in the calculation
     */

    @Override
    public int totalTimeSpent(int layers, int done) {
        return calculatePrepTime(layers) + done;
    }
}
