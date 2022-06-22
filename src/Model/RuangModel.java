package Model;

import Entity.Ruang;
import Helper.KoneksiDb;
import java.sql.*;
import java.util.ArrayList;

public class RuangModel {
    Connection conn = KoneksiDb.getconection();
    private String sql;
    public ArrayList<Ruang> getRuang(){
        ArrayList<Ruang> arruang = new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT *FROM ruang";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Ruang rg = new Ruang();
                rg.setId_ruang(rs.getInt("id_ruang"));
                rg.setNama_ruang(rs.getString("nama_ruang"));
                arruang.add(rg);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return arruang;
    }
    public void insertData(Ruang rg){
        try{
            sql="INSERT INTO ruang(id_ruang,nama_ruang) VALUES (?,?) ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, rg.getId_ruang());
            stat.setString(2, rg.getNama_ruang());
            int rows = stat.executeUpdate();
            System.out.println(rows+" baris ditambahkan");
        }catch(SQLException e){
            System.out.println(e);
        }      
    }
    public void updateNamaruang(String nama, int id){
        try{
            sql = "update ruang SET nama_ruang =? WHERE id_ruang =?";
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
    public void deleteRuang(int id){
        try{
            sql = "delete from ruang WHERE id_ruang =?";
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
