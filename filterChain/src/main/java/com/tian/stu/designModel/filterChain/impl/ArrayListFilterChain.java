package com.tian.stu.designModel.filterChain.impl;

import com.tian.stu.designModel.filterChain.Excuter;
import com.tian.stu.designModel.filterChain.Filter;
import com.tian.stu.designModel.filterChain.FilterChain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:TianZhenYu
 * @date:2018/6/3
 * @description:com.tian.stu.designModel.filterChain.impl stu
 */
public class ArrayListFilterChain extends AbstractFilterChain implements FilterChain {
    private List<Filter> filterList = new ArrayList<Filter>();

    ThreadLocal<Integer> nonius = new ThreadLocal<Integer>(){
        protected Integer initialValue() {
            return -1;
        }
    };

    public ArrayListFilterChain(Excuter excuter) {
        super(excuter);
    }

    @Override
    protected boolean hasNext() {
        if(  nonius.get() + 1 < filterList.size() ){
            return true;
        }
        return false;
    }

    @Override
    protected Filter nextFilter() {
        nonius.set(nonius.get() + 1);
        return filterList.get(nonius.get());
    }

    public void add(Filter filter) {
        filterList.add(filter);
    }
}
