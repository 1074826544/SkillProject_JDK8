package com.guo.chapter02.lambda;
/** 
* @author guoli 
* @Time 2020年4月29日 下午5:29:57 
* @Description:使用lambda作为参数返回值
* @version 1.0
*/

//******如果一个方法的传递参数是一个函数接口，接口中只有一个抽象方法，可以使用lambda表达式
public class DemoRunnable {
	
	public static void StartThread(Runnable run) {
		new Thread(run).start();
	}
	public static void main(String[] args) {
		//传递接口匿名内部类。
		StartThread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"--启动");
			}
		});
		
		//使用lambda 表达式
		StartThread(()->{
			System.out.println(Thread.currentThread().getName()+"--启动");});
		
		
		//使用lambda表达式简化写法
		StartThread(()->
		System.out.println(Thread.currentThread().getName()+"--启动"));
	}
		
}
