package uts.if2.pkg10119052.rizkidwinugraha.no2;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program Tabungan
 * 
 */
public class Tabungan {
    private int saldo;
    public int ambilUang;
    public int saldoakhir;
    public int jumlah;
   
     
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlah(){
       return jumlah; 
    }
    
    public int ambilUang(){
        return saldo-jumlah;
    }
    
    public void setAmbilUang(int ambilUang){
        this.ambilUang = ambilUang;
    }
    
    public void Tabungan(int saldo){
        Scanner input = new Scanner(System.in);   
        System.out.println("======Program Penarikan Uang======");
        System.out.print("Masukan Saldo Awal : ");
        this.saldo = input.nextInt();
        System.out.print("Jumlah uang yang diambil : ");
        this.jumlah = input.nextInt();            
    }
    
    public void tampilhasil(){
        System.out.println("Saldo Anda Sekarang : "+ ambilUang());
    }
    
    public int getSaldoAkhir(){
        return saldoakhir;
    }
    
    public void setsaldoAkhir(int saldoakhir){
        this.saldoakhir = saldoakhir;
        
    }
}
