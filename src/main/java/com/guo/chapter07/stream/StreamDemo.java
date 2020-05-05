package com.guo.chapter07.stream;

import java.util.ArrayList;
import java.util.List;

/** 
* @author guoli 
* @Time 2020年5月1日 上午10:23:55 
* @Description:Stream
* @version 1.0
*/

/*
 * stream 流，其实是一个集合元素的函数模型，并非集合，也不是数据结构，不存储任何元素。
 * filter map skip 都是在对函数模型进行操作，集合元素并没有处理，只有count方法执行的时候，整个模型才会指定策略执行，lambda延迟执行特征
 * 
 * stream 元素是特定类型对象，形成一个队列，java中的stream并不是存储元素，而是按需计算
 * 数据源 流的来源，可以是集合，数组等等。
 * 
 * stream提供内部迭代方式，流可以直接调用遍历方法
 * 
 * 获取流：
 * stream<T> 1.collection集合都可以通过stream获取
 * 2.stream of 方法可以获，可传递参数，
 */
public class StreamDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("薇娅");
		list.add("李佳琪");
		list.add("达菲");
		list.add("烈儿");
		
//		对list集合中，开头是李的元素，并且名字三个字的，再进行遍历
		list.stream().filter(name->name.startsWith("李"))
		.filter(name->name.length()==3)
		.forEach(name->System.out.println(name));
	}
	
}
