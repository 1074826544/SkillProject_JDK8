package com.guo.chapter05.predicate;

import java.util.function.Predicate;

/** 
* @author guoli 
* @Time 2020年5月1日 上午9:13:54 
* @Description:! 非（取反）
* @version 1.0
*/
public class Predicate_negate {
	public static boolean method(String str,Predicate<String> pred) {
		
		//! 第一种方法
		//return !pred.test(str) ;
		
		//negate 第二种方法
		return pred.negate().test(str);
	}
	public static void main(String[] args) {
		String s="abc";
		boolean flag=method(s, (String str)->{
			return str.length()>5;
		});
		System.out.println(flag);
	}
}
