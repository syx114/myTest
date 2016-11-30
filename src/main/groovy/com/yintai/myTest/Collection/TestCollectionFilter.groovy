package com.yintai.myTest.Collection

/**
 * Created by syx11 on 2016/11/16.
 */
class TestCollectionFilter {
    static void main(String... arg){
        ArrayList<Integer> list = [1,2,3,4,5,6,7,8,9,0]
        list.findAll {it>5}.each {it->
            println(it) //6,7,8,9
        }
        list.find {it>5}.each {it->
            println(it) //6
        }
    }
}
