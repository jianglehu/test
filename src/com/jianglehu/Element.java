package com.jianglehu;

/**
 * 定义Elment类，表示线性表的数据域
 *
 * @param <T>
 */
public class Element<T> {
    public T el;

    public Element(T el) {
        this.el = el;
    }

    public Object getObject() {
        return el;
    }

    @Override
    public String toString() {
        return "Element{" +
                "el=" + el +
                '}';
    }
}
