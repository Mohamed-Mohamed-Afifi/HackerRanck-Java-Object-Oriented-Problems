package com.generic;

public class PrintArray<T> {
    public void printArray(T[] arr){
        for(T ele:arr){
            System.out.println(ele);
        }
    }
}