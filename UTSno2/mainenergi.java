/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTSno2;

import java.util.Scanner;
/**
 *
 * @author Z-low
 * TI-A
 */
public class mainenergi {
    public static void main(String[] args) {
        kinetic massa = new kinetic();
        kinetic kecepatan = new kinetic();
        
        System.out.println("Program Menghitung Energi Kinetik : ");
        System.out.print("Masukkan massa benda : ");
        Scanner masa = new Scanner(System.in);
        massa.setMassaBenda(masa.nextDouble());
        
        System.out.print("Masukkan kecepatan benda : ");
        Scanner cepat = new Scanner(System.in);
        kecepatan.setKecepatanBenda(cepat.nextDouble());
        
        System.out.println("Maka Energi Kinetic nya adalah : " + 0.5 * massa.getMassaBenda() * Math.pow(kecepatan.getKecepatanBenda(), 2));
    }
}
