package com.jason.user.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author Jason
 * @CreateTime 2019/8/22 15:59
 * @Modify 2019/8/22 15:59
 * @Version 1.0
 */
public class M {

    public static void main(String[] args) {
        int count =80;
        BigDecimal money= new BigDecimal("100");
        BigDecimal result = new BigDecimal("0");
        for (BigDecimal bigDecimal:random(count, money)){
            System.out.println(bigDecimal.doubleValue());
            result = result.add(bigDecimal);
        }
        System.out.println("result"+result);
    }

    /**
     * 越早越多
     * @param count
     * @param money
     * @return
     */
    public static List<BigDecimal> random(int count, BigDecimal money) {
        if (money.divide(new BigDecimal(String.valueOf(count)), 2).doubleValue() < 0.01) {
            throw new RuntimeException("金额不足");
        } else {
            money = money.subtract(new BigDecimal("0.01").multiply(new BigDecimal(count)));
            List<BigDecimal> people = new ArrayList<>();
            DecimalFormat format = new DecimalFormat("0.##");
            for (int i = 1; i < count; i++) {
                if (money.doubleValue() == 0) {
                    people.add(new BigDecimal("0.01"));
                } else {
                    Random random = new Random();
                    BigDecimal less = new BigDecimal(format.format(money.multiply(new BigDecimal(String.valueOf(random.nextDouble()))).doubleValue()));
                    money = money.subtract(less);
                    people.add(less.add(new BigDecimal("0.01")));
                }
            }
            people.add(money.add(new BigDecimal("0.01")));
            return people;
        }
    }
}
