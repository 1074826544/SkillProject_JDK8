package com.guo.chapter03.supplier;

import java.util.function.Supplier;

/** 
* @author guoli 
* @Time 2020年4月30日 上午9:31:24 
* @Description:常用的函数式接口
* @version 1.0
*/

//java.util.function.Supplier supplier<T> 接口仅仅包含一个无参的方法：T get()
//用来获取一个泛型参数指定类型的对象数据
//supplier<T> 接口成为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
public class SupplierDemo {
//	定义一个方法，方法参数传递supplier<T>接口，泛型执行string get方法返回字符串
	public static String getString(Supplier<String> sup) {
		return sup.get();
	}
	
	public static void main(String[] args) {
//		调用getString方法，方法的参数supplier是一个函数式接口，可以用lambda表达式
		String rest=getString(()->{
			return "aaa";
		});
		System.out.println(rest);
		
		
		
		//优化写法
		String rest2=getString(()-> "bbb"	);
		System.out.println(rest2);
	}
}
