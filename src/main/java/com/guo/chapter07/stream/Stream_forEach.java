package com.guo.chapter07.stream;

import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月3日 下午3:55:24 
* @Description:TODO
* @version 1.0
*/



//延迟方法，返回类型仍然stream接口自身类型的方法，支持链式调用
//终结方法，返回类型不是stream接口类型count forEach方法。

//forEach 方法
/*
 * forEach 用来遍历流中的数据,
 * 是终结方法，遍历之后不能继续调用stream流中的方法
 */
public class Stream_forEach {
	
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("薇娅","李佳琪","大肥肥");
		stream.forEach((String name)->System.out.println(name));
		
	}
}
