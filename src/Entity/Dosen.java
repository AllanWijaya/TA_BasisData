package Entity;

public class Dosen extends UserAbstract {
    private String nip;

    public Dosen() {}
    
    public Dosen( int id, String nama, String nip, String notelp,String password) {
        super(id, nama, password, notelp);
        this.nip = nip;
    }


    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
}
