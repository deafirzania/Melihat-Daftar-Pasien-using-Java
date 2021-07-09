/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heidea.yulia.firzania_si4204_jurnal0_modul4;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class HEIDEAYULIAFIRZANIA_SI4204_JURNAL0_MODUL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] daftar = new String [3][4];
        daftar[0][0]="Nama Pasien";
        daftar[0][1]="\t|Umur";
        daftar[0][2]="\t\t|Penyakit";
        daftar[0][3]="\t|Obat yang Diberikan";
        daftar[1][0]="Intan Permata";
        daftar[1][1]="\t|9 Tahun";
        daftar[1][2]="\t|Flu";
        daftar[1][3]="\t\t|Bodrexin";
        daftar[2][0]="Windy Ratnasari";
        daftar[2][1]="|19 Tahun";
        daftar[2][2]="\t|Demam";
        daftar[2][3]="\t\t|Paracetamol";
        
        String[][] daftar2 = new String [4][4];
        daftar2[0][0]="Nama Pasien";
        daftar2[0][1]="\t\t|Umur";
        daftar2[0][2]="\t\t|Penyakit";
        daftar2[0][3]="\t|Obat yang Diberikan";
        daftar2[1][0]="Kinar Wardana";
        daftar2[1][1]="\t\t|27 Tahun";
        daftar2[1][2]="\t|Typus";
        daftar2[1][3]="\t\t|Ceftriaxone";
        daftar2[2][0]="Rindang Kusumawa";
        daftar2[2][1]="\t|49 Tahun";
        daftar2[2][2]="\t|TBC";
        daftar2[2][3]="\t\t|Isoniazid";
        daftar2[3][0]="Angel Kirana";
        daftar2[3][1]="\t\t|23 Tahun";
        daftar2[3][2]="\t|Typus";
        daftar2[3][3]="\t\t|Ceftriaxone";
        
        String[][] daftar3 = new String [3][4];
        daftar3[0][0]="Nama Pasien";
        daftar3[0][1]="\t|Umur";
        daftar3[0][2]="\t\t|Penyakit";
        daftar3[0][3]="\t\t|Obat yang Diberikan";
        daftar3[1][0]="Julianto";
        daftar3[1][1]="\t|29 Tahun";
        daftar3[1][2]="\t|Radang Tenggorokan";
        daftar3[1][3]="\t|Fenol";
        daftar3[2][0]="Kusuma Wijaya";
        daftar3[2][1]="\t|57 Tahun";
        daftar3[2][2]="\t|TBC";
        daftar3[2][3]="\t\t\t|Isoniazid";
        
    Scanner sc = new Scanner (System.in);
    System.out.println("===========================================");
    System.out.println("\tDaftar Pasien Klinik ABC");
    System.out.println("===========================================");
    System.out.println("Siapakah Nama Anda?");
    String nama = sc.nextLine();
    System.out.println("Hai, "+nama+"! Selamat Datang di Klinik ABC");
    boolean kondisi = false;
    do {
        System.out.println("Berikut Daftar Dokter yang Ada di Klinik ABC");
        String[] dokter = {"1. dr. Ida Suryani ","2. dr. Gayuh Ayumi ","3. dr. Handri Febriansyah"};
            for(int i = 0; i < dokter.length; i++){
                System.out.println(dokter[i]);}
        System.out.print("Pilihlah Nama Dokter diatas (1-3) : ");
        int pilihan = sc.nextInt();
     
            switch(pilihan){
                case 1:
                    System.out.println("Berikut Data Pasien dr. Ida Suryani");
                    System.out.println("------------------------------------------------------------------------------");
                   for (String a[] : daftar){
                       for (String b : a) {
                           System.out.print(b+" ");
                       }
                   System.out.println(" ");}
                   System.out.println("------------------------------------------------------------------------------");
                break;
                case 2:
                    System.out.println("Berikut Data Pasien dr. Gayuh Ayumi");
                    System.out.println("------------------------------------------------------------------------------");
                    for (String a[] : daftar2){
                       for (String b : a) {
                           System.out.print(b+" ");
                       }
                    System.out.println(" ");}
                    System.out.println("------------------------------------------------------------------------------");
                break;
                case 3:
                    System.out.println("Berikut Data Pasien dr. Handri Febriansyah");
                    System.out.println("------------------------------------------------------------------------------");
                    for (String a[] : daftar3){
                       for (String b : a) {
                           System.out.print(b+" ");
                       }
                    System.out.println(" ");}
                    System.out.println("------------------------------------------------------------------------------");
                break;
        
                default:
                System.out.println("Mohon Maaf Dokter yang Anda Pilih Tidak Tersedia");
            }
            System.out.println("Apakah Anda ingin mengulangi?(y/n)");
        String pilih = sc.next();
                    if (pilih.equals("y")) {
                    kondisi = true;
                    } else if(pilih.equals("n")){
                    kondisi = false;
                    }else{
                        System.out.println("Pilihan Salah");
                        kondisi = false;
                    }  
        }while(kondisi);
    System.out.println("Terima Kasih "+nama+" Telah menggunakan Program Ini.");
    System.out.println("Have a Nice Day!");
}
}