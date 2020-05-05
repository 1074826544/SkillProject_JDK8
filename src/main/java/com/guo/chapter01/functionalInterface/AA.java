package com.guo.chapter01.functionalInterface;
/** 
* @author guoli 
* @Time 2020年5月3日 下午10:41:03 
* @Description:TODO
* @version 1.0
*/


/* 
 * 重要概念#############################################3
 * 
 * 如果一个接口中，只声明一个抽象方法， * 则此接口成为函数接口，
 * 在接口上使用关键字@FunctionalInterface注解
 * 
 * lambda表达式提供4个基本函数接口
 * 
 * 1.consumer：（康谁么）消费型接口， T，void 
 * 		对类型为T的对象应用操作，包含方法void.accpet(T)
 *
 * 2.supplier：（斯拍er）供给型接口 ，无，T
 * 		返回类型为T的对象，包含方法 get()
 * 
 * 3.Predicate：（p ru 看t）判断型接口，T，boolean 
 * 		确定类型为T的对象是否满足约束，并返回boolean值，包含方法：boolean test
 * 
 * 4.function：函数型接口 ，T，R
 * 		对类型为T的对象应用操作，并返回接口，结果的R类型的对象，包含方法 R apply（Tt）
 * 
 * 
 * 
 * 
 * 
 */
public class AA {

}
