package Model;
import Entity.DetailKrs;
import Entity.Mahasiswa;
import Helper.KoneksiDb;
import java.sql.*;
import java.util.ArrayList;
public class DetailKrsModel {
    Connection conn = KoneksiDb.getconection();
    private String sql;
        public ArrayList<DetailKrs> getDetailKrs(){
        ArrayList<DetailKrs> ardkrs = new ArrayList<>();
        try{
            Statement stat=conn.createStatement();
            sql="SELECT *FROM detail_krs";
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                DetailKrs dkrs = new DetailKrs();
                dkrs.setId_mhs(rs.getInt("id_mhs"));
                dkrs.setId_ks(rs.getInt("id_ks"));
                ardkrs.add(dkrs);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return ardkrs;
    }
    public void insertData(DetailKrs mhs){
        try{
            sql="INSERT INTO detail_krs(id_mhs,id_ks)"
                    + "VALUES (?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, mhs.getId_mhs());
            stat.setInt(2, mhs.getId_ks());
            int rows = stat.executeUpdate();
            System.out.println(rows+" baris ditambahkan");
        }catch(SQLException e){
            System.out.println(e);
        }      
    }
}
