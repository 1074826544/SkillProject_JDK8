package com.guo.chapter08.methodreference;

/**
 * @author guoli
 * @Time 2020年5月3日 下午5:00:45
 * @Description:方法引用
 * @version 1.0
 */

/*
 * 打印一个函数式接口
 */
@FunctionalInterface
public interface PrintTable {
	// 打印字符串的抽象方法
	void print(String s);
}
