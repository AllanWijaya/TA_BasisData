package Entity;
public class Matkul {
    private int id_mk,sks,semester;
    private String kode_mk,nama_mk;

    public Matkul() {}

    public Matkul(int id_mk, String kode_mk, String nama_mk, int sks, int semester) {
        this.id_mk = id_mk;
        this.sks = sks;
        this.semester = semester;
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
    }


    public int getId_mk() {
        return id_mk;
    }

    public void setId_mk(int id_mk) {
        this.id_mk = id_mk;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getKode_mk() {
        return kode_mk;
    }

    public void setKode_mk(String kode_mk) {
        this.kode_mk = kode_mk;
    }

    public String getNama_mk() {
        return nama_mk;
    }

    public void setNama_mk(String nama_mk) {
        this.nama_mk = nama_mk;
    }
    
}
