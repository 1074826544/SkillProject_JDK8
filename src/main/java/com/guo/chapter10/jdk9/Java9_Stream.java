package com.guo.chapter10.jdk9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月4日 下午5:43:28 
* @Description:TODO
* @version 1.0
*/
/*
 * JDK 9 stream 增加了
 * 
 * 	增加了4个新方法
	1.takewhile
	2.dropWhile
	3.ofNullable
	4.itrate
 */
public class Java9_Stream {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,23,45,6,75,44);
		
		System.out.println("takeWhile");
		//判断数组里小于40的元素		
		list.stream().takeWhile(x->x< 40 ).forEach(System.out::println);
		
		System.out.println("dropWhile");
		//返回剩余的操作与 takeWhile 相反
		list.stream().dropWhile(x->x< 40 ).forEach(System.out::println);
		
		System.out.println("ofNullable");
		//of 参数中 多个元素可以有null的， 存储单独一个null不行
		Stream<Integer> stream = Stream.of(1,3,4,5,null);
//		Stream<Integer> stream2 = Stream.of(null);//单独存储一个null不行
		
		//只允许一个元素
		Stream<Integer> stream3 = Stream.ofNullable(1);
		
		System.out.println("iterate");
		//JDK 8  特性无限流
		Stream.iterate(0, x->x+1).limit(5).forEach(System.out::println);
		
//		JDK 9 特性 有个终止条件
		Stream.iterate(0, x->x<10, x->x+1).forEach(System.out::println);
		
		
	}
}
