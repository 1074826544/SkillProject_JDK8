package com.guo.chapter06.function;

import java.util.function.Function;

/** 
* @author guoli 
* @Time 2020年5月1日 上午9:56:35 
* @Description:function接口中有andthen方法，进来组合操作
* @version 1.0
*/

/*
 * 把String类型的“123”转为Integer类型，把转换后的结果加10，
 * 把增加之后的Integer类型数据，再转为STring类型。
 */
public class FunctionAndThen {
	
	public static void method(String str,Function<String, Integer> f1,Function<Integer, String> f2) {
		String s=f1.andThen(f2).apply(str);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		String s="123";
		method(s, (String str1)->{
			return Integer.parseInt(str1)+10;
		}, (Integer str2)->{
			return String.valueOf(str2);
		});
	}
	
}
