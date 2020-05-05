package com.guo.chapter07.stream;

import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月3日 下午4:09:09 
* @Description:map方法
* @version 1.0
*/

/*
 * 如果将stream流中的元素映射到另一个流中，可以使用map方法
 * map(function<?,s>)
 * 改接口需要function函数式接口参数，可以将当前流中的T类型转换为另一个R类型流
 * function apply
 */
public class Stream_map {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("1","2","3","4");
		
//		使用map方法，把字符串转为整数类型
		Stream<Integer> streamNew=stream.map((String str)->{
			return Integer.parseInt(str);
			});
		streamNew.forEach((Integer num)->System.out.println(num));
	}
}
