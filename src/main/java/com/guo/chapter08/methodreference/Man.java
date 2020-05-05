package com.guo.chapter08.methodreference;

/**
 * @author guoli
 * @Time 2020年5月3日 下午5:49:45
 * @Description:定义子类 super使用引用父类
 * @version 1.0
 */
public class Man extends Human {

	@Override
	public void sayHello() {
		System.out.println("hello 我是man");
	}

	// 定义方法参数传递greatable接口
	public void method(Greatable g) {
		g.great();
	}

	public void show() {
		// 调用method方法，方法参数是greatable是函数式
		method(() -> {
			// 创建父类
			Human h = new Human();
			h.sayHello();
		});
		/*
		 * 子父类关系，所有存在的一个super，代替父类 可以使用supper调用父类成员
		 * 
		 */
		method(() -> super.sayHello());

		/*
		 * 使用super引用类的成员方法
		 * 
		 */
		method(super::sayHello);
	}

	public static void main(String[] args) {
		new Man().show();
	}
}
