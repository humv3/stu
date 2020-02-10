package com.tian.stu.basic.thread.threadLocal;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.basic.thread.threadLocal stu
 */
public class ThreadLocalDemo {

    public static void main(String[] args) {

        ThreadLocalTest test = new ThreadLocalTest();

        ThreadLocalTest test2 = new ThreadLocalTest(0,"");

/*        for (int i = 0; i < 4 ; i++) {
            Thread thread = new Thread(test);
            thread.setName("thread " + i);
            thread.start();
        }*/

        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(test2);
            thread.setName(""+i);
            thread.start();
        }
    }
}
