package com.guo.chapter05.predicate;

import java.util.function.Predicate;

/** 
* @author guoli 
* @Time 2020年5月1日 上午8:56:04 
* @Description:逻辑表达式：可以连接多个判断条件
* && 与运算符
* || 或运算符
* ! 非（取反）
* @version 1.0
*/

/*
 	判断一个字符串，有连个判断条件
 	1.判断字符串横渡是否大于5
 	2.判断字符串是否包含a
 	两个必须同时满足
 	
 	predicate 接口中有个方法and
 */
public class Predicate_And_or {
	public static boolean method(String str,Predicate<String> pred1,Predicate<String> pred2) {
		//and 第一种方法
		//return pred1.test(str) && pred2.test(str);
		
		//and 第二种方法
//		return pred1.and(pred2).test(str);
		
		//or 第一种方法
		//return pred1.test(str) || && pred2.test(str);
				
		//or 第二种方法
		return pred1.or(pred2).test(str);
		
		
	}
	public static void main(String[] args) {
		String s="dgdabdfdss";
		boolean flag=method(s, (String str1)->{
			return str1.length()>5;
		}, (String str2)->{
			return str2.contains("a");
		});
		System.out.println(flag);
	}
}
