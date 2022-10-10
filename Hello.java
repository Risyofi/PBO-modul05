package modul5.tugas;

public class Hello {
    String nama;
    int umur;
    public Hello(){
        System.out.println("hello...");
    }
    public Hello(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        System.out.println(
            "Nama saya " + nama + "umur " + umur + " tahun"
        );
    }
    
    public static void main(String[] args) {
        Hello foo = new Hello();
        Hello foo1 = new Hello("irfan ", 20);
        
        
    }
}
