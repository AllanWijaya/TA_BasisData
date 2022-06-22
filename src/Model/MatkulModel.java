package Model;
import Helper.KoneksiDb;
import java.util.ArrayList;
import Entity.Matkul;
import java.sql.*;
public class MatkulModel {
    private String sql;
    Connection conn = KoneksiDb.getconection();
    public ArrayList<Matkul> getMatkul(){
        ArrayList<Matkul> armtl = new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT *FROM matkul";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Matkul mhs = new Matkul();
                mhs.setId_mk(rs.getInt("id_matkul"));
                mhs.setKode_mk(rs.getString("kode_matkul"));
                mhs.setNama_mk(rs.getString("nama_matkul"));
                mhs.setSks(rs.getInt("sks"));
                mhs.setSemester(rs.getInt("semester"));
                armtl.add(mhs);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return armtl;
    }

    public void insertData(Matkul mhs){
        try{
            sql="INSERT INTO matkul(id_matkul,nama_matkul,kode_matkul,sks,semester)"
                    + "VALUES (?,?,?,?,?) ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, mhs.getId_mk());
            stat.setString(2, mhs.getNama_mk());
            stat.setString(3, mhs.getKode_mk());
            stat.setInt(4, mhs.getSks());
            stat.setInt(5, mhs.getSemester());
            int rows = stat.executeUpdate();
            System.out.println(rows+" baris ditambahkan");
        }catch(SQLException e){
            System.out.println(e);
        }      
    }
    public void updateNamaMK(String nama, int id){
        try{
            sql = "update matkul SET nama_matkul =? WHERE id_matkul =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
    public void updateKodeMK(String kode, int id){
        try{
            sql = "update matkul SET kode_matkul =? WHERE id_matkul =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, kode);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
    public void updateSks(int sks, int id){
        try{
            sql = "update matkul SET sks =? WHERE id_matkul =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, sks);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
    public void updateSemester(int sem, int id){
        try{
            sql = "update matkul SET semester =? WHERE id_matkul =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, sem);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }

    public void deleteMatkul(int id){
        try{
            sql = "delete from matkul WHERE id_matkul=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            stat.executeUpdate();
            System.out.println("Berhasil Menghapus Data!!!");
        }catch (SQLException e){
            System.out.println("Gagal Menghapus Data !!!");
            e.printStackTrace();
        }
    }
}
