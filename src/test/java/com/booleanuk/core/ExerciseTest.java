package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    public void shouldGreetName() {
        Assertions.assertEquals("Hello Nathan!", this.exercise.greet("Nathan"));
    }

    @Test
    public void shouldIncrementNumber() {
        Assertions.assertEquals(1, this.exercise.increment(0));
        Assertions.assertEquals(6, this.exercise.increment(5));
    }

    @Test
    public void shouldFriendlyGreet() {
        Assertions.assertEquals("Hi, Nathan :)", this.exercise.happilyGreet("Nathan"));
        Assertions.assertEquals("Hi, Edward :)", this.exercise.happilyGreet("Edward"));
        Assertions.assertEquals("Hi, Lewis :)", this.exercise.happilyGreet("Lewis"));
    }

    @Test
    public void shouldConstructNumberArray() {
        int[] nums = this.exercise.constructNumberArray(10, 13);
        Assertions.assertEquals(4, nums.length);
        Assertions.assertEquals(10, nums[0]);
        Assertions.assertEquals(11, nums[1]);
        Assertions.assertEquals(12, nums[2]);
        Assertions.assertEquals(13, nums[3]);
    }

    @Test
    public void shouldShout() {
        Assertions.assertEquals("DISASTER!!!!!", this.exercise.shout("disaster", 5));
        Assertions.assertEquals("ERROR!!!!!!!!!!", this.exercise.shout("error", 10));
    }

    @Test
    public void bakingTime() {
        Assertions.assertEquals(50, this.exercise.bakingTime());
    }

    @Test
    public void remainingBakeTime() {
        Assertions.assertEquals(30, this.exercise.remainingBakeTime(20));
        Assertions.assertEquals(40, this.exercise.remainingBakeTime(10));
        Assertions.assertEquals(0, this.exercise.remainingBakeTime(50));
    }

    @Test
    public void calculatePrepTime() {
        Assertions.assertEquals(6, this.exercise.calculatePrepTime(2));
        Assertions.assertEquals(9, this.exercise.calculatePrepTime(3));
        Assertions.assertEquals(3, this.exercise.calculatePrepTime(1));
    }

    @Test
    public void totalTimeSpent() {
        Assertions.assertEquals(26, this.exercise.totalTimeSpent(2, 20));
        Assertions.assertEquals(49, this.exercise.totalTimeSpent(3, 40));
        Assertions.assertEquals(15, this.exercise.totalTimeSpent(0, 15));
        Assertions.assertEquals(0, this.exercise.totalTimeSpent(0, 0));
    }
}
