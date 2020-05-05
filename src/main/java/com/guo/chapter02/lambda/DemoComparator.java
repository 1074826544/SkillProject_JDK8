package com.guo.chapter02.lambda;
/** 
* @author guoli 
* @Time 2020年4月29日 下午5:39:42 
* @Description: Comparator
* @version 1.0
*/
//如果一个方法返回值类型是一个函数接口，就可以直接返回一个lambda表达式，
//通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器是。可以调该方法获取

import java.util.Arrays;
import java.util.Comparator;

public class DemoComparator {

	//方法的返回值类型使用函数式接口comparator
	public static Comparator<String> getComparator(){
		//第一种方法：方法的返回值是一个接口，可返回这个接口的匿名内部类
		/*
		  return new Comparator<String>() {
		  @Override 
		  public int compare(String o1, String o2) { 
			  return o2.length()-o1.length(); }
		  
		  };
		 */
		
//	第二种方法	方法的返回值是一个函数式接口，可以返回一个lambda表达式
		/*
		return (String o1, String o2)->{
			return o2.length()-o1.length();
		};
		*/
		
//	第三种方法 
		return (String o1, String o2)->
			 o2.length()-o1.length();
	}
	
	public static void main(String[] args) {
		String[] arr= {"a","bbb","c","ddddddddd"};
		System.out.println(Arrays.toString(arr));//[a, bbb, c, ddddddddd]
		//调用Arrays中的sort方法排序
		Arrays.sort(arr,getComparator());
		System.out.println(Arrays.toString(arr));//[ddddddddd, bbb, a, c]
		
	}
}
