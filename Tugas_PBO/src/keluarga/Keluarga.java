/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keluarga;
/**
 *
 * @author user
 */
public class Keluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manusia bapak = new Orang_Tua("Gunadi abdullah", "Ciamis", "31 Desember 1976", "Karyawan Swasta", "Kuningan,Cirebon", "081332632492", 0);
        Manusia ibu = new Orang_Tua("Endang tri", "ngawi", "16 Juni 1985", "Ibu Rumah tangga", "Kuningan,Cirebon", "087770889037", 0);
        Manusia fauzaan = new Anak("Fauzaan Rafi putra A", "Madiun", "20 juni 2003", "Pelajar/Mahasiswa", "Mertoyudan,Magelang", "081212722504", 0);
        Manusia hamzah = new Anak("Hamzah Aziz azib", "Bogor", "16 juni 2006", "Pelajar", "Kuningan,Cirebon", "081364537544", 0);
        Manusia irma = new Anak("Irsalina rif'at", "Bogor", "8 oktober 2008", "Pelajar", "Sragen,Jateng", "0", 0);
       
        System.out.println(bapak.getDetails());
        System.out.println(ibu.getDetails());
        System.out.println(fauzaan.getDetails());
        System.out.println(hamzah.getDetails());
        System.out.println(irma.getDetails());
    }
    
    }
