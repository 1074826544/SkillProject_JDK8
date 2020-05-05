package com.guo.chapter07.stream;
/** 
* @author guoli 
* @Time 2020年5月3日 下午10:39:52 
* @Description:stream
* @version 1.0
*/

/*
 * 
 * 重要概念#############################################3
 * 
 * Stream API的理解
 * 
 * 1、stream关注的是对数据的运算，与CPU打交道
 * 集合关注的是数据存储，与内存打交道
 * 
 * 2、Java8提供一套API，使用这套API可以对内存中的数据进行过滤、排序、映射、归约等操作。
 * 类似于SQL对数据库中的表的相关操作
 * 
 * 
 * stream 注意点：
 * 
 * 1.stream自己不会存储元素
 * 2.stream不会改变源对象。可以返回一个持有结果的新stream
 * 3.stream 操作是延迟执行的，
 * 
 * stream的使用流程
 * 1.stream 的实例化
 * 2一系列的中间操作（过滤，映射，排序） （一个中间操作链，对数据源的数据进行处理）
 * 3.终止操作 （一旦执行终止操作foreach、count，并产生结果，之后不会被使用）
 * 
 * 
 * 中间操作友哪些
 * filter（过滤）
 * distinct（筛选）
 * limit 前几个元素截取
 * skip 跳过截取元素
 * 
 * 映射-中间操作
 * map(function)
 * mapToDouble (生成一个新的DoubleStream)
 * mapToInt (生成一个新的IntStream)
 * mapToLong（生成一个新的LongStrean）
 * fatMap（Function）将流中的每个值都换成另一个流，然后把所有流连接一个流
 * 
 * 匹配与查找
 * allMatch(Predicate p)是否匹配所有元素
 * anyMatch(Predicate p)是否至少匹配一个元素
 * noneMatch(Predicate p) 是否没有匹配所有的元素
 * findFirst() 返回第一个元素
 * findAny 返回当前流中的任意元素
 * 
 * 终止操作
 * count
 * max（Comparator c）
 * min(comparator c)
 * forEach(Consumer c)内部迭代
 * 
 * 
 * 归约
 * reduce ：可以将流中元素反复结合起来得到一个值，返回T
 * reduce（BinaryOPerator b）可以将流中元素反复结合起来，得optional值
 * 
 * 收集
 * collect（Collector c）姐流转为其他形式，接收一个collector接口实现。
 * 
 * 
 * collector需要使用collectors提供实
 * 例
 * Collectors
 * toList 把流中元素收集到list
 * toSet
 * tocollection 
 * 
 * 
 * 
 */
public class AA {

}
