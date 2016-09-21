package com.aiad.matcher;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import junit.framework.TestCase;

/**
 * 一般的なMatcher.
 * @author kishibashi
 *
 */
public class JUnitPractice1Test extends TestCase{
	
	public void testTrue(){
		assertTrue(false);
	}
	public void testEquals(){
		assertEquals(10,12);
	}	
	public void testIs(){
		assertThat("a",is("b"));
	}
	public void testEqualTo(){
		assertThat("a", equalTo("b"));
	}
	public void testNot(){
		assertThat("a", not(equalTo("a")) );		
	}
	public void testNullValue(){
		assertThat("a" , nullValue() );
	}
	public void testNotNullValue(){
		String a = null;
		assertThat(a , notNullValue() );
	}
	public void testSameInstance(){
		assertThat("a", sameInstance(new String("a")));
	}
	public void testInstanceOf(){
		assertThat("a", instanceOf(Integer.class));
		
	}
}
