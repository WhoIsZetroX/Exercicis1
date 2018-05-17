package ex2;

import org.junit.jupiter.api.Assertions;

class MyMathTest {
    @org.junit.jupiter.api.Test
    void resolve_simple() {

                    /*a + b - c
                *      b - c + a
                *      a + b * c
                *      b * c + a
                *      a / b * c
                *      c * a / b*/

        Assertions.assertEquals(7, MyMath.getLastOperator("400+300-200".toCharArray()));

        /*Assertions.assertEquals(300, MyMath.resolve("400-300+200"));

        Assertions.assertEquals(60400, MyMath.resolve("400+300*200"));

        Assertions.assertEquals(120200, MyMath.resolve("400*300+200"));

        Assertions.assertEquals(266.6667f, MyMath.resolve("400/300*200"));

        Assertions.assertEquals(600, MyMath.resolve("400*300/200"));*/



    }

    @org.junit.jupiter.api.Test
    void resolve_complex() {

        /*a + b - c
                *      b - c + a
                *      a + b * c
                *      b * c + a
                *      a / b * c
                *      c * a / b*/

        int a=2,b=3,c=4;
        Assertions.assertEquals(1, MyMath.resolve(a+"+"+b+"-"+c));


    }

}