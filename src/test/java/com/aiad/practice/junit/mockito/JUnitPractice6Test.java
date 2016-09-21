package com.aiad.practice.junit.mockito;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import junit.framework.TestCase;




public class JUnitPractice6Test extends TestCase {

	/**
	 * 1. SumServiecのモックを定義する。
	 */
	SumService service = mock(SumService.class);

	/**
	 * 2. そのまま1+1を実行して戻り値を確認
	 */
	public void testMock1(){
		int sum = service.sum(1,1);
		assertThat(sum, equalTo(2));
	}
	/** 
	 * 3. whenで1+1の動作を登録して実行し、動作が登録されていることを確認。
	 */
	public void testMock2(){
		when(service.sum(1,1)).thenReturn(2);
		int sum = service.sum(1,1);
		assertThat(sum, equalTo(2));
	}
	/**
	 * 4. anyIntと'1'の組み合わせの動作を確認
	 */
	public void testAny1(){
		when(service.sum( eq(1), anyInt())).thenReturn(2);
		int sum = service.sum(1,1);
		assertThat(sum, equalTo(2));
	}
	/**
	 * 5. anyIntとeq(1)の組み合わせの動作を確認
	 */
	public void testAny2(){
		when(service.sum( eq(1), anyInt())).thenReturn(2);
		int sum = service.sum(1,1);
		assertThat(sum, equalTo(2));
	}
	/**
	 * 6. verifyで一回呼び出されたことを確認する。
	 */
	public void testVerify(){
		when(service.sum( eq(1), anyInt())).thenReturn(2);
		int sum = service.sum(1,1);
		assertThat(sum, equalTo(2));
		
		verify(service, times(1)).sum( anyInt(), anyInt() );
	}
	/**
	 * 7. テストが変わればmockが初期化されていることを確認する
	 */
	public void testVerify2(){
		
		verify(service, times(1)).sum( anyInt(), anyInt() );
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
