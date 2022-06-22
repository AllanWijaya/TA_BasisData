package Model;
import Helper.KoneksiDb;
import java.sql.Connection;
public abstract class ModelAbstract {
    Connection conn = KoneksiDb.getconection();
    public abstract int cekLogin(String np,String password);
    //bisa npm atau nip
}
