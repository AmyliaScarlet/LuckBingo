package com.amyliascarlet.demo.bingo.model;

import com.amyliascarlet.demo.bingo.constants.Runtime;

import java.util.List;

public class Bingo {
    private Integer id;

    private String name;

    private Matrix matrix;


    public Integer getID() {
        return id;
    }
    public void setID(Integer ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Matrix getMatrix() {
        return matrix;
    }
    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Bingo() throws InterruptedException {
        this.id = 1;
        this.name = "bingo";
        this.matrix = new Matrix();
        Runtime.waiteMatrixLine = this.matrix.getMatrixLine();
        Runtime.waiteMatrixColumn = this.matrix.getMatrixColumn();
    }



}
