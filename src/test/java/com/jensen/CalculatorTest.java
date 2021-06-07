package com.jensen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator cal = new Calculator();
    double fv= 10.0;
    double sv = 5.0;
    @BeforeEach
    void setUp() {
      System.out.println("This is to test the different operation code");


    }

    @Test
    void getResult() {
        cal.result =  cal.getResult();
        assertNotNull(cal.getResult());
        assertNotNull(cal.result);
        assertEquals(cal.getResult(),cal.result);

    }

    @Test
    void setResult() {
        cal.result =  cal.getResult();
        cal.setResult(cal.result);
        assertNotNull(cal.result);
        assertNotNull(cal.getResult());
        assertEquals(cal.getResult(),cal.result);
    }

    @Test
    void getFirstValue() {
        cal.firstValue = 5;
        assertNotNull(cal.firstValue);
        assertEquals(5, cal.getFirstValue());
        assertNotEquals(8,cal.getFirstValue());
        assertNotNull(cal.getFirstValue());
    }

    @Test
    void setFirstValue() {
        cal.setFirstValue(10);
        assertNotNull(cal.firstValue);
        assertNotNull(cal.getFirstValue());
        assertEquals(cal.firstValue, cal.getFirstValue());
        assertEquals(10, cal.getFirstValue());
        assertNotEquals(6,cal.getFirstValue());
    }

    @Test
    void getSecondValue() {
        cal.secondValue = 5;
        assertEquals(5, cal.getSecondValue());
    }

    @Test
    void setSecondValue() {
        cal.setSecondValue(5);
        assertEquals(5, cal.getSecondValue());
        assertNotEquals(9,cal.getSecondValue());
        assertNotNull(cal.getSecondValue());
    }

    @Test
    @DisplayName("Check for addition of two numbers by calling execute function")
    void testAdder() {

        cal.setFirstValue(fv);
        cal.setSecondValue(sv);
        double result=cal.execute('a');
        System.out.println("The addition result is " + result);
        assertNotNull(cal.getResult());
        assertEquals(15, cal.getResult());
        assertEquals(cal.result, cal.getResult(),0.00);


    }

    @Test
    @DisplayName("Check for subtraction of two numbers by calling execute function")
    void testSubtract() {
        cal.setFirstValue(fv);
        cal.setSecondValue(sv);
        cal.execute('s');
        assertEquals(5, cal.execute('s'));
        System.out.println("The subtraction result is" + cal.getResult());
        assertNotNull(cal.getResult());
        assertEquals(cal.result, cal.getResult(),0.00);
    }

    @Test
    @DisplayName("Check for multiplication of two numbers by calling execute function")
    void testMultiply() {
        cal.setFirstValue(fv);
        cal.setSecondValue(sv);
        cal.execute('m');
        System.out.println("The multiplication result is" + cal.execute('m'));
        assertEquals(50, cal.getResult());
        assertNotNull(cal.getResult());
        assertEquals(cal.result, cal.getResult(),0.00);
    }

    @Test
    @DisplayName("Check for division of two numbers by calling execute function")
    void testDivision() {
        cal.setFirstValue(fv);
        cal.setSecondValue(sv);
        cal.execute('d');
        double result = cal.getResult();
        System.out.println("The division result is" + result);
        assertNotNull(result);
        assertEquals(2, result);
        assertEquals(cal.result, cal.getResult());

    }

    @Test
    @DisplayName("Check for division if second value is zero by calling execute function")
    void testIfSecondValueIsZero() {
        cal.setFirstValue(fv);
        cal.setSecondValue(0);
        double result = cal.execute('d');
        System.out.println("The division result is" + result);
        assertNotNull(result);
        assertEquals(0.0d, result);
        assertEquals(cal.result, cal.getResult(),0.00);

    }
    @Test
    @DisplayName("Check for invalid operation code by calling execute function")
    void testIfOperationCodeIsInvalid(){
        cal.setFirstValue(fv);
        cal.setSecondValue(sv);
        double result=cal.execute('#');
        System.out.println("The division result is" + result);
        assertNotNull(result);
        assertEquals(0.0d, result);
        assertEquals(cal.result, cal.getResult(),0.00);

    }

}

