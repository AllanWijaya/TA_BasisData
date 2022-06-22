package Model;
import Entity.Dosen;
import java.sql.*;
import java.util.ArrayList;
public class DosenModel extends ModelAbstract{
    private String sql;
    
    public ArrayList<Dosen> getDosen(){
        ArrayList<Dosen> ardsn = new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT *FROM dosen";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Dosen dsn = new Dosen();
                dsn.setId(rs.getInt("id_dosen"));
                dsn.setNama(rs.getString("nama_dosen"));
                dsn.setNip(rs.getString("nip"));
                dsn.setNotelp(rs.getString("notelp_dosen"));
                dsn.setPassword(rs.getString("password_dosen"));
                ardsn.add(dsn);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return ardsn;
    }
    public ArrayList<Dosen> getDosen(int id){
        ArrayList<Dosen> ardsn1 = new ArrayList<>();
        try{
            PreparedStatement stat=conn.prepareStatement(sql);
            sql="SELECT *FROM dosen where id_dosen = ?";
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                Dosen dsn = new Dosen();
                dsn.setId(rs.getInt("id_dosen"));
                dsn.setNama(rs.getString("nama_dosen"));
                dsn.setNip(rs.getString("nip"));
                dsn.setNotelp(rs.getString("notelp_dosen"));
                dsn.setPassword(rs.getString("password_dosen"));
                ardsn1.add(dsn);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return ardsn1;
    }
    public void insertData(Dosen dsn){
        try{
            sql="INSERT INTO dosen(id_dosen,nama_dosen,nip,notelp_dosen,password_dosen)"
                    + "VALUES (?,?,?,?,?) ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, dsn.getId());
            stat.setString(2, dsn.getNama());
            stat.setString(3, dsn.getNip());
            stat.setString(4, dsn.getNotelp());
            stat.setString(5, dsn.getPassword());
            int rows = stat.executeUpdate();
            System.out.println(rows+" baris ditambahkan");
        }catch(SQLException e){
            System.out.println(e);
        }      
    }
    public void updateNama(String nama, int id){
        try{
            sql = "update dosen SET nama_dosen =? WHERE id_dosen =?";
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
        public void updateNim(String nim, int id){
        try{
            sql = "update dosen SET nim =? WHERE id_dosen =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nim);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH NIM !!!");
            e.printStackTrace();
        }
    }
    public void updatePassword(String password, int id){
        try{
            sql = "update dosen SET password_dosen =? WHERE id_dosen =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, password);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }

    public void updateNotelp(String notelp, int id){
        try{
            sql = "update dosen SET notelp_dosen =? WHERE id_dosen =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, notelp);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
    public int cekLogin(String nim, String password){
        int cek = 0;
        try{
            sql ="SELECT * FROM dosen WHERE nim = ? and password_dosen = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nim);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id_dosen");
                String nama = rs.getString("nama_dosen");
                System.out.println("Selamat Datang" + nama);
            }else {
                cek = 0;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return cek;
    }
}
        