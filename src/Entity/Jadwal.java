package Entity;

public class Jadwal {
    private int id_jadwal;
    private String hari,jam;

    public Jadwal() {}

    public Jadwal(int id_jadwal, String hari, String jam) {
        this.id_jadwal = id_jadwal;
        this.hari = hari;
        this.jam = jam;
    }
    
    public int getId_jadwal() {
        return id_jadwal;
    }

    public void setId_jadwal(int id_jadwal) {
        this.id_jadwal = id_jadwal;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
    
}
