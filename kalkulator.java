import java.util.Scanner;

import javax.swing.JOptionPane;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, pilihoperasi;
        double hasil = 0;
        System.out.print("Angka Pertama: ");
        angka1 = input.nextInt();
        System.out.print("Angka Kedua: ");
        angka2 = input.nextInt();
        
        System.out.println("Pilih operasi");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        
        System.out.print("Pilihan:");
        pilihoperasi = input.nextInt();
 
        switch (pilihoperasi)
        {
            case 1 : hasil = angka1 + angka2; break;
            case 2 : hasil = angka1 - angka2; break;
            case 3 : hasil = (double)angka1 / angka2; break;
            case 4 : hasil = angka1 * angka2; break;
            default : System.out.println("Pilih 1-4");
        }


        System.out.println("Hasil: " + hasil);

    }
}
