package com.aiad.practice.junit.mockito;

import static org.mockito.Matchers.contains;
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

import org.hamcrest.Matchers;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.util.reflection.Whitebox;

import junit.framework.TestCase;




public class JUnitPractice9Test extends TestCase {

	@Mock SumService service;
	@InjectMocks SumAction action;

	/**
	 * 1. Integer用のArgumentCaptorを用意。
	 */
	ArgumentCaptor<Integer> intCaptor = ArgumentCaptor.forClass(Integer.class);

	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	/**
	 * 2. 何かと何かを足すと2を返すよう設定する。「何か」と「何か」をArgumentCaptorでキャプチャする。
	 * 3. 適当な入力でactionを実行する。
	 * 4. assert文で、実行に用いた引数がキャプチャされている事を確認する。
	 */
	public void testSum(){
		
		when(service.sum( intCaptor.capture() ,intCaptor.capture())).thenReturn(2);
		int sum = action.sum(5,6);
		assertThat( intCaptor.getAllValues(), Matchers.contains(5,6));
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
