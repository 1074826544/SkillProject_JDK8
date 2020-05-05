package com.guo.chapter04.consumer;

import java.util.function.Consumer;

/** 
* @author guoli 
* @Time 2020年4月30日 下午12:18:04 
* @Description:cunsumer接口默认方法andthen 拼接字符串
* 作用：需要两个consumer接口，可以把两个consumer接口组合到一起，在对数据进行消费
* @version 1.0
*/

/*
 	例如：
 	Consumer<String> cn1;
 	Consumer<String> cn2;
 	String s="hello";
 	
 	cn1.accept(s);
 	cn2.accept(s);
 	
 	连接两个consumer接口，在进行消费（前面先消费）
 	cn1.andThen(cn2).accpet(s);
 */

public class AndThen {
	
	public static void method(String s,Consumer<String> cn1,Consumer<String> cn2) {
//		cn1.accept(s);
//		cn2.accept(s);
		
		cn1.andThen(cn2).accept(s);//cn1连接cn2,先执行cn1消费数据
	}
	
	
	public static void main(String[] args) {
		method("Hello", (String str)->{
			//把字符串大写输出
			System.out.println(str.toUpperCase());
		}, (String str2)->{
			System.out.println(str2.toLowerCase());
		});
	}
}
