package com.guo.chapter02.lambda;
/** 
* @author guoli 
* @Time 2020年4月29日 下午5:19:08 
* @Description:优化日志案例  lambda特点：延迟加载，必须存在函数式接口
* @version 1.0
*/
public class DemoLogger2 {
	//定义一个显示日志的方法，方法参数传递日志等级和messageBuilder接口
	
	public static void showLog(int level, MessageBuilder builder) {
		//对日志等级进行判断
		if(level==1) {
			String mes=builder.builderMessage();
			System.out.println(mes);
		}
	}
	public static void main(String[] args) {
		
		String meg1="hello";
		
		String meg2="world";
		
		String meg3="java";
		
		//调用showlog方法，使用lambda，提供性能，如果不满足不拼接字符串
		
		showLog(1, ()->{
			//返回一个字符串
			return meg1+meg2+meg3;
		});
		
		
	}
	
	
}
