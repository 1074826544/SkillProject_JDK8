package com.guo.chapter06.function;

import java.util.function.Function;

/** 
* @author guoli 
* @Time 2020年5月1日 上午9:47:59 
* @Description:Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据
* @version 1.0
*/

/*
 * 抽象方法apply
 * function即可最主要的抽象方法为R apply(T t)，
 * 根据类型T参数获取类型R的接口
 * 
 * 例如：把String类型转换Integer类型
 */
public class FunctionApply {

	public static void method(String str,Function<String, Integer> function) {
		Integer num=function.apply(str);
		System.out.println(num);
	}
	public static void main(String[] args) {
		String s="123";
		method(s,(String str)->{
			return Integer.parseInt(str);
		});
	}

}
