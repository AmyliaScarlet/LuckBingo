package com.amyliascarlet.demo.bingo.model;

import com.amyliascarlet.demo.bingo.constants.Constants;
import com.amyliascarlet.demo.bingo.util.Util;

import java.util.*;

public class Matrix {

    private Integer id;

    private List<MatrixLine> matrixLine;

    private List<MatrixColumn> matrixColumn;

    public Integer getID() {
        return id;
    }
    public void setID(Integer ID) {
        this.id = ID;
    }

    public List<MatrixLine> getMatrixLine() {
        return matrixLine;
    }
    public void setMatrixLine(List<MatrixLine> matrixLine) {
        this.matrixLine = matrixLine;
    }
    public List<MatrixColumn> getMatrixColumn() {
        return matrixColumn;
    }
    public void setMatrixColumn(List<MatrixColumn> matrixColumn) {
        this.matrixColumn = matrixColumn;
    }


    public Matrix() throws InterruptedException {
        this.id = 1;
        List<Integer> nums = Util.genNumDistinctDiscontinuity();
        Iterator iterator = nums.iterator();
        matrixColumn = new ArrayList<>();
        matrixLine = new ArrayList<>();

        for(int i=0; i<Constants.Scale; i++){
            matrixColumn.add(new MatrixColumn(i));
            matrixLine.add(new MatrixLine(i));
        }

        for(int i=0; i<Constants.Scale; i++){
            for(int k=0; k<Constants.Scale; k++) {
                int num = 0;
                if(iterator.hasNext()){
                    num = (int) iterator.next();
                }
                if(num >0){
                    matrixLine.get(i).addNum(num);
                    if(k == 0){
                        matrixColumn.get(k).addNum(num);
                    }else{
                        matrixColumn.get(k%Constants.Scale).addNum(num);
                    }
                }
            }
        }
    }




}
