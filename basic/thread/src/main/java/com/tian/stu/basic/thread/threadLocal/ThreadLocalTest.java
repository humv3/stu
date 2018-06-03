package com.tian.stu.basic.thread.threadLocal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.basic.thread.threadLocal stu
 */
public class ThreadLocalTest implements Runnable{

    //重写initValue初始化变量
    private ThreadLocal<Integer> i = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    //第二个ThreadLocal变量
    private ThreadLocal<Map> map ;

    //构造函数对第二个ThreadLocal初始化赋值
    public ThreadLocalTest (int num , String str){
        final Map<String,Object> m = new HashMap();
        m.put("num",num);
        m.put("str",str);

 /*       map = new ThreadLocal<Map>(){
            @Override
            protected Map initialValue() {
                return m;
            }
        };*/

        map = new ThreadLocal<Map>();
        map.set(m);

    }

    //保留无参构造
    public ThreadLocalTest() {
    }

    //run方法
    public void run() {
        if(Thread.currentThread().getName().contains("thread")){
            this.run1();
        }else {
            this.run2();
        }
    }

    private void run2() {

        for (int j = 0; j < 100; j++) {

            System.out.println(map.get()+"9999");
           /* HashMap hashMap = new HashMap();
            hashMap.put("num",0);
            hashMap.put("str","str");
            map.set(hashMap);*/

          /*  Map m = this.map.get();
            if (m == null){
                try {
                    throw new Exception("获取失败");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if(Integer.valueOf( Thread.currentThread().getName()) % 2 == 1){
                //打印num，并令map中的num+1
                Integer num = (Integer) m.get("num");
                System.out.println(Thread.currentThread().getName() + " num  :  " + num);
                m.put("num",num+1);
                //打印str的长度,并令map中的str拼接字母
                String str = (String) m.get("str");
                System.out.println(Thread.currentThread().getName() + " str :  " + str.length());
                m.put("str",str + "q");
            }else {
                //打印num，并令map中的num-1
                Integer num = (Integer) m.get("num");
                System.out.println(Thread.currentThread().getName() + " num  :  " + num);
                m.put("num",num-1);
                //打印str的长度,并令map中的保持不变
                String str = (String) m.get("str");
                System.out.println(Thread.currentThread().getName() + " str :  " + str.length());
                m.put("str",str );
            }*/
        }
    }

    private void run1(){
        for (int j = 0; j < 100; j++) {
            //使用get方法获取值
            System.out.println( Thread.currentThread().getName() + "  :  "+ + j + "  ：  " + i.get()  + "  :  " +( j == i.get()));

            //调用set方法重新赋值
            i.set( i.get() + 1);

            try {
                Thread.currentThread().sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("睡眠问题");
            }
        }
    }
}
