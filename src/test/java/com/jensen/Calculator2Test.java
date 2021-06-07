package com.jensen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2Test {
    Calculator2 cal2 = new Calculator2();
int number1 =10;
int number2 =5;
int result;
int callCounter=0;
    @BeforeEach
    void setUp() {

    }

    @Test
    @DisplayName("Check for addition of two numbers")
    void add() {
        cal2.quote();
        int result= cal2.add(number1,number2);
   System.out.println("The addition result is"+result);
        assertEquals(15,result);
        assertNotNull(result);
        assertNotEquals(10,result);
    }

    @Test
    @DisplayName("Check for subtraction of two numbers")
    void subtract() {
        cal2.quote();
        int result = cal2.subtract(number1,number2);
        System.out.println("The subtraction result is"+result);
        assertEquals(5,result);
        assertNotNull(result);
        assertNotEquals(10,result);
    }

    @Test
    @DisplayName("Check for multiplication of two numbers")
    void multiply() {
        cal2.quote();
        int result= cal2.multiply(number1,number2);
        System.out.println("The multiplication result is"+result);
        assertEquals(50,result);
        assertNotEquals(25,result);
        assertNotNull(result);
    }

    @Test
    @DisplayName("Check for division of two numbers")
    void divide() {
        cal2.quote();
        int result= cal2.divide(number1,number2);
        System.out.println("The division result is"+result);
        assertEquals(2,result);
        assertNotEquals(10,result);
    }

    @Test
    @DisplayName("Check for reverse of a string name")
    void testReverse() {
        cal2.quote();
        String name ="Mirror";
        String reverseName = cal2.reverse(name);
        System.out.println("The reversed name is"+reverseName);
        assertEquals("rorriM",reverseName);
        assertNotNull(reverseName);
        assertNotEquals(name,reverseName);
    }
    @Test
    void quote(){
        cal2.quote();
    }



    @Test
    void getCounter() {
        assertNotEquals(callCounter,cal2.getCounter());
    }
}