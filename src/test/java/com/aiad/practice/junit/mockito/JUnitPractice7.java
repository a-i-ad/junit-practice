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

/**
 * @Mockと@InjectMocksを用いたテスト
 * @author kishibashi
 */
public class JUnitPractice7 extends TestCase {

	/**
	 * 1. {@Mock}, {@InjectMocks}を指定してモック化する。
	 */
	SumService service;
	SumAction action;

	/**
	 * 2. MockitoAnnotationsを使ってMockを初期化する。
	 */
	public void setUp(){

	}
	/**
	 * 3. actionとserviceが初期化されていることを確認する。
	 */
	public void testInit(){

	}
	/**
	 * 4. serviceの動作(1+1)を登録する。
	 * 5. actionを実行する。
	 * 6. assertする
	 * 7. serviceをverifyする
	 */
	public void testSum(){

	}
	/**
	 * 8. actionのverifyができない事を確認する。
	 *    ただのオブジェクトだからね。
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
