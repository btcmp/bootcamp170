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
public class Soal1 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = this.getMaxKolom(n);
        this.kolom = this.getMaxKolom(n);
        this.matrix = new String[this.baris][this.kolom];
        int[] dataAng = this.getTriangular(n+1);
        System.out.println(Arrays.toString(dataAng));
        
        //set matrix
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = 0; i < bangun + 1; i++) {
                for (int j = 0; j < bangun + 1; j++) {
                    this.matrix[i + this.baris - dataAng[bangun+1]][j+ this.kolom - dataAng[bangun+1]] = "*";
                }
            }
        }
//            for (int i = 0; i < 1; i++) {
//                for (int j = 0; j < 1; j++) {
//                    this.matrix[i+0][j+(10-1)] = "*";
//                }
//            }
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 2; j++) {
//                    this.matrix[i+1][j+(10-3)] = "*";
//                }
//            }
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    this.matrix[i+3][j+(10-6)] = "*";
//                }
//            }
//        for(int bangun = 0; bangun < n; bangun++){
//            
//        }

        
    }
    
    //function triangular : 1,3,6,10,15,21..
    public int getMaxKolom(int n){
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
    
    public void showMatrix(){
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Soal1 template = new Soal1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    }
    
    
}
