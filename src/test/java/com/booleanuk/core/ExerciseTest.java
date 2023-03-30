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


}
