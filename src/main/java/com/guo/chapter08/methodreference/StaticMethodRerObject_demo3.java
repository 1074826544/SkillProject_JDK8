package com.guo.chapter08.methodreference;

/**
 * @author guoli
 * @Time 2020年5月3日 下午5:34:30
 * @Description:静态方法引用
 * @version 1.0
 */

/*
 * 通过类名引用静态成员 类已经存在 静态成员方法存在 就可以使用引用静态
 */

public class StaticMethodRerObject_demo3 {

	public static int method(int number, Calcable calcable) {
		return calcable.calsAbs(number);
	}

	public static void main(String[] args) {
		int rest = method(-2, (int n) -> {
//			对参数进行绝对值计算并返回
			return Math.abs(n);// 是 Math 中的一个静态方法，通过 Math.abs() 调用。（Math 不是构造器）
		});
		System.out.println(rest);

		/*
		 * 使用方法引用优化lambda math类存在 abs计算绝对值静态方法也存在 直接可以使用静态方法进行引用
		 * 
		 */
		int rest2 = method(-10, Math::abs);
		System.out.println(rest2);

		/*
		 * this 成员方法，调用
		 */
//	method(this::方法名);	

	}

	/*
	 * 类的构造器引用 类名称::new 的格式标识
	 * 
	 */
//	method(类名：：new)

	/*
	 * 数组的构造引用
	 * 
	 */

}
