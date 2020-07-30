package com.amyliascarlet.demo.bingo.util;

import com.amyliascarlet.demo.bingo.constants.Constants;

import java.util.*;
import java.util.stream.Collectors;

public class Util {
    public static Stack<Integer> genNum() {
        Random rand = new Random();
        Stack<Integer> nums = new Stack<>();
        for(int i = 0; i< Constants.Scale * Constants.Scale; i++) {
            nums.add(rand.nextInt(100) + 1);
        }
        return nums;
    }

    public static Set<Integer> genNumDistinct() throws InterruptedException {
        Random rand = new Random();
        Set<Integer> numsSet = new HashSet<Integer>();
        do{
            numsSet.add(rand.nextInt(100) + 1);
        }while (numsSet.size() < Constants.Scale * Constants.Scale);

        return numsSet;
    }

    public static Vector<Integer> genNumDiscontinuity() throws InterruptedException {
        Random rand = new Random();
        Vector<Integer> numsSet = new Vector<Integer>();
        int lastNum = 0;
        do{
            int nowNum = rand.nextInt(100)+ 1;
            if(Math.abs(lastNum - nowNum) > 3){
                lastNum = nowNum;
                numsSet.add(lastNum);
            }
        }while (numsSet.size() < Constants.Scale * Constants.Scale);

        return numsSet;
    }

    public static List<Integer> genNumDistinctDiscontinuity() throws InterruptedException {
        Random rand = new Random();
        List<Integer> numsList = new ArrayList<>();
        int lastNum = 0;

        do{
            int nowNum = rand.nextInt(100)+ 1;
            if(Math.abs(lastNum - nowNum) > 2){
                lastNum = nowNum;
                numsList.add(lastNum);
                numsList = numsList.stream().distinct().collect(Collectors.toList());
            }
        }while (numsList.size() < Constants.Scale * Constants.Scale);

        return numsList;
    }


    public static Integer genOneNum() {
        return new Random().nextInt(100) + 1;
    }
}
