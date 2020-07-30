package com.amyliascarlet.demo.bingo.constants;

import com.amyliascarlet.demo.bingo.model.Matrix;
import com.amyliascarlet.demo.bingo.model.MatrixColumn;
import com.amyliascarlet.demo.bingo.model.MatrixLine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runtime {
    //已得到的数字
    public static Set<Integer> haveNum = new HashSet<>();

    //还未成的行
    public static List<MatrixLine> waiteMatrixLine = new ArrayList<>();

    //还未成的列
    public static List<MatrixColumn> waiteMatrixColumn = new ArrayList<>();



}
