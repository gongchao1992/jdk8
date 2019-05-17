package com.gongchao.java8;

/**
 * @version 2.1.0
 * @author: gongchao
 * @date: 2019/4/28 22:07
 */
public class Test {

    public static long strangeCounter(long t){
        //每次减到1后重新开始计算的最大初始减少值
        long everyCircleValue = 3;
        long value=3;
        while (t!=1){
            increase(everyCircleValue,t,value);
        }
        return value;
    }
    public static void increase(long everyCircleValue,long t,long value){
        if(value==1){
            everyCircleValue=everyCircleValue*2;
            value=everyCircleValue;
        }else{
            value--;
        }
        t--;
    }

    public static void main(String[] args){
        long l = strangeCounter(10);
        String a="555";
        System.out.println(l);
    }
}
