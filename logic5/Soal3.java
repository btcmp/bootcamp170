/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp170.logic5;

import com.xsis.bootcamp170.logic1.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author arrizaqu
 */
public class Soal3 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = this.getMaxBaris(n);
        this.kolom = this.getMaxKolom(n);
        
        this.matrix = new String[this.baris][this.kolom];
        //int[] data1 = {1,2,3,4,5};
        //int[] data2 = {1,3,5,7,9};
        int[] data3 = this.getTriangular(n);
        int[] data4 = this.getBilQuadrat(n);
        //int[] data5 = {0,1,2,3,4};
       
        //set matrix
        int index = 1;
        for (int bangun = 0; bangun < n; bangun++) {
            for (int i = 0; i < bangun + 1; i++) {
                for (int j = 0; j < index; j++) {
                    //do here..
                    if(i+j >= bangun && j - i <= bangun){
                        this.matrix[i+data3[bangun]][j+data4[bangun]] = "*";
                    }
                    
                }
            }
            index = index + 2;
        }
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 1; j++) {
//                //do here..
//                this.matrix[i+0][j+0] = "*";
//            }
//        }
//        
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                //do here..
//                this.matrix[i+1][j+1] = "*";
//            }
//        }
//        
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                //do here..
//                this.matrix[i+3][j+4] = "*";
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 7; j++) {
//                //do here..
//                this.matrix[i+6][j+9] = "*";
//            }
//        }
    }
    
    public void showMatrix(){
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public int[] getBilQuadrat(int n){
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = i * i;
        }
        return data;
    }
    
    public int getMaxKolom(int n){
        return n*n;
    }
    
    public int getMaxBaris(int n){
        int result = 0;
        int index = 1;
        for (int i = 0; i < n; i++) {
            result = result + index;
            index++;
        }
        return result;
    }
    
    public int[] getTriangular(int n){
        int[] data = new int[n];
        int result = 0;
        for(int i = 0; i<n;i++){
            result = result + i;
            data[i] = result;
        }
        return data;
    }
    
    public static void main(String[] args) {
        Soal3 template = new Soal3();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    }
    
    
}
