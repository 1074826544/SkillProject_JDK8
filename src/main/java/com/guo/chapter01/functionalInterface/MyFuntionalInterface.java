package com.guo.chapter01.functionalInterface;

/*
 	函数式接口：只有一个抽象方法的接口  
 	@FunctionalInterface 注解
 	作用：可以检测接口是否是一个函数式接口，是：编译成功，不是编译失败
 */

/** 
* @author guoli 
* @Time 2020年4月29日 下午4:37:52 
* @Description:函数式接口 demo
* * @version 1.0
*/
@FunctionalInterface
public interface MyFuntionalInterface {
	
	public abstract void method();
}
	
