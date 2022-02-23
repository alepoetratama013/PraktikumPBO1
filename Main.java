/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapbo1;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main  {
    /**
     *@param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        boolean isLoop = true;
        double suhu;
        int pil;
        
        suhu = intro();
        while(isLoop){
            pil = menu();
            Konversi konversi = new Konversi(suhu);
            
            switch(pil){
                case 1:
                    konversi.display();
                    break;
                case 2:
                    System.out.print("Masukkan Data\n"
                            + "--------\n"
                            + "Derajat Dalam Celsius\t: ");
                    suhu = scanner.nextDouble();
                    konversi.setCel(suhu);
                    break;
                case 3:
                    isLoop = false;
                    break;
                default:
                    System.out.println("Pilih Dengan Opsi !\n");        
            }
        }
    }
    
    public static double intro(){
        double suhu;
        System.out.println("+-----------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU |");
        System.out.println("+-----------------------+");
        System.out.println("Input Data Air ");
        System.out.print("Derajat Dalam Celsius\t: ");
        suhu = scanner.nextDouble();
        
        return suhu;
    }
    
    public static int menu(){
        int pil;
        System.out.println("\n Opsi \n");
        System.out.print("1. Tampil Data \n"
                + "2. Edit Data \n"
                + "3. Keluar\n"
                + "Pilih : ");
        pil = scanner.nextInt();
        
        return pil;
    }
    
}