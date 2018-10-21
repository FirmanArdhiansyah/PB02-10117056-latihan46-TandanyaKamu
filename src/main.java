
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class main {

    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);
        Age ag = new Age(2018);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        ag.setYearBirth(scn1.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir Anda : " + ag.getYearBirth());
        System.out.println("Hari ini tahun : " + ag.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah : " + ag.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu : " + ag.tandanyaKamu(ag.hitungUmur()));

    }

}
