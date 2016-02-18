package com.mitong.fangdeniu.entity.parser;

/**
 * @author tong.mi
 * @email tong.mi@qunar.com
 * @date 16-2-18
 * @decription
 */
public interface Parser<T, E> {
    /**
     * 将e转换成T类型对象
     * @param e
     * @return
     * */
    T parse(E e);
}
