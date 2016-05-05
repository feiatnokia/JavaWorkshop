package com.wdmx.org.tests;

import com.wdmx.org.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wdmx
 * Date: 2016/4/26.
 */

public class CalculatorTest {

    Calculator calc;
    @Before
    public void init() {
        calc = new Calculator();
    }

    @Test
    public void add1and1() {
        Assert.assertEquals(calc.add(1, 1), 2);
    }

    @Test
    public void multiply2by2() {
        Assert.assertEquals(calc.multiply(2, 2), 4);
    }

    @Test
    public void subtract1from3() {
        Assert.assertEquals(calc.subtract(3, 1), 2);
    }
}
