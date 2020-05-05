package com.guo.chapter09.optional;

import java.util.Optional;

import com.guo.chapter07.stream.Person;

/** 
* @author guoli 
* @Time 2020年5月3日 下午9:06:25 
* @Description:optional 为了解决空指针异常，java.util.optional<T>
* @version 1.0
*/

/*
 * optional<T> 
 * 避免空指针
 */
public class Optional_demo {
	private static Optional<Person> ofNullable;

	public static void main(String[] args) {
		Person s=new Person();
		s.setName("小明");
		/*
		 * 分析：optional 有哪些方法如下
		 */
		//1. 创建optional类对象的方法。
		Optional<Person> optional1=Optional.of(s);//创建一个optional实例，T必须非空
		Optional<Person> optional2=Optional.empty();//创建一个空的optional实例
		Optional<Person> optional3=Optional.ofNullable(s);// 可以为null
		
//		2.判断optional容器中是否包含对象
		boolean flag=optional1.isPresent();//判断是否包含对象
		if(flag) {
			optional1.filter((a)->a.getName().equals("小明"))
			.ifPresent((a)->a.setName("明明"));;////用于对过滤出的数据如果存在。如果经过过滤条件后，有数据的话就可以进行修改。
	
			Person person = optional1.get();//获取对象
			System.out.println(person.getName());
			
			//如果内部的T是空，则返回orElse方法中的参数
			Person person2 =optional2.orElse(new Person("小芳"));
			System.out.println("orElse \t"+person2.getName());
			
			
		}
		
		
		
		
	}
}
