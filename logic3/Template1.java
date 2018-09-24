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
public class Template1 {
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
        Template1 template = new Template1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(9);
        template.showMatrix();
    }
    
    
}
