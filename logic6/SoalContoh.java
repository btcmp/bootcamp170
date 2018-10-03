/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp170.logic6;

import com.xsis.bootcamp170.logic1.*;
import java.util.Scanner;

/**
 *
 * @author arrizaqu
 */
public class SoalContoh {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n*n;
        this.kolom = (n*2-1)*2;
        this.matrix = new String[this.baris][this.kolom];
        
        //set matrix
        int geserY = 0;
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < this.kolom; j++) {
                    //do here..
                    if(i+j >= (n-1) && j-i <= (n-1)){
                        if(bangun % 2 == 0){
                            this.matrix[i+geserY][j] = "*";
                        }
                       
                    } else {
                        if(bangun % 2 == 1){
                            this.matrix[i+geserY][j] = this.matrix[i][this.kolom-1-j];
                        }
                        
                   }
                }
            }
            geserY = geserY + n;
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
        SoalContoh template = new SoalContoh();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    }
    
    
}
