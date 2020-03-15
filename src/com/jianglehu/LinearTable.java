package com.jianglehu;

/**
 * 使用顺序存储方式的线性表：
 */
public class LinearTable<T> {
    //1.定义线性表的总长度
    private int totallen;
    //2.定义currentlen表示线性表中的元素个数
    private int currentlen;
    //3.定义线性表中的数据体
    public Element<T>[] el;

    //1.初始化需要的属性
    public void init() {
        //1.1.初始化总长度为10
        this.setTotallen(10);
        this.el = new Element[getTotallen()];
        //1.2.初始化当前存储数据个数为0
        this.setCurrentlen(0);
    }

    /**
     * 重载init方法:
     *
     * @param totallen 自定义当前线性的容量为多少
     */
    public void init(int totallen) {
        this.setTotallen(totallen);
        this.el = new Element[getTotallen()];
        //初始化当前存储数据个数为0
        this.setCurrentlen(0);
    }

    //2.添加一个元素
    public boolean addEl(Element<T> el) {
        if (el != null && !isOverFlow()) {

            this.el[currentlen++] = el;

        }
        return false;
    }

    //3、根据下标查找元素
    public Element<T> queryElByIndex(int index) {
        if (0 <= index && index < currentlen) {
            return el[index];
        }
        return null;
    }

    //4、清空
    public void clear() {
        for (int i = 0; i < currentlen; i++) {
            this.el[i] = null;
        }
    }

    //5、更新一个元素
    public boolean updateEl(int index, Element<T> target) {
        if (target != null && 0 <= index && index < currentlen) {
            this.el[index] = target;
            return true;
        }
        return false;
    }

    //6、删除一个元素
    public boolean delete(int index) {
        if (0 <= index && index < currentlen) {
            this.el[index] = null;
            for (int i = index; i < currentlen; i++) {
                this.el[i] = this.el[i + 1];
            }
            this.el[currentlen - 1] = null;
            this.setCurrentlen(--currentlen);
            return true;
        }
        return false;
    }

    /**
     * 7、根据元素查下标
     * 引用变量在没有重写equals()方法即没有自定义比较条件的情况下，可能无法比较得到结果
     *
     * @return
     */
    public int queryIndexByEl(Element<T> el) {
        if (el != null) {
            for (int i = 0; i < currentlen; i++) {
                if (el.equals(this.el[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    // 8、判断是否为空
    public boolean isEmpty() {
        if (currentlen == 0) {
            return true;
        }
        return false;
    }

    //9、判断是否溢出
    public boolean isOverFlow() {
        if (currentlen >= totallen) {
            return true;
        }
        return false;
    }

    //10,展示线性表中的所有元素:
    public void showAll() {
        for (int i = 0; i < currentlen; i++) {
            System.out.println(this.el[i]);
        }

    }

    public int getTotallen() {
        return totallen;
    }

    public void setTotallen(int totallen) {
        this.totallen = totallen;
    }


    public void setCurrentlen(int currentlen) {
        this.currentlen = currentlen;
    }


}
