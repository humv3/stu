package com.tian.stu.designModel.filterChain.impl;

import com.tian.stu.designModel.filterChain.Excuter;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.designModel.filterChain.impl stu
 */
public class Excuter1 implements Excuter {
    public void excute(Object a, Object object) {
        System.out.println("终于到我");
    }
}
