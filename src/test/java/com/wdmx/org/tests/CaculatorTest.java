package com.wdmx.org.tests;

import com.wdmx.org.Caculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by f2gao on 2016/4/26.
 */
public class CaculatorTest {

    Caculator calc;
    @Before
    public void init() {
        calc = new Caculator();
    }

    @Test
    public void add1and1() {
        Assert.assertEquals(calc.add(1, 1), 2);
    }

    @Test
    public void multiple2and2() {
        Assert.assertEquals(calc.multiple(2, 2), 4);
    }
}
