package com.amyliascarlet.demo.bingo.service;

import com.amyliascarlet.demo.bingo.constants.Constants;
import com.amyliascarlet.demo.bingo.constants.Runtime;
import com.amyliascarlet.demo.bingo.model.Bingo;
import com.amyliascarlet.demo.bingo.util.Util;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BingoService {


    public Integer play() {
        return Util.genOneNum();
    }


    public Bingo Start() throws InterruptedException {
        return  new Bingo();
    }

    public List<Integer> Check(int num) {
        final List<Integer> res = new ArrayList<>();

        Runtime.haveNum.add(num);
        Runtime.waiteMatrixLine.forEach(line->{
            int i = (int) line.getData().stream().filter(l -> Runtime.haveNum.contains(l)).count();
            if(i == 5){
                res.add(line.getIndex());
            }
        });

        Runtime.waiteMatrixColumn.forEach(column->{
            int i = (int) column.getData().stream().filter(c -> Runtime.haveNum.contains(c)).count();
            if(i == 5){
                res.add(column.getIndex() + Constants.Scale);
            }
        });

        res.forEach(index->{
            if(index < 5){
                Runtime.waiteMatrixLine.remove(index);
            }else {
                Runtime.waiteMatrixColumn.remove(index);
            }
        });

        if(Runtime.waiteMatrixLine.size() == 0 ){
            if(Runtime.waiteMatrixColumn.size() == 0){
                res.add(11);
            }else {
                res.add(10);
            }
        }
        return res;
    }
}
