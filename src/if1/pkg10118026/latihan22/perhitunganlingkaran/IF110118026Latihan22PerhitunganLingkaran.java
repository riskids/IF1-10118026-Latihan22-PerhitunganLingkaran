/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan22.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: menghitung diameter lingkaran
 */
public class IF110118026Latihan22PerhitunganLingkaran {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println("[#]======= Perhitungan Lingkaran ===========[#]");
		System.out.print("Masukkan nilai diameter lingkaran : ");
		Scanner scanner = new Scanner(System.in);
                
		double dm = 0;
                
		while (!scanner.hasNextDouble()){
			System.out.println("Nilai dm Tidak Sesuai");
			System.out.print("Masukkan diameter lingkaran : ");
			scanner.next();
		}
		dm = scanner.nextDouble();
		System.out.println("[#]======= Hasil Perhitungan Lingkaran ===========[#]");
		System.out.println("Jari-Jari Lingkaran = " + (dm/2) + " cm");
		System.out.println("Luas Lingkaran = " + (3.14*(dm/2)*(dm/2)) + " cm");
		System.out.println("Keliling Lingkaran = " + (3.14*dm) + " cm");
                System.out.println("Developed by : Riski Dwi");
	}
	
}
