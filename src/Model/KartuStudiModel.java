package Model;

import Entity.KartuStudi;
import Helper.KoneksiDb;
import java.sql.*;
import java.util.ArrayList;

public class KartuStudiModel {
    Connection conn = KoneksiDb.getconection();
    private String sql;
    public ArrayList<KartuStudi> getKartuStudi(){
        ArrayList<KartuStudi> arkrs = new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT *FROM kartu_studi";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                KartuStudi krs = new KartuStudi();
                krs.setId_ks(rs.getInt("id_ks"));
                krs.setId_dsn(rs.getInt("id_dsn"));
                krs.setId_mk(rs.getInt("id_mk"));
                krs.setId_jadwal(rs.getInt("id_jadwal"));
                krs.setId_ruang(rs.getInt("id_ruang"));
                krs.setIpk(rs.getFloat("ipk"));
                arkrs.add(krs);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return arkrs;
    }
    public void insertData(KartuStudi mhs){
        try{
            sql="INSERT INTO kartu_studi(id_ks,id_dosen,id_matkul,id_jadwal,id_ruang,ipk)"
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, mhs.getId_ks());
            stat.setInt(2, mhs.getId_dsn());
            stat.setInt(3, mhs.getId_mk());
            stat.setInt(4, mhs.getId_jadwal());
            stat.setInt(5, mhs.getId_ruang());
            stat.setFloat(6, mhs.getIpk());
            int rows = stat.executeUpdate();
            System.out.println(rows+" baris ditambahkan");
        }catch(SQLException e){
            System.out.println(e);
        }      
    }
    public void updateIpk(Float ipk, int id){
        try{
            sql = "update kartu_studi SET ipk =? WHERE id_ks =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setFloat(1, ipk);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
    public void deleteKrs(int id){
        try{
            sql = "delete from kartu_studi WHERE id_ks =?";
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
