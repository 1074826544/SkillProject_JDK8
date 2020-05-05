package com.guo.chapter02.lambda;


/** 
* @author guoli 
* @Time 2020年4月29日 下午5:13:21 
* @Description:日志案例
* @version 1.0
*/
public class DemoLogger {
	//定义一个根据日志的基本，显示日志信息方法
	public static void showLog(int level,String message) {
		//对日志的等级进行判断，
		if(level==1) {
			System.out.println(message);
		}
	}
	public static void main(String[] args) {
		
		String meg1="hello";
		String meg2="world";
		String meg3="java";
		
		showLog(2,meg1+meg2+meg3 );
	}
}
