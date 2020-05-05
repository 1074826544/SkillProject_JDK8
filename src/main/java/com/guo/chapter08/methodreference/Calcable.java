package com.guo.chapter08.methodreference;

/**
 * @author guoli
 * @Time 2020年5月3日 下午5:35:55
 * @Description:TODO
 * @version 1.0
 */
@FunctionalInterface
public interface Calcable {
//	定一个抽象方法，传递一个整数，对数据进行计算
	int calsAbs(int number);

}
