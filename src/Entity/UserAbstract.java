package Entity;

public abstract class UserAbstract {
    private int id;
    private String nama,password,notelp;
    public UserAbstract(){};
    public UserAbstract(int id,String nama,String password,String notelp){
        this.id=id;
        this.nama=nama;
        this.password=password;
        this.notelp=notelp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
    
}
