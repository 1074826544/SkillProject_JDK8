package com.guo.chapter04.consumer;

import java.util.function.Consumer;

/** 
* @author guoli 
* @Time 2020年4月30日 下午12:34:26 
* @Description:拼接打印信息 andThen 进行拼接
* @version 1.0
*/
public class PrintInfoAndThen {
	public static void printInfo(String[] array,Consumer<String> cn1,Consumer<String> cn2 ){
		for (String str : array) {
			cn1.andThen(cn2).accept(str);
		}
	}
	
	public static void main(String[] args) {
		String[] arr= {"薇娅,女","李佳琪,男"};
		
		printInfo(arr, (String arr1)->{
			System.out.println("姓名："+arr1.split(",")[0]);
		}, (String arr2)->{
			System.out.println("性别："+arr2.split(",")[1]);
		});
	}
}
