package Model;

import Entity.Jadwal;
import Helper.KoneksiDb;
import java.sql.*;
import java.util.ArrayList;

public class JadwalModel {
    Connection conn = KoneksiDb.getconection();
    private String sql;
    public ArrayList<Jadwal> getJadwal(){
        ArrayList<Jadwal> arjadwal = new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT *FROM jadwal";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Jadwal jwl = new Jadwal();
                jwl.setId_jadwal(rs.getInt("id_jadwal"));
                jwl.setHari(rs.getString("hari"));
                jwl.setJam(rs.getString("jam"));
                arjadwal.add(jwl);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return arjadwal;
    }
    public void insertData(Jadwal jwl){
        try{
            sql="INSERT INTO jadwal(hari,jam) VALUES (?,?) ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, jwl.getHari());
            stat.setString(2, jwl.getJam());
            int rows = stat.executeUpdate();
            System.out.println(rows+" baris ditambahkan");
        }catch(SQLException e){
            System.out.println(e);
        }      
    }
    public void updateHari(String hari, int id){
        try{
            sql = "update jadwal SET hari =? WHERE id_jadwal =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, hari);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
    public void updateJam(String jam, int id){
        try{
            sql = "update jadwal SET jam =? WHERE id_jadwal =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, jam);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
    public void deleteJadwal(int id){
        try{
            sql = "delete from jadwal WHERE id_jadwal =?";
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
