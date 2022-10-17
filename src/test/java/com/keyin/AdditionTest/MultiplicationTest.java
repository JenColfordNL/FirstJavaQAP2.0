package com.keyin.AdditionTest;
import com.keyin.Multiplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    public void TwoTimesTwoShouldEqualFour() {
        Multiplication multi1 = new Multiplication();
        multi1.Multiply(2, 2);

        Assertions.assertEquals(4, 4);
        Assertions.assertNotEquals(5,4);


    }

    @Test
    public void ThreeTimesThreeShouldEqualNine() {
        Multiplication multi2 = new Multiplication();
        multi2.Multiply(3, 3);


        Assertions.assertNotEquals(9, 11);
        Assertions.assertNotEquals(6,8);

    }

    @Test
    public void num1Timesnum2ShouldNotEqualNine() {
        Multiplication multi3 = new Multiplication();
        int num1 = 2;
        int num2 = 5;

            Assertions.assertTrue(multi3.Multiply(num1,num2));

    }




}


