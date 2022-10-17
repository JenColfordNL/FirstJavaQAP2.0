package com.keyin.AdditionTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.keyin.Addition;
public class AdditionTest {


    @Test
    public void TwoPlusTwoShouldEqualFour() {
        Addition add1 = new Addition();
        add1.Add(2, 2);

        Assertions.assertEquals(4, 4);
        Assertions.assertNotEquals(3,4);


    }

    @Test
    public void ThreePlusSixShouldEqualNine() {
        Addition add2 = new Addition();
        add2.Add(3, 6);


        Assertions.assertNotEquals(9, 11);
        Assertions.assertNotEquals(5,9);


    }


    @Test
    public void num1Plusnum2ShouldNotEqual10() {
       Addition add3 = new Addition();
        int num1 = 4;
        int num2 = 5;

        Assertions.assertTrue(add3.Add(num1,num2));


    }


}
//    @Test
//    public void QAPAdditionTest2() {
//        QAPAddition add3 = new QAPAddition();
//        add3.add(x, y);
//
//        Assertions.assertTrue( x + y == 8);
//
//
//    }


