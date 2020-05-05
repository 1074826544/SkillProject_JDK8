package com.guo.chapter01.functionalInterface;
/** 
* @author guoli 
* @Time 2020年4月29日 下午4:54:31 
* @Description:函数式接口的事业，一般作为方法参数和返回值类型
* @version 1.0
*/



public class Demo {
	//定义一个方法，参数使用函数式接口
	public static void show(MyFuntionalInterface myfunction){
		myfunction.method();
	}
	
	public static void main(String[] args) {
		//调用show方法，方法的参数是一个接口，所以可以传接口实现对象
		show(new MyFuntionalInterfaceImpl());
		
		
		//调用show方法，方法参数是一个接口，可以使用传递接口匿名内部类
		show(new MyFuntionalInterface() {
			
			public void method() {
				System.out.println("使用匿名内部重新接口中的抽象方法");
				
			}
		});
		
		//Lambda 表达式 Lambda 允许把函数作为一个方法的参数
		// 调用show方法，方法的参数是一个函数式接口，
		show(()-> {
			System.out.println("使用lambda表达式重新接口中的抽象方法");
		});
		
		
		//简化lambda接口使用
		show(()->System.out.println("简化lambda接口使用"));
	}
	
	//函数式 编程  lambda 的延迟运行 
}
