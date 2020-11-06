package com.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class junit5Test_CalculatorAll {
    @Test
    void addTest(){
        int resultOne = Calculator.add(9,3);
        System.out.println(resultOne);

        int resultTwo = Calculator.add(3,3);
        System.out.println(resultTwo);

        int resultTre = Calculator.add(1,3);
        System.out.println(resultTre);

        assertAll("计算结果校验",
                ()-> assertEquals(12,resultOne,"实际值与期望值结果不符！"),
                ()-> assertEquals(5,resultTwo,"实际值与期望值结果不符！"),
                ()-> assertEquals(6,resultTre,"实际值与期望值结果不符！")
        );
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
