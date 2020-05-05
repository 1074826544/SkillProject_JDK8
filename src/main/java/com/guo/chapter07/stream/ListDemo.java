package com.guo.chapter07.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月2日 上午9:36:26 
* @Description:集合进行过滤
* @version 1.0
*/
public class ListDemo {
	public static void main1(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("薇娅");
		list.add("李佳琪");
		list.add("达菲");
		list.add("烈儿");
		
		List<String> listA=new ArrayList<String>();
		for (String s : list) {
			if(s.startsWith("李")) {
				listA.add(s);
			}
		}
		
		List<String> listB=new ArrayList<String>();
		for (String s : listA) {
			if(s.length()==3) {
				listB.add(s);
			}
		}
		for (String s : listB) {
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("薇娅是");
		list.add("李佳琪");
		list.add("达菲");
		list.add("烈儿");
		
		
		//名字是三个字的，取前两个
		Stream<String> stream1=list.stream().filter((name->name.length()==3)).limit(2);
		
		
		List<String> list2=new ArrayList<String>();
		list2.add("张飒");
		list2.add("张珊珊");
		list2.add("张莎莎");
		list2.add("是多少");
		
//		过滤张。从第二个元素开始取。
		Stream<String> stream2=list2.stream().filter(name->name.startsWith("张")).skip(2);
		
		//把steam1和stream2合并数据，在转换person对象，
		Stream<Person> stream3=Stream.concat(stream1,stream2).map(name->new Person(name));
		//stream3 遍历，打印person中的name
		stream3.forEach(p->System.out.println(p.getName()));
	}
	
	
}
