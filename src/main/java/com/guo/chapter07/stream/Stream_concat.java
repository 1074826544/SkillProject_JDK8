package com.guo.chapter07.stream;

import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月3日 下午4:31:08 
* @Description:stream中的静态方法concat方法，是组合
* @version 1.0
*/

/*
 * 如果有连个流，合并成为一个流，使用concat进行组合
 * static<>  stream
 */
public class Stream_concat {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("薇娅","李佳琪","大肥肥");
		Stream<String> stream2 = Stream.of("烈儿","范冰冰","李翔");
		//把两个stream 组合一个
		Stream<String> stream3 = Stream.concat(stream1, stream2);
		stream3.forEach((String name)->System.out.println(name));
	}
}
