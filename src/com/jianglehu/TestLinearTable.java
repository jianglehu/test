package com.jianglehu;

import org.junit.Test;


public class TestLinearTable {
    @Test
    public void test1() {
        LinearTable<Integer> table = new LinearTable<Integer>();
        table.init();
        Element<Integer> e1 = new Element<>(1);
        Element<Integer> e2 = new Element<>(2);
        Element<Integer> e3 = new Element<>(3);
        table.addEl(e1);
        table.addEl(e2);
        table.addEl(e3);
        System.out.println("展示所有元素:");
        table.showAll();
        //测试删除
        System.out.println("测试删除");
        System.out.println(">>>>>>>>>>>>>>>>>");
        table.delete(0);
        table.showAll();
        //测试根据下标查询
        System.out.println("测试根据下标查询");
        System.out.println(">>>>>>>>>>>>>>>>>");
        System.out.println(table.queryElByIndex(0));
        //测试根据元素查下标
        System.out.println("测试根据元素查下标");
        System.out.println(">>>>>>>>>>>>>>>>>");
        System.out.println(table.queryIndexByEl(new Element<Integer>(2)));

    }

}
