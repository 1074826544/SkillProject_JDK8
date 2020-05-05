package com.guo.chapter08.methodreference;

/**
 * @author guoli
 * @Time 2020年5月3日 下午5:02:40
 * @Description:字符串进行打印
 * @version 1.0
 */

/*
 * 方法引用符 双冒号::引用运算符，成为方法引用 lambda表达式写法：s->System.out.println(s);
 * 方法引用写法：System.out::println
 * 
 * 第一种语义是，拿到参数之后经过lambda之手，传递给System.out.println方法处理 第二种：直接让System.out中的println
 * 方法来取代lambda。这种方法比较简洁。
 */
public class PrintTable_demo01 {
	public static void printString(PrintTable p) {
		p.print("hello");
	}

	public static void main(String[] args) {
		// 调用pringString方法，方法参数printTable是函数式接口，可以用lambda
		printString((s) -> System.out.println(s));

		/*
		 * 
		 * 分析 lambda表达式母的，打印参数传递的字符串 把参数s传递sysout，对象，调用out对象方法printl对象输出
		 * 
		 * 1.System.out 对象是已经存在 2.println 方法已经存在 可以使用方法来引用lambda 可以调用System.out
		 * 方法直接引用println方法
		 * 
		 */

		// ::冒号是引用符
		printString(System.out::println);

	}

}
