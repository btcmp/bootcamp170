package com.xsis.bootcamp170.logic3;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arrizaqu
 */
public class DeretAngka2 {
    
    //0,1,2,3,4...
    public int[] increment(int n){
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = i;
        }
        return data;
    };
    
    //fibonachi
    //1,1,2,3,5,8.. etc
    public int[] fibonachi(int n){
        int[] data = new int[n];
        data[0] = 1;
        data[1] = 1;
        
        for (int i = 2; i < n; i++) {
            data[i] = data[i - 1]+data[i - 2];
        }
        return data;
        //System.out.println(Arrays.toString(data));
    }
    //1,1,2,2,3, ,3, .. etc
    public String[] sliceFib(int n){
        int[] dataFib = this.fibonachi(n);
        String[] hasil = new String[n];
        
        int index = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
              hasil[i] =  String.valueOf(dataFib[index]);  
              index = index + 1;
            } else {
              hasil[i] = "";
            }
        }
        
        return hasil;
    }
    
     public int[] triBonachi(int n){
        int[] data = new int[n];
        data[0] = 1;
        data[1] = 1;
        data[2] = 1;
        
        for (int i = 3; i < n; i++) {
            data[i] = data[i - 1]+data[i - 2] + data[i-3];
        }
        return data;
        //System.out.println(Arrays.toString(data));
    }
    
    public static void main(String[] args) {
        DeretAngka2  da = new DeretAngka2();
        int[] data = da.increment(9);
        System.out.println(Arrays.toString(data));
        int[] dataFib = da.fibonachi(9);
        System.out.println(Arrays.toString(dataFib));
        
        String[] data3 = da.sliceFib(9);
        System.out.println(Arrays.toString(data3));
    }
    
}
