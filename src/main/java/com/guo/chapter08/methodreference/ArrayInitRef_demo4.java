package com.guo.chapter08.methodreference;


/**
 * @author guoli
 * @Time 2020年5月3日 下午6:53:25
 * @Description:数组的构造器引用 (int[]::new)
 * @version 1.0
 */
public class ArrayInitRef_demo4 {
	public static int[] initArray(int length, ArrayBuilder arrayBuilder) {
		return arrayBuilder.buildArray(length);
	}

	public static void main(String[] args) {
		int[] arr = initArray(10, length -> new int[length]);
		System.out.println(arr.length);

		/*
		 * 数组的构造引用 优化 int[]::new
		 */
		int[] arr2 = initArray(10, int[]::new);
		System.out.println(arr2.length);

	}
}
