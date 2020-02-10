package com.tian.stu.basic.collection;

import org.junit.Test;
import java.util.*;
/**
 * @author:TianZhenYu
 * @date:2019/8/19
 * @description:com.tian.stu.basic.collection basic
 */
public class MapDemon {

    @Test
    public void apiDemo() {
        List<String> list = new ArrayList();
        list.add("王菲");
        list.add("周杰伦");
        list.add("刘欢");
        System.out.println("list:" + list);

        Map<String,String> map = new TreeMap();
        map.put("王菲","窦唯");
        map.put("周杰伦","昆凌");
        map.put("梁朝伟","刘嘉玲");

        System.out.println("map:"+map);

       

    }

    @Test
    public  void keySet() {
    	Map<String,String> map = new TreeMap();
        map.put("王菲","窦唯");
        map.put("周杰伦","昆凌");
        map.put("梁朝伟","刘嘉玲");
        
        Set<String> set = map.keySet();

        
    }

    @Test
    public  void entrySet() {
        Map<String,String> map = new TreeMap();
        map.put("王菲","窦唯");
        map.put("周杰伦","昆凌");
        map.put("梁朝伟","刘嘉玲");
        Collection<String> values = map.values();
        System.out.println(values);


        Set<Map.Entry<String, String>> set = map.entrySet();
        
    }



}
