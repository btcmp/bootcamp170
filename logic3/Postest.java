/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp170.logic3;

import com.xsis.bootcamp170.logic1.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author arrizaqu
 */
public class Postest {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n;
        this.kolom = n*2-1;
        this.matrix = new String[this.baris][this.kolom];
        DeretAngka2 da = new DeretAngka2();
        int[] dataFib = da.fibonachi(n);
        System.out.println(Arrays.toString(dataFib));
        //set matrix
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                //do here..
                if(i == j){
                    this.matrix[i][j] = dataFib[i] +"";
                    this.matrix[i][j+n-1] = dataFib[n-1-i]+"";
                } else if(i+j == n - 1){
                    this.matrix[i][j] = dataFib[n-1-i] +"";
                    this.matrix[i][j+n-1] = dataFib[i] +"";
                }
            }
        }
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
        Postest template = new Postest();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    }
    
    
}
