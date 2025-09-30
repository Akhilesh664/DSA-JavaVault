package Extra;

import java.sql.*;

public class OracleJdbcCon_63 {

    public static void main(String[] args) {
        try{
            // step 1). Load driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step 2). create connection object
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "oracle");

            // step 3). create statement object
            Statement stmt = connection.createStatement();

            // step 4). execute query
            ResultSet rs = stmt.executeQuery("select * from emp");

            // step 5). write output
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            // step 6). close the connection object
            connection.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
