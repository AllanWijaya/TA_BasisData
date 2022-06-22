package Entity;

public class Ruang {
    private int id_ruang;
    private String nama_ruang;

    public Ruang() {
    }
    
    public Ruang(int id_ruang, String nama_ruang) {
        this.id_ruang = id_ruang;
        this.nama_ruang = nama_ruang;
    }


    public int getId_ruang() {
        return id_ruang;
    }

    public void setId_ruang(int id_ruang) {
        this.id_ruang = id_ruang;
    }

    public String getNama_ruang() {
        return nama_ruang;
    }

    public void setNama_ruang(String nama_ruang) {
        this.nama_ruang = nama_ruang;
    }
    
}
