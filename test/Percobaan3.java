import javax.swing.JOptionPane;

public class Percobaan3 {

    public static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static double luasSegitiga(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double luasLingkaran(int jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
        int luasPersegi = luasPersegiPanjang(panjang, lebar);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang = " + luasPersegi);

        int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
        int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
            double luasSegitiga = luasSegitiga(alas, tinggi);
            JOptionPane.showMessageDialog(null, "Luas Segitiga = " + luasSegitiga);


        int jariJari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:"));
        double luasLingkaran = luasLingkaran(jariJari);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran = " + luasLingkaran);
    }
}
