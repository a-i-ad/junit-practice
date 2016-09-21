package com.aiad.practice.junit.matcher;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Map及び集合用のMatcher.
 * @author kishibashi
 */
public class JunitPractice5Test extends TestCase{
	Map<String,String> map = new HashMap<>();
	
	public void setUp(){
		map.put("a", "a");
		map.put("b", "b");
	}
	
    public void testHasKey(){
    	assertThat( map, hasKey("c"));
    }
    public void testHasValue(){
    	assertThat( map, hasValue("c"));
    }
    public void testAllOf(){
    	assertThat( map, allOf( hasKey("a"), hasKey("b")));
    }
    public void testAnyOf(){
    	assertThat( map, anyOf( hasKey("A"), hasKey("c")));
    }
}
