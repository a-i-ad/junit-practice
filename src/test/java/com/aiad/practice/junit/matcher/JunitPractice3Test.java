package com.aiad.practice.junit.matcher;

import junit.framework.TestCase;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * 数字用のMatcher.
 * @author kishibashi
 */
public class JunitPractice3Test extends TestCase{
	

    public void testCloseTo(){
    	assertThat(1000d, closeTo(1001d, 0.1d));
    }
    public void testGreaterThan(){
    	assertThat(100, greaterThan(100));
    }
    public void testGreaterThanOrEqualTo(){
    	assertThat(100, greaterThanOrEqualTo(100));
    }
    public void testLessThan(){
    	assertThat(100, lessThan(100));
    }
    public void testLessThanOrEqualTo(){
    	assertThat(100, lessThanOrEqualTo(100));
    }


}
