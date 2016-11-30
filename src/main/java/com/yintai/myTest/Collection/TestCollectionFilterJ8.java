package com.yintai.myTest.Collection;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by syx11 on 2016/11/16.
 */
public class TestCollectionFilterJ8 {
    public static void main(String...   args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        for (Integer i :
                list.stream().filter(it->it>5).collect(Collectors.toList())) {
            System.out.println(i);
        }
    }
}
