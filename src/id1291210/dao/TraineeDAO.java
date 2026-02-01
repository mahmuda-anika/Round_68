
package id1291210.dao;

import id1291210.model.Trainee;
import id1291210.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TraineeDAO {

    public Trainee insert(Trainee t) {

        String sql = "INSERT INTO trainee (name, age, address) VALUES (_name, _age, _address)";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, t.getName());
            ps.setInt(2, t.getAge());
            ps.setString(3, t.getAddress());

            int status = ps.executeUpdate();

            if (status > 0) {
                System.out.println("Inserted Successfully");
            } else {
                System.out.println("Insert Failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }
}

