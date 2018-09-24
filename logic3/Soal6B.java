/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp170.logic3;

import com.xsis.bootcamp170.logic1.*;
import java.util.Scanner;

/**
 *
 * @author arrizaqu
 */
public class Soal6B {
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
                if(i -j == 0){
                    this.matrix[i][j] = "*";
                } else if(i+j == n - 1){
                    this.matrix[i][j] = "#";
                } 
                //sisi kiri
                else if(i+j <= n -1 && i -j >= 0){
                    this.matrix[i][j] = "D";
                }
                //sisi atas
                else if(i+j <= n - 1){
                    this.matrix[i][j] = "A";
                }
                //sisi kanan
                else if(i+j >= n-1 && i - j <= 0){
                    this.matrix[i][j] = "B";
                } else {
                    this.matrix[i][j] = "C";
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
        Soal6B template = new Soal6B();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    }
    
    
}
