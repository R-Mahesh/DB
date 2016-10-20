import java.sql.*;
public class Test {
    public static void main(String[] a)
            throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery("select * from test ");
        while(rs.next())
        {
        	System.out.println(rs.getString("NAME"));
        }
       
        // add application code here
        	conn.close();
    }
}