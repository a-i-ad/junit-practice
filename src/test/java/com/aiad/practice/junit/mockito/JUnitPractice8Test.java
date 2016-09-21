package com.aiad.practice.junit.mockito;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.internal.util.reflection.Whitebox;

import junit.framework.TestCase;

/**
 * @Spyを用いたテスト
 * @author kishibashi
 */
public class JUnitPractice8Test extends TestCase {

	/**
	 * 1. SumServiecのモックを定義する。
	 *    actionはspy化する。
	 */
	@Mock SumService service;
	@InjectMocks @Spy SumAction action;

	public void setUp(){
		MockitoAnnotations.initMocks(this);
		when(service.sum(1,1)).thenReturn(2);
		int sum = action.sum(1,1);
	}
	/**
	 * 2. actionもverifyできる事を確認する。
	 */
	public void testVerify(){

		
	}
	
	

	public static class SumAction{
		private SumService sumService;
		
		public int sum(int i, int j){
			return sumService.sum(i,j);
		}
	}
	
	public static class SumService{
		
		public int sum(int...args){
			int sum=0;
			for(int i : args){
				sum+=i;
			}
			return sum;
		}
		
		
	}
	
}
