package com.guo.chapter12.jdk11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Optional;

/** 
* @author guoli 
* @Time 2020年5月5日 上午11:50:36 
* @Description:TODO
* @version 1.0
*/
public class Java11Tests {
	/*
	 * java 11 特性 String 中的新增的方法
	 */
	public static void main1(String[] args) {
//		isBlank(); 去掉空白
		System.out.println("isBlank(); 去掉空白");
		System.out.println("   ".isBlank());//true
		
		//strip() 去除首尾的空白
		System.out.println("strip"+"\t abc \t \n".strip());
		
		
//		"".stripLeading() 去除首部空白
		System.out.println("stripLeading"+ "\t abc \t \n".stripLeading());
		
//		"".stripTrailing(); 去除尾部空白
		System.out.println("\t abc \t \n".stripTrailing());
		
//		"".repeat() 复制几次
		String str1="abc";
		String str2=str1.repeat(2);
		System.out.println("repeat \t"+str2);
		
		
//		str3.lines().count() 判断字符串有多少行
		String str3="abc";
		System.out.println(str3.lines().count());
		
	}
	
	/*
	 * java 11 特性二：Optional
	 */
	public static void main2(String[] args) {
		Optional<Object> op = Optional.empty();
		System.out.println(op.isPresent());//哦按的内部的value是否存在false
		System.out.println(op.isEmpty());//判断内部的value 是否为空true
		
		op=Optional.of("abc");
		//orElseThrow  value非空，返回value。否则bug
		Object orElseThrow = op.orElseThrow();
		System.out.println(orElseThrow);
	}
	
	/*
	 * Java 11 特性3 局部变量类型推断的升级 从10引进来的
	 */
	public static void main3(String[] args) {
//		var
	}
	
	/*
	 * Java 11 特性4 HttpClient 替换原有的httpUrlConnection
	 */
	public static void main4(String[] args) {
		try {
			HttpClient client=HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder(URI.create("http://192.168.1.1/login.html")).build();
			BodyHandler<String> responseBodyHandler = BodyHandlers.ofString();
			HttpResponse<String> response = client.send(request, responseBodyHandler);
			String body = response.body();
			System.out.println(body);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
