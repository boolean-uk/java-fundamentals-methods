package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionTest {
    Extension extension;

    public ExtensionTest() {
        this.extension = new Extension();
    }

    @Test
    public void bakingTime() {
        Assertions.assertEquals(50, this.extension.bakingTime());
    }

    @Test
    public void remainingBakeTime() {
        Assertions.assertEquals(30, this.extension.remainingBakeTime(20));
        Assertions.assertEquals(40, this.extension.remainingBakeTime(10));
        Assertions.assertEquals(0, this.extension.remainingBakeTime(50));
    }

    @Test
    public void calculatePrepTime() {
        Assertions.assertEquals(6, this.extension.calculatePrepTime(2));
        Assertions.assertEquals(9, this.extension.calculatePrepTime(3));
        Assertions.assertEquals(3, this.extension.calculatePrepTime(1));
    }

    @Test
    public void totalTimeSpent() {
        Assertions.assertEquals(26, this.extension.totalTimeSpent(2, 20));
        Assertions.assertEquals(49, this.extension.totalTimeSpent(3, 40));
        Assertions.assertEquals(15, this.extension.totalTimeSpent(0, 15));
        Assertions.assertEquals(0, this.extension.totalTimeSpent(0, 0));
    }
}
