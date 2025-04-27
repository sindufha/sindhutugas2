/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyBook Hype AMD
 */
import java.util.Scanner;
public class Percobaan2 {
   

        public double luas_lingkaran(int diameter) {
            int jari2 = diameter / 2;
            double luas = Math.PI * Math.pow(jari2, 2);
            return luas;
        }
        void luasBola(int diameter){
            int jariJari = diameter / 2; 
            double luas = 4 * Math.PI * Math.pow(jariJari, 2); 
            System.out.println("Luas bola dengan diameter " + diameter + " adalah: " + luas);
        }
        public static void main(String[] args) {
            Percobaan2 mt = new Percobaan2();
            System.out.println("Luas Lingkaran adalah " + mt.luas_lingkaran(20));
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("Masukkan diameter bola: ");
            int diameter = input.nextInt();
            
            mt.luasBola(diameter);
            
            input.close();
            System.exit(0);
            
}           
} 

