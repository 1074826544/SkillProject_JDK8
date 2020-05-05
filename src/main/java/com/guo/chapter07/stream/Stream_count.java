package com.guo.chapter07.stream;

import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月3日 下午4:16:02 
* @Description:stream中的count方法是终结方法，元素个数
* @version 1.0
*/


/*
 * stream 流count方法  返回一个long值代表元素个数
 */
public class Stream_count {
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("薇娅","李佳琪","大肥肥");
		long restCount=stream.count();
		System.out.println(restCount);
	}
}
