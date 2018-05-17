package ex1;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    @org.junit.jupiter.api.Test
    void resolve() {
        Assertions.assertEquals(21, MyMath.resolve("20+1"));
        Assertions.assertEquals(21, MyMath.resolve("1+20"));

        Assertions.assertEquals(21, MyMath.resolve("22-1"));
        Assertions.assertEquals(-21, MyMath.resolve("1-22"));

        Assertions.assertEquals(50, MyMath.resolve("10*5"));
        Assertions.assertEquals(50, MyMath.resolve("5*10"));

        Assertions.assertEquals(25, MyMath.resolve("50/2"));
        Assertions.assertEquals(0.2f, MyMath.resolve("2/10"));

    }

}