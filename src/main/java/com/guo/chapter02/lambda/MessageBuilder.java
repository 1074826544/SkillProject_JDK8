package com.guo.chapter02.lambda;
/** 
* @author guoli 
* @Time 2020年4月29日 下午5:20:13 
* @Description:TODO
* @version 1.0
*/
@FunctionalInterface
public interface MessageBuilder {
	//拼接消息的抽象方法
	public abstract String builderMessage();
}
