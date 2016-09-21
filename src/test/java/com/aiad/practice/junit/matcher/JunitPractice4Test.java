package com.aiad.practice.junit.matcher;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * コレクション用のMatcher.
 * @author kishibashi
 */
public class JunitPractice4Test extends TestCase{
	List<String> list;
	
	public void setUp(){
		list = Arrays.asList("a","b");
	}
    public void testContains(){
    	assertThat(list ,contains("b","a"));
    }
    public void testHasItem(){
    	assertThat(list ,hasItem("a"));    	
    }
    public void testHasItems(){
    	assertThat(list ,hasItems("a","c"));    	
    }
    public void testHasSize(){
    	assertThat(list ,hasSize(3));    	
    }
    public void testEmpty(){
    	assertThat(list, empty());

    }
}
