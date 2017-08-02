package com.yintai.myTest.enumTest;

/**
 * Created by syx11 on 2016/11/30.
 */
public class Test {
    public static void main(String[] args) {
        Item item = new Item();
        item.id = "haha";
        item.status = Status.Invalid;
        if(item.status==Status.InStock){
            System.out.println("shit");
        } else if (item.status==Status.LowStock){
            System.out.println("lowStock");
        } else if (item.status==Status.Invalid){
            System.out.println("wuxiao");
        }
    }
}
