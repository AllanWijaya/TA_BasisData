package Entity;

public class DetailKrs {
    private int id_mhs,id_ks;
    public DetailKrs(){}

    public DetailKrs (int id_mhs, int id_ks) {
        this.id_mhs=id_mhs;
        this.id_ks = id_ks;
    }
    
    public int getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(int id_mhs) {
        this.id_mhs = id_mhs;
    }

    public int getId_ks() {
        return id_ks;
    }

    public void setId_ks(int id_ks) {
        this.id_ks = id_ks;
    }
    
}
