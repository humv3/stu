package com.tian.stu.basic.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author:TianZhenYu
 * @date:2019/8/19
 * @description:com.tian.stu.basic.collection basic
 */
public class SetDemon {

    @Test
    public void apiDemo() {

        Set<String> set = new HashSet<String>();
        set.add("红桃a");
        set.add("红桃a");
        set.add("红桃a");
        System.out.println(set);
       /* Iterator<String> iterator = set.iterator();
        *//** 询问 *//*
        while (iterator.hasNext()){
            *//** 获取 *//*
            String next = iterator.next();
            System.out.println(next);
        }*/

        for( String str : set ){
            System.out.println(str);
        }




    }

}
