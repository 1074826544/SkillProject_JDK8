package com.guo.chapter07.stream;

import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月3日 下午4:28:56 
* @Description:stream 中skip 跳过前几个元素，截取新流
* @version 1.0
*/

/*
 * stream<T> skip (long n)
 * 
 */
public class Stream_skip {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("薇娅","李佳琪","大肥肥");
		Stream<String> stream2 = stream.skip(2);//跳过前两个元素
		stream2.forEach((String str)->{System.out.println(str);});
	}
}
