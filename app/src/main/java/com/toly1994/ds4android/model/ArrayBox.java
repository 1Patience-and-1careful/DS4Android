package com.toly1994.ds4android.model;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/11/21 0021:8:46<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：模型层数组的单体
 */
public class ArrayBox<T> extends Viewable {
    public static final int BOX_HEIGHT = 100;//一个数组盒子的高
    public static final int BOX_WIDTH = 200;//一个数组盒子的宽

    public int index;//数组单体索引
    public T data;//数据结构承载的核心数据


    public ArrayBox(float x, float y) {
        super(x, y);
    }
}
