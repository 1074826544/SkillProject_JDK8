package com.guo.chapter07.stream;

import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月3日 下午4:19:47 
* @Description:stream 中limit方法（取用前几个limit）
* @version 1.0
*/

/*
 * limit 方法可以对流进行截止方法，是延迟方法
 * stream<T> limit(long maxSize);
 * 
 */
public class Stream_limit {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("薇娅","李佳琪","大肥肥");
		Stream<String> stream2 = stream.limit(2);//取前两个元素
		stream2.forEach((String str)->{System.out.println(str);});
	}
}
