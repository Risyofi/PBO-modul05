package modul5.latihan;

public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;

    void printInfo(){
        System.out.println(
            "Nama Pengarang : " + namaPengarang + "\n" +
            "Judul Buku     : " + judulBuku + "\n" +
            "Tahun Terbit   : " + tahunTerbit + "\n" +
            "Cetakan Ke     : " + cetakanKe + "\n" +
            "Harga Jual     : " + hargaJual + "\n" 
        );
    }
    public Buku(String namaPengarang, String judulBuku){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        printInfo();
    }

    public Buku(int tahunTerbit, int cetakanKe){
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        printInfo();
    }

    public Buku(double hargaJual){
        this.hargaJual = hargaJual;
        printInfo();
    }

    public Buku(String judulBuku, double hargaJual){
        this.judulBuku = judulBuku;
        this.hargaJual = hargaJual;
        printInfo();
    }
    
    public Buku(String judulBuku, int tahunTerbit, double hargaJual){
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.hargaJual = hargaJual;
        printInfo();
    }

}
