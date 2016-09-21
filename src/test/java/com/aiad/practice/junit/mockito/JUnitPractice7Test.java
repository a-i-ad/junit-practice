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
import org.mockito.internal.util.reflection.Whitebox;

import junit.framework.TestCase;




public class JUnitPractice7Test extends TestCase {

	/**
	 * 1. SumServiecのモックを定義する。
	 */
	@Mock SumService service;
	@InjectMocks SumAction action;

	/**
	 * 2. MockitoAnnotationsを使ってMockを初期化する。
	 */
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	/**
	 * 3. actionとserviceが初期化されていることを確認する。
	 */
	public void testInit(){
		assertThat( action, notNullValue());
		assertThat( service, notNullValue() );
		assertThat( Whitebox.getInternalState(action, "sumService"), notNullValue());
	}
	/**
	 * 4. serviceの動作(1+1)を登録する。
	 * 5. actionを実行する。
	 * 6. assertする
	 * 7. serviceをverifyする
	 */
	public void testSum(){
		when(service.sum(1,1)).thenReturn(2);
		int sum = action.sum(1,1);
		assertThat(sum, equalTo(2));
		verify( service, times(1)).sum(1,1);
	}
	/**
	 * 8. actionのverifyができない事を確認する。
	 *    ただのオブジェクトだからね。
	 */
	public void testVerify(){
		verify( action, times(1)).sum(1,1);
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
