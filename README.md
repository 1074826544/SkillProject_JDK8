# SkillProject_JDK8
java 8 至 11 主要的特性，代码体现


/* 
 * 重要概念##############java 8#########函数式接口######################3
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
 
 /*  
 * 重要概念######################## lambda#####################3
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
 
 /*
 * 
 * 重要概念########################Stream API#####################3
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
 
 
 /*
 * 重要概念###############方法引用##############################3
 * 
 * 方法引用
 * 
 * 理解：当要传递给lambda体的操作，已经实现的方法了，可以使用方法引用
 * 
 * 格式：
 * 类（或对象）：：方法名
 * 
 * 有三种情况：
 * 1. 对象：：非静态方法
 * 2.类：：静态方法
 * 3.类：非静态方法
 * 
 * 接口中的抽象方法的形参列表和返回值类型与方法引用的方法形参列表和返回值类型相同，
 * 针对第一种和第二种
 * 
 * 
 * 
 * 当函数式接口方法的第一个参数是需要引用方法的调用者，第二个参数是需要引用方法的参数（或无参数）时，ClassName::mehtodeName
 *  针对第三种
 * 
 * 
 * 如果给函数式接口提供实例，正好满足方法引用的情况。
 * 
 * 
 * 
 */


/*
 * 重要概念#######################Optional类######################3
 * 
 * java.util.Optional类
 * 理解：为了解决java中空指针问题而生
 * 
 * 常用方法
 * of
 * empty()
 * ofNullable
 * 
 * isPresent
 * ifPresent
 * 
 * get
 * orElse
 * orElseGet
 * toElseThow
 * 
 */
 
 
 
 
 
