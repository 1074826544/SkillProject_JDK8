package com.guo.chapter04.consumer;

import java.util.function.Consumer;

/** 
* @author guoli 
* @Time 2020年4月30日 上午10:20:41 
* @Description:Consumer 
* @version 1.0
*/
//consumer<T> 接口则正好是supplier接口相反
//他不是生产一个数据，而是使用一个数据，旗数据类型是泛型决定
//consumer 接口包含抽象方法 void accept指定使用一个泛型数据

//consumer接口是一个消费型接口，泛型执行什么类型，就可以使用accpet方法使用什么类型数据
//消费（使用）
public class ConsumerDemo {
	
		/*
		 	定义一个方法
		 	方法传递一个字符串的姓名
		 	方法参数传递consumer接口，使用Sting泛型
		 	
		 */
	public static void method(String name,Consumer<String> con) {
		con.accept(name);
	}
	public static void main(String[] args) {
		method("薇娅", (String name)->{
			//传递的字符串进行消费
			//消费方式：直接输出字符串
			System.out.println(name);
			
			//消费方式，把字符串进行反转输出
			String rest_name=new StringBuffer(name).reverse().toString();
			System.out.println(rest_name);
		});
	}
}
