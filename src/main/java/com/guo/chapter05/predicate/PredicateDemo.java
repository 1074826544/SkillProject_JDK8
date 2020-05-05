package com.guo.chapter05.predicate;

import java.util.function.Predicate;

/** 
* @author guoli 
* @Time 2020年5月1日 上午8:46:41 
* @Description:对某种数据类型进行判断，得到boolean值接口 Predicate，test
* @version 1.0
*/
public class PredicateDemo {
	
	public static boolean checkString(String str,Predicate<String> pred) {
		return pred.test(str);
	}
	
	public static void main(String[] args) {
		String s="abcdecd";
	boolean flag=checkString(s, (String str)->{
		return str.length()>5;
	});
	System.out.println(flag);
	}
}
