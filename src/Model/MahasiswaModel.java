package Model;
import Entity.Mahasiswa;
import java.sql.*;
import java.util.ArrayList;
public class MahasiswaModel extends ModelAbstract{
    private String sql;
    
    public ArrayList<Mahasiswa> getMahasiswa(){
        ArrayList<Mahasiswa> armahasiswa = new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT *FROM mahasiswa";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id_mhs"));
                mhs.setNama(rs.getString("nama_mhs"));
                mhs.setNpm(rs.getString("npm"));
                mhs.setAlamat(rs.getString("alamat_mhs"));
                mhs.setNotelp(rs.getString("notelp_mhs"));
                mhs.setPassword(rs.getString("password_mhs"));

                armahasiswa.add(mhs);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return armahasiswa;
    }
    public ArrayList<Mahasiswa> getMahasiswa(int id){
        ArrayList<Mahasiswa> armahasiswa1 = new ArrayList<>();
        try{
            PreparedStatement stat=conn.prepareStatement(sql);
            sql="SELECT *FROM mahasiswa where id_mhs = ?";
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id_mhs"));
                mhs.setNama(rs.getString("nama_mhs"));
                mhs.setNpm(rs.getString("npm"));
                mhs.setPassword(rs.getString("password_mhs"));
                mhs.setAlamat(rs.getString("alamat_mhs"));
                mhs.setNotelp(rs.getString("notelp_mhs"));
                armahasiswa1.add(mhs);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return armahasiswa1;
    }
    public void insertData(Mahasiswa mhs){
        try{
            sql="INSERT INTO mahasiswa(id_mhs,nama_mhs,npm,alamat_mhs,notelp_mhs,password_mhs)"
                    + "VALUES (?,?,?,?,?,?) ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, mhs.getId());
            stat.setString(2, mhs.getNama());
            stat.setString(3, mhs.getNpm());
            stat.setString(4, mhs.getAlamat());
            stat.setString(5, mhs.getNotelp());
            stat.setString(6, mhs.getPassword());
            int rows = stat.executeUpdate();
            System.out.println(rows+" baris ditambahkan");
        }catch(SQLException e){
            System.out.println(e);
        }      
    }
    public void updateNama(String nama, int id){
        try{
            sql = "update mahasiswa SET nama_mhs =? WHERE id_mhs =?";
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
        public void updateNpm(String npm, int id){
        try{
            sql = "update mahasiswa SET npm =? WHERE id_mhs =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, npm);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
            public void updatePassword(String password, int id){
        try{
            sql = "update mahasiswa SET password_mhs =? WHERE id_mhs =?";
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
            sql = "update mahasiswa SET notelp_mhs =? WHERE id_mhs =?";
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
    public void updateAlamat(String alamat, int id){
        try{
            sql = "update mahasiswa SET alamat_mhs =? WHERE id_mhs =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, alamat);
            stat.setInt(2, id);
            stat.executeUpdate();
            System.out.println("Berhasil di-update!");
        }catch (SQLException e){
            System.out.println("GAGAL UBAH DATA !!!");
            e.printStackTrace();
        }
    }
    public void deleteMahasiswa(int id){
        try{
            sql = "delete from mahasiswa WHERE id_mhs =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            stat.executeUpdate();
            System.out.println("Berhasil Menghapus Data!!!");
        }catch (SQLException e){
            System.out.println("Gagal Menghapus Data !!!");
            e.printStackTrace();
        }
    }
    public int cekLogin(String npm, String password){
        int cek = 0;
        try{
            sql ="SELECT * FROM mahasiswa WHERE npm = ? and password_mhs = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, npm);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id_mhs");
                String nama = rs.getString("nama_mhs");
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
        