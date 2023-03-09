package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExtensionTest {
    Extension extension;

    public ExtensionTest() {
        this.extension = new Extension();
    }

    @Test
    @Order(1)
    public void bakingTime() {
        Assertions.assertEquals(50, this.extension.bakingTime());
    }

    @Test
    @Order(2)
    public void remainingBakeTime() {
        Assertions.assertEquals(30, this.extension.remainingBakeTime(20));
        Assertions.assertEquals(40, this.extension.remainingBakeTime(10));
        Assertions.assertEquals(0, this.extension.remainingBakeTime(50));
    }

    @Test
    @Order(3)
    public void calculatePrepTime() {
        Assertions.assertEquals(6, this.extension.calculatePrepTime(2));
        Assertions.assertEquals(9, this.extension.calculatePrepTime(3));
        Assertions.assertEquals(3, this.extension.calculatePrepTime(1));
    }

    @Test
    @Order(4)
    public void totalTimeSpent() {
        Assertions.assertEquals(26, this.extension.totalTimeSpent(2, 20));
        Assertions.assertEquals(49, this.extension.totalTimeSpent(3, 40));
        Assertions.assertEquals(15, this.extension.totalTimeSpent(0, 15));
        Assertions.assertEquals(0, this.extension.totalTimeSpent(0, 0));
    }
}
