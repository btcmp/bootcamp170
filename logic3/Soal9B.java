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
public class Soal9B {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n;
        this.kolom = n;
        this.matrix = new String[this.baris][this.kolom];
        DeretAngka2 da = new DeretAngka2();
        String[] dataFib = da.sliceFib(n);
        System.out.println(Arrays.toString(dataFib));
        
        //set matrix
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                //do here..
                if(i-j >=0 && i+j <= n-1){
                    //sisi kiri
                    this.matrix[i][j] = dataFib[j] +"";
                } else if(i -j <= 0 && i +j <= n - 1){
                    //sisi atas
                    this.matrix[i][j] = dataFib[i] +"";
                } else if(i+j >= n - 1 && i - j <= 0){
                    //sisi kanan
                    this.matrix[i][j] = dataFib[n-1-j] +"";
                } else {
                    this.matrix[i][j] = dataFib[n-1-i] +"";
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
        Soal9B template = new Soal9B();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    } 
}
