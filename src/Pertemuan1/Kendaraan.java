package Pertemuan1;

public class Kendaraan {
    public String nama;
    public String klakson;
    public int jml_roda;
    public String warna;
    public String jurusan;
    public void nyalakanMesin()
    {
        System.out.println("Kendaraan "+this.nama+" Sedang dinyakan");
    }
    public void bunyikanKlakson()
    {
        System.out.println("Bunyi Klakson: "+this.klakson);
    }
    public void jalanMaju()
    {
        System.out.println("Kendaraan "+this.nama+" sedang Jalan maju");
    }
    public void jalanMundur()
    {
        System.out.println("kendaraan "+this.nama+" Sedang Jalan mundur");
    }
    public void tampilkanSpek()
    {
        System.out.println("Spesifikasi");
        System.out.println("Nama kendaraan  : "+this.nama);
        System.out.println("jml roda        : "+this.jml_roda);
        System.out.println("Warna Kendaraan : "+this.warna);
        System.out.println("Jurusan         : "+this.jurusan);
    }
}
class KendaraanMain{
    public static void main (String[]args){
        Kendaraan bis = new Kendaraan();
        bis.nama = "Tentrem";
        bis.warna = "Putih hitam";
        bis.jml_roda = 6;
        bis.klakson = "honkkk";
        bis.jurusan = "Surabaya-Malang";
        bis.nyalakanMesin();
        bis.tampilkanSpek();
        bis.jalanMaju();
        bis.jalanMundur();

        System.out.println();
        Kendaraan angkot = new Kendaraan();
        angkot.nama = "Angkot AG";
        angkot.warna = "Hijau";
        angkot.klakson = "Teeet";
        angkot.jml_roda = 4;
        angkot.jurusan = "Arjosari-Gadang";
        angkot.nyalakanMesin();
        angkot.tampilkanSpek();
        angkot.jalanMaju();
        angkot.jalanMundur();
        angkot.bunyikanKlakson();

        System.out.println();
        Kendaraan kereta = new Kendaraan();
        kereta.nama = "Ka Airlangga";
        kereta.warna = "Putih";
        kereta.klakson = "Ngiikk Pounggss";
        kereta.jml_roda = 8;
        kereta.jurusan = "Surabaya PsTuri-Jakarta";
        kereta.nyalakanMesin();
        kereta.tampilkanSpek();
        kereta.jalanMaju();
        kereta.jalanMundur();
    }
}
