package Pertemuan1;

//merupakan object class berisi property dan method
public class KendaraanUmum {
    //atribut atau property dari kelas kendaraan
    public String nama;
    public String klakson;
    public int jml_roda;
    public String warna;
    public String jurusan;
    //konstruktor dari kelas kendaraaan untuk mengeset nilai default
    KendaraanUmum()
    {
        this.nama = "Mobil SMK";
        this.klakson = "Wushsss";
        this.jml_roda = 0;
        this.warna = "Invisible";
        this.jurusan = "Jakarta-China";
    }
    public void nyalakanMesin()
    {
        System.out.println("Kendaraan "+this.nama+" Sedang dinyakan");
    }
    public String bunyikanKlakson()
    {
        return this.klakson;
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

//merupakan driver class berisi method main sebagai penjalan program utama
class KendaraanMain{ //merupakan driver class berisi method main sebagai penjalan program utama
    public static void main (String[]args){ //method main
        KendaraanUmum bis = new KendaraanUmum(); //membuat objek bis dari kelas kendaraan umum
        bis.nama = "Tentrem"; //mengisi value nama dari objek bis
        bis.warna = "Putih Hitam"; //mengisi value warna dari objek bis
        bis.jml_roda = 6; //mengisis value roda dari objek bis
        bis.klakson = "honkkk"; //mengisi value klakson dari objek bis
        bis.jurusan = "Surabaya-Malang"; //mengisi value jurusan dari objek bis
        bis.nyalakanMesin(); //memanggil method nyalakanMesin dari objek bis
        bis.tampilkanSpek(); //memanggil method tampilkanSpek dari objek bis
        bis.jalanMaju(); //memanggil method jalanMaju dari objek bis
        bis.jalanMundur(); //memanggil method jalanMundur dari objek bis
        System.out.println("Bunyi klakson "+bis.nama+": "+bis.bunyikanKlakson());

        System.out.println();
        KendaraanUmum angkot = new KendaraanUmum(); //membuat objek angkot dari kelas KendaraanUmum
        angkot.nama = "Angkot AG"; //mengisi value nama dari objek angkot
        angkot.warna = "Hijau"; //mengisis value warna dari objek angkot
        angkot.klakson = "Teeet"; //mengisi value klakson dari objek angkot
        angkot.jml_roda = 4; //mengisi value roda dari objek angkot
        angkot.jurusan = "Arjosari-Gadang"; //mengisi value jurusan dari objek angkot
        angkot.nyalakanMesin(); //memanggil method nyalakanMesin dari objek angkot
        angkot.tampilkanSpek(); //memanggil method tampilkanSpek dari objek angkot
        angkot.jalanMaju(); //memanggil method jalanMaju dari objek angkot
        angkot.jalanMundur(); //memanggil method jalanMundur dari objek angkot
        //memanggil fungsi bereturnkan string, method non-void bunyikanKlakson dari objek angkot
        System.out.println("Bunyi klakson "+angkot.nama+": "+angkot.bunyikanKlakson());

        System.out.println();
        KendaraanUmum kereta = new KendaraanUmum(); //membuat objek kereta dari kelas KendaraanUmum
        kereta.nama = "Ka Malabar";
        kereta.warna = "Oreanye Putih Merah";
        kereta.klakson = "Ngiikk Pounggss";
        kereta.jml_roda = 8;
        kereta.jurusan = "Malang-Yogyakarta-Bandung";
        kereta.nyalakanMesin();
        kereta.tampilkanSpek();
        kereta.jalanMaju();
        kereta.jalanMundur();
        System.out.println("Bunyi klakson "+kereta.nama+" : "+kereta.bunyikanKlakson());
    }
}
