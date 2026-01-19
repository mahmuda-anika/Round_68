
package util2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class DeleteData {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your id for delete : ");
        int useridDelete = input.nextInt();
        
        String sql = "DELETE FROM emp WHERE id = '"+useridDelete+"'";
                
                

        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employee";
            String user = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);
            
            Statement stmt = con.createStatement();
            int status = stmt.executeUpdate(sql);
            
            if(status>0){
                System.out.println("Successfull");
            }else{
                System.out.println("Unsuccessfull");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Successful");
        }
        
        
    }
}
