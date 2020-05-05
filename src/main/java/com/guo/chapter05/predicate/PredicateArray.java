package com.guo.chapter05.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/** 
* @author guoli 
* @Time 2020年5月1日 上午9:19:04 
* @Description:集合信息刷选
* @version 1.0
*/
public class PredicateArray {

	public static void main(String[] args) {
		String[] arr= {"薇娅,女","李佳琪,男","大飞分,女"};
		ArrayList<String> list=method(arr, (String str1)->{
			return str1.split(",")[1].equals("女");
		}, (String str2)->{
			return str2.split(",")[0].length()==3;
		});
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	public static ArrayList<String> method(String[] arr,Predicate<String> pred1,Predicate<String> pred2) {
		ArrayList<String> list=new ArrayList<String>();
		for (String str : arr) {
			boolean flag=pred1.and(pred2).test(str);
			if(flag) {
				list.add(str);
			}
		}
		return list;
	}
	
}
