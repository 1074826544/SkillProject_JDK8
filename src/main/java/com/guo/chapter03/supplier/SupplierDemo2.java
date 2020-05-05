package com.guo.chapter03.supplier;

import java.util.function.Supplier;

/** 
* @author guoli 
* @Time 2020年4月30日 上午9:39:36 
* @Description:Supplier 获取int
* @version 1.0
*/
public class SupplierDemo2 {
	public static int getInt(Supplier<Integer> sup) {
		return sup.get();
	}
	
	public static void main(String[] args) {
		//数组中的最大值是：
		int[] arr= {100,50,800,-70};
		
		int rest=getInt(()->{
			//获取数组的最大值，并返回
			//把数组中的第一个元素赋值该变量
			int max=arr[0];
			//遍历数组
			for (int i : arr) {
				if(i>max) {
					max=i;
				}
			}
			return max;
		});
		System.out.println("数组中的最大值是"+rest);
	}
}
