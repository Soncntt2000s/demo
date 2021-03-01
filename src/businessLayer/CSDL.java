
package businessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mamon
 */
public class CSDL {
    private static Connection ketNoi;
    public static Connection getConnect()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "jdbc:sqlserver://localhost:1433;databaseName = QLMAYTINH; integratedSecurity = true;";
            ketNoi = DriverManager.getConnection(sql,"sa","sa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Loi "+e);
        }
        return ketNoi;
    }
}
