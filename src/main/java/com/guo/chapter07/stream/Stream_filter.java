package com.guo.chapter07.stream;

import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月3日 下午4:01:19 
* @Description:filter对stream数据进行过滤
* @version 1.0
*/

//Predicate


public class Stream_filter {
	
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("薇娅","李佳琪","大肥肥");
		Stream<String> streamNew = stream.filter((String name)->{return name.startsWith("李");});
		streamNew.forEach(name->System.out.println(name));
	}
	
	/*
	 * 特点
	 * stream 流属于管道流，只能被消费一次
	 * 第一次stream流调用完毕方法，数据就会流转到下一次stream上，
	 * 而这时第一个stream流已经使用完毕，就会关闭
	 * 所有第一个stream流不能调用
	 */
}
