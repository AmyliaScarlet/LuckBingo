package com.amyliascarlet.demo.bingo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MatrixLine {

    private Integer index;

    private Integer status;

    private List<Integer> data;

    public MatrixLine(int i) {
        this.index = i;
        this.status = 0;
        this.data = new ArrayList<>();
    }

    public Integer getIndex() {
        return index;
    }
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Integer> getData() {
        return data;
    }
    public void setData(List<Integer> data) {
        this.data = data;
    }
    public void addNum(Integer num) {
        this.data.add(num);
    }

    public int getCount(){
        return this.data.toArray().length;
    }


}
