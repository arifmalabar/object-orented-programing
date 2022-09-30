package Pertemuan2;

public class Mahasiswa {
    //membuat atribut kelas
    public String nim;
    public String judul;
    public String nama;
    public String mataKuliah;
    public int nilaiUts;
    public int nilaiUas;
    public double nilaiTotal;
    //membuat konstruktor
    Mahasiswa()
    {
        this.judul = "Nilai OOp Ntasya";
        this.nim = "2118032"; //mengisi value nim dari property nim
        this.nama = "Natasya"; //mengisi value nama dari property nama
        this.mataKuliah = "OOP"; //mengisi value matakuliah dari property MataKuliah
        this.nilaiUts = 0; //mengisi value matakuliah dari property NilaiUts
        this.nilaiUas = 0; //mengisi value NilaiUts dari property NilaiUts
    }
    //membuat method void
    public void setJudul()
    {
        this.judul = "Nilai dari MK OOP";
    }
    //membuat method non-void
    public double hitungNilaiTotal()
    {
        this.nilaiTotal = (0.4 * this.nilaiUts) + (0.6 * this.nilaiUas);
        return this.nilaiTotal;
    }
    public static void main(String[]args)
    {
        Mahasiswa ridho = new Mahasiswa(); //membuat objek ridho dari kelas mahasiswa
        ridho.nim = "2118055"; //mengisi value nim dari property nim
        ridho.nama = "Ridho Arif Wicaksono"; //mengisi value nama dari property nama
        ridho.mataKuliah = "OOP"; //mengisi value matakuliah dari property MataKuliah
        ridho.nilaiUts = 100; //mengisi value matakuliah dari property NilaiUts
        ridho.nilaiUas = 95; //mengisi value NilaiUts dari property NilaiUas

        ridho.setJudul();
        System.out.println(ridho.judul);
        System.out.println("Nim : "+ridho.nim); //mengambil value dari property nim
        System.out.println("Nama: "+ridho.nama); //mengambil value dari property nama
        System.out.println("Matakuliah : "+ridho.mataKuliah); //mengambil value dari property matakuliah
        System.out.println("Nilai UTS : "+ridho.nilaiUts); //mengambil value dari propery uts
        System.out.println("Nilai UAS : "+ridho.nilaiUas); //mengambil value dari property uas
        System.out.println("Nilai total : "+ridho.hitungNilaiTotal()); //memanggil method total dari objek ridho

        Mahasiswa kosong = new Mahasiswa();
        ridho.setJudul();
        System.out.println("\n"+kosong.judul);
        System.out.println("Nim : "+kosong.nim); //mengambil value dari property nim
        System.out.println("Nama: "+kosong.nama); //mengambil value dari property nama
        System.out.println("Matakuliah : "+kosong.mataKuliah); //mengambil value dari property matakuliah
        System.out.println("Nilai UTS : "+kosong.nilaiUts); //mengambil value dari propery uts
        System.out.println("Nilai UAS : "+kosong.nilaiUas); //mengambil value dari property uas
        System.out.println("Nilai total : "+kosong.hitungNilaiTotal()); //memanggil method total dari objek ridho
    }
}
