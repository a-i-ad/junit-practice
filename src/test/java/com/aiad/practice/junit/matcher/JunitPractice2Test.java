package com.aiad.practice.junit.matcher;

import org.hamcrest.text.IsEqualIgnoringCase;

import junit.framework.TestCase;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


/**
 * 文字列用のMatcher.
 * @author kishibashi
 */
public class JunitPractice2Test extends TestCase{
	
	public void testStartsWith(){
		assertThat("aaa", startsWith("b"));
	}
    public void testEndsWith(){
    	assertThat("aaa", endsWith("b"));
    }
    public void testContainsString(){
    	assertThat("aaa", containsString("b"));
    }
    public void testEqualToIgnoreCase(){
    	assertThat("Abc", equalToIgnoringCase("abC"));
    }
    public void testIsEmptyString(){
    	assertThat("", isEmptyString());
    }

}


