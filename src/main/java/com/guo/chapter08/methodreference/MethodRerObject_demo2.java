package com.guo.chapter08.methodreference;

/**
 * @author guoli
 * @Time 2020年5月3日 下午5:17:36
 * @Description:TODO
 * @version 1.0
 */

/*
 * 通过对象名引用成员方法 使用前是对象名已经存在，成员方法已经存在 就可以使用对象名来引用成员方法
 */
public class MethodRerObject_demo2 {

	public static void printString(PrintTable p) {
		p.print("hello");
	}

	public static void main(String[] args) {
		printString((s) -> {
			// 创建MethodRerObject 对象
			MethodRerObject obj = new MethodRerObject();
			obj.printUpperCaseString(s);
		});

		/*
		 * 使用方法引用优化lambda 对象已存在MethodRerObject 成员方法已经存在printUpperCaseString
		 * 可以使用对象名引用成员方法
		 */
		MethodRerObject obj = new MethodRerObject();
		printString(obj::printUpperCaseString);
	}
}
