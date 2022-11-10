/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmijava;

import java.util.Scanner;
public class BmiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("masukkan berat :");
        berat = input.nextInt();
        System.out.println("Masukkan Tinggi :");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi=berat/(tinggi*tinggi);
        System.out.println("Bmi mu adalah "+bmi);
        
        if(bmi<16.5){
            System.out.println("berat badan kurang");
        }
        else if(bmi<25.9){
            System.out.println("berat badan normal");
        }
        else if(bmi<29.9){
            System.out.println("berat badan kelebihan");
        }
        else {
            System.out.println("obesitas");
            
            
            
            
        }
            
            
            
        }
    
    }
    

