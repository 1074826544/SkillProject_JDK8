package com.guo.chapter07.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

/** 
* @author guoli 
* @Time 2020年5月2日 上午10:08:01 
* @Description:获取stream流
* @version 1.0
*/

/*
 * 获取流：
 * stream<T> 1.collection集合都可以通过stream获取
 * 2.stream of 方法可以获，可传递参数，
 */


//延迟方法，返回类型仍然stream接口自身类型的方法，支持链式调用
//终结方法，返回类型不是stream接口类型count forEach方法。

//forEach 方法



/*
 * 
 */

public class GetStreamDemo {
	public static void main(String[] args) {
		//list转为stream流
		List<String> list=new ArrayList<String>();
		Stream<String> stream1 = list.stream();
		
		//set 获取流
		Set<String> set =new HashSet<String>();
		Stream<String> stream2 = set.stream();
		
		Map<String,String> map=new HashMap<String,String>();
		
		//map转为set 获取流
		Set<String> keySet = map.keySet();
		Stream<String> stream3 = keySet.stream();
		
		//map 转为collection 再获取流
		Collection<String> values = map.values();
		Stream<String> stream4 = values.stream();
		
		//map 获取keyvalue 映射关系 entrySet 在获取流
		Set<Entry<String,String>> entrySet = map.entrySet();
		Stream<Entry<String, String>> stream5 = entrySet.stream();
		
		//把数组转为Stream流
		Stream<Integer> stream6 = Stream.of(1,2,3,4,5);
		
		
//		可变参数可以传递数组
		Integer[] arr= {1,2,3,4,5};
		Stream<Integer> stream7 = Stream.of(arr);
		
		String [] arr2= {"1","2","3"};
		Stream<String> stream8 = Stream.of(arr2);
		
		
		
		
		
		
	}
}
