/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspraktik;

import java.util.Scanner;

/**
 *
 * @author DANYAV
 */
public class UTSPraktik {
    public static void main(String[] args) {
        String NamaToko = "DanyVirgian";
        System.out.println("NamaToko : "+ NamaToko); 
        
        String NamaBarang;
        int KodeBarang, Bayar, jumlahBarang;
        double Diskon = 0 , Harga;
        Scanner input = new Scanner(System.in);
      
        System.out.print("NamaBarang : ");
        NamaBarang = input.nextLine();
        System.out.print("jumlahBarang : ");
        jumlahBarang =input.nextInt();
        System.out.print("HargaBarang : ");
        Harga = input.nextDouble();
        System.out.print("KodeBarang : ");
        KodeBarang = input.nextInt();
        
        if (Harga >= 500000) {
        Diskon =  jumlahBarang *(Harga/2);
        }
        else if (Harga >= 200000) {
        Diskon = jumlahBarang * (Harga - Harga*2/10);
        }
        else if (Harga >=100000) {
        Diskon = jumlahBarang *(Harga - Harga*1/10);
        }else {
            
        
        }
        Bayar = (int) (Harga-Diskon);
        String NamaKasir = "Dany";
        System.out.println("Total bayar : Rp " + Bayar);
        System.out.println("NamaKasir "+ NamaKasir);
       
       
      
        
        
        
        
    }
        
    }

