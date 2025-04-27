package modul2_202457201062;

import java.util.Scanner;
public class Percobaan2 {
   

            public double luas_lingkaran(int diameter) {
                int jari2 = diameter / 2;
                double luas = Math.PI * Math.pow(jari2, 2);
                return luas;
        }
        void volumeBola(int diameter){
            int jariJari = diameter / 2;
            double volume = (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
            System.out.println("Volume bola dengan diameter " + diameter + " adalah: " + volume);
        }
        public static void main(String[] args) {
            Percobaan2 mt = new Percobaan2();
            System.out.println("Luas Lingkaran adalah " + mt.luas_lingkaran(20));
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("Masukkan diameter bola: ");
            int diameter = input.nextInt();
            
            mt.volumeBola(diameter);
            
            input.close();
            System.exit(0);
            
}           
} 

