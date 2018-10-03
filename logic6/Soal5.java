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
public class Soal5 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public int[] getGanjil(int n){
        int[] data = new int[n];
        int index = 1;
        for(int i=0; i < n; i++){
            data[i] = index;
            index = index + 2;
        }
        return data;
    }
    
    public void setMatrix(int n){
        this.baris = n*n;
        this.kolom = n*n;
        this.matrix = new String[this.baris][this.kolom];
        int[] dataGanjil = this.getGanjil((int)Math.pow(n, n));
        //set matrix
        int index = 0;
        //for(int block=0; block<n; block++){ //handle baris general
            int addBangun = 0;
            int index2 =n-1;
            for (int bangun = 0; bangun < n; bangun++) { //kolom general
                
                for (int i = 0; i < n; i++) { //handle baris
                    int inc = index2;
                    for (int j = 0; j < n; j++) { //handle kolom
                        //do here..
                        if(i % 2 == 0){
                            this.matrix[i+addBangun][(this.kolom-j-1)-addBangun] = dataGanjil[inc] + "";
                        } else {
                            this.matrix[i+addBangun][(this.kolom-j-1)-addBangun] = dataGanjil[index] + "";
                        }
                        
                        index++;
                        inc--;
                    }
                    index2 = index2 + n;    
                }
                    addBangun = addBangun + n;
            }
                
    }
          //  addBlock = addBlock + n;
        //}
        
    //}
    
    public void showMatrix(){
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Soal5 template = new Soal5();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        template.setMatrix(n);
        template.showMatrix();
    }
    
    
}
