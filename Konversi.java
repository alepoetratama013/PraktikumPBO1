/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapbo1;

/**
 *
 * @author ASUS
 */
public class Konversi {
 private double cel;
    private final String degree = "\u00b0";

    public Konversi(double cel) {
        this.cel = cel;
    }

    public void setCel(double cel) {
        this.cel = cel;
    }
    
    public double Reamur(double cel){
        return (4 * cel)/5;
    }
    
    public double Farenheit(double cel){
        return (9*cel)/5 + 32;
    }
    public double Kelvin(double cel){
        return cel + 273.15;
    }
    
    public String sample_con(double cel){
        if(cel <= 0) return "Beku";
        else if (cel >= 100) return "Mendidih";
        else return "Cair";
    }
    
    public void display(){
        System.out.println("Konversi Temperatur");
        System.out.println("Kelvin\t\t: " + Kelvin(cel) + " K");
        System.out.println("Reamur\t\t: " + Reamur(cel) + degree + " R");
        System.out.println("Farenhait\t: " + Farenheit(cel) + degree + " F");
        System.out.println("Kondisi Air: " + sample_con(cel));
    }
    
    
}