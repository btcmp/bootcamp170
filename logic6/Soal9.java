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
public class Soal9 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public int getMaxX(int n){
        int myDefault = 3;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result + myDefault;
            myDefault++;
        }
        return result;
    }
    
    public int getMaxY(int n){

        int result = 2;
        for (int i = 0; i < n; i++) {
            result = result+1;
        }
        return result;
    }
    
    public void setMatrix(int n){
        this.baris = this.getMaxY(n);
        this.kolom = this.getMaxX(n);
        this.matrix = new String[this.baris][this.kolom];
        
        //set matrix
        int addBangun = 0;
        int index2 = 1;
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = 0; i < 3+bangun; i++) {
                for (int j = 0; j < 3+bangun; j++) {
                    //do here..
                    if(i + j == 2 + bangun || j == 2 + bangun || i == 2 + bangun){
                        this.matrix[i+(n-1)-bangun][j+addBangun] = (index2+j) +"";
                    }
                }
            }
            addBangun = addBangun+3+bangun;
            index2 = index2 + 3+bangun ;
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
        Soal9 template = new Soal9();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    }
    
    
}
