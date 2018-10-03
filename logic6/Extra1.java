/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp170.logic6;

import com.xsis.bootcamp170.logic3.*;
import com.xsis.bootcamp170.logic1.*;
import java.util.Scanner;

/**
 *
 * @author arrizaqu
 */
public class Extra1 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n;
        this.kolom = n;
        this.matrix = new String[this.baris][this.kolom];
        
        //set matrix
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                //do here..
                if(i-j >= 1 && i+j <= this.kolom-1){
                    if(j % 2 == 1){
                        this.matrix[i][j] = "@";
                    }
                } else if(i -j <= this.kolom-1 && i+j <= this.kolom-1){
                    if(i % 2 == 0){
                        this.matrix[i][j] = "@";
                    } 
                    
                } else if(i-j <= 0 && i + j >= this.kolom-1){
                    if(j % 2 == 0){
                        this.matrix[i][j] = "@";
                    }
                    
                } else {
                   if(i % 2 == 0){
                        this.matrix[i][j] = "@";
                    } 
                }
                
                //motong ke kanan atas
                if(i + j == this.kolom - 1 && j >= this.kolom / 2 -1 ){
                    this.matrix[i][j] = "null";
                }
                //mototng ke bawah kanan
                if(i -j == 0 && j >= this.kolom / 2){
                    this.matrix[i][j] = "null";
                }
                //memotong dari kiri atas
                if(i -j == 1 && j <= this.kolom / 2 -1){
                    this.matrix[i][j] = "null";
                }
                //tambah start
                if(i == 0 && j == 0){
                    this.matrix[i][j] = "@";
                }
                //memotong bawah kiri 
                if(i+j == this.baris && j <= this.kolom/2 - 1){
                    this.matrix[i][j] = "null";
                }
            }
        }
    }
    
    public void showMatrix(){
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
               // if(this.matrix[i][j] != null){
                    System.out.print(this.matrix[i][j] + "\t");
              //  } else {
                 //   System.out.print("\t");
             //   }
                
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Extra1 template = new Extra1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    }
    
    
}
