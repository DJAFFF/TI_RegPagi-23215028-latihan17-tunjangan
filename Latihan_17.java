/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

/**
 *
 * @author USER
 */
public class Latihan_17 {
  
    public static void main(String[] args) {
        double gajiPokok = 6000000;
        double tunjangan = 0.35 * gajiPokok;
        double totalGaji = gajiPokok + tunjangan;

        System.out.println("Gaji pokok Younglex: Rp " + gajiPokok);
        System.out.println("Tunjangan Younglex: Rp " + tunjangan);
        System.out.println("Total gaji Younglex: Rp " + totalGaji);

        if (totalGaji > 6000000) {
            System.out.println("Younglex memerlukan bantuan untuk mengetahui hal tersebut dan gaji pokok & status nikah atau belumnya sendiri.");
        } else {
            System.out.println("Younglex tidak memerlukan bantuan karena total gaji sudah sesuai dengan ketentuan.");
        }
    }
}

