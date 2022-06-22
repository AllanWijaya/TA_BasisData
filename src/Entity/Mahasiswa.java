package Entity;

public class Mahasiswa extends UserAbstract{
    private String npm,alamat;

    public Mahasiswa() {}

    public Mahasiswa(int id, String nama,String npm, String alamat, String notelp,  String password) {
        super(id, nama, password, notelp);
        this.npm = npm;
        this.alamat = alamat;
    }



    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}


