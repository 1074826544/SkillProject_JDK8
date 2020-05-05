package com.guo.chapter02.lambda;
/** 
* @author guoli 
* @Time 2020年5月3日 下午10:40:38 
* @Description:TODO
* @version 1.0
*/



/*  
 * 重要概念#############################################3
 *  格式：
 *  lambda操作符或箭头操作符
 *  左边是lambda形参列表（其实就是接口中的抽象方法的形参列表）
 *  右边是lambda体（其实就是重写抽象方法的方法体）
 *  
 *  lambda几种方式
 *  1. 无参数，无返回
 *  Runnable r1=()->{System.out.println("hello");};
 *  
 *  2.需要一个参数，但没有返回值
 *  Consumer<String> con=(String str)->{System.out.println("hello");};
 *  
 *  
 *  3.数据类型可以省略，  一个参数，但没有返回值
 *  Consumer<String> con=(str)->{System.out.println("hello");};
 *  
 *  
 *  4.一个参数时，参数的小括号可以省略
 *  Consumer<String> con= str->{System.out.println("hello");};
 *  
 *  
 *  5、需要两个以上的参数，多条直线语句，并可以返回值
 *  Comparator<Integer> con=(x,y)->{
 *  System.out.println("实现函数式接口方法");
 *  return Integer.compare(x,y);
 *  }
 *  
 *  
 *  6.lambda体只有一条语句是，return 与大括号若有，都可以省略
 *   Comparator<Integer> con=(x,y)-> Integer.compare(x,y);
 *  
 *  
 *  总结 左边：lambda形参列表的参数可以省略，
 *  如果lambda形参表只有一个参数，其一对（）也可以省略
 *  
 *  右边：lambda体 应该使用一对{}包裹，
 *  如果lambda体只有一条执行语句，可能是return语句，省略{}和return关键字

 */
public class AA {

}
