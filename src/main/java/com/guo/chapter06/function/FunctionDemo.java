package com.guo.chapter06.function;

import java.util.function.Function;

/** 
* @author guoli 
* @Time 2020年5月1日 上午10:12:28 
* @Description:练习：自定义函数模型拼接
* @version 1.0
*/

/*
 * 请使用function进行函数模型拼接
 * String str="薇娅，35"
 * 1.将字符串截取数字年龄部分，得到字符串
 * 字符串转为int类型数字
 * 将int数字加2，得到数字
 */
public class FunctionDemo {

	public static void method(String str,Function<String, Integer> f1,Function<Integer, String> f2) {
		String rest=f1.andThen(f2).apply(str);
		System.out.println(rest);
	}
	
	public static void main(String[] args) {
		 String str="薇娅,35";
		 method(str, (String f1)->{
			 String sex=f1.split(",")[1];
			 return Integer.parseInt(sex)+2;
		 }, (Integer num)->{
			 return num+"";
		 });
	}
}
