package com.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class junit5Test_Calculator {
    @Test
    void addTest(){
        int result = Calculator.add(9,3);
        System.out.println("加法运算为："+result);
        assertEquals(12,result,"实际值与预期值结果不符");
    }

    @Test
    void subtractTest(){
        int result = Calculator.subtract(9,3);
        System.out.println("减法运算为："+result);
    }

    @Test
    void multiplyTest(){
        int result = Calculator.multiply(9,3);
        System.out.println("乘法运算为："+result);
    }

    @Test
    void divideTest(){
        int result = Calculator.divide(9,3);
        System.out.println("除法运算为:"+result);
    }

    @Test
    void countTest() throws InterruptedException{
        int result = Calculator.count(1);
        System.out.println("累加次数为："+result);
        result = Calculator.count(1);
        System.out.println("累加次数为："+result);
        result = Calculator.count(1);
        System.out.println("累加次数为："+result);
        result = Calculator.count(1);
        System.out.println("累加次数为："+result);
        result = Calculator.count(1);
        System.out.println("累加次数为："+result);
    }
}
