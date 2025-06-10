import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    /* connection string */
    static final String connection_string = "jdbc:mysql://localhost:3306/jdbc_sw?user=root&password=root";

    public static void main(String[] args) throws Exception {
        /* registrazione del driver */
        Class.forName("com.mysql.cj.jdbc.Driver");
        /* istanza della connesione con interfaccia connection */
        Connection connection = DriverManager.getConnection(connection_string);
        Statement statement = connection.createStatement();

        /** Creazione oggetto iterator */
        /* ResultSet resultSet = statement.executeQuery("SELECT * FROM products"); */

        /** stampa dei risultati con metodo degli iterator next */
        /*
         * while (resultSet.next()) {
         * System.out.println(resultSet.getString("name"));
         * System.out.println(resultSet.getInt("price"));
         * System.out.println(resultSet.getString("description"));
         * }
         */

        ResultSet resultSet = statement.executeQuery(
                "SELECT p.name, v.attribute, v.value FROM products p join variants v ON p.id = v.product_id");
        while (resultSet.next()) {
            System.out.println("nome: " + resultSet.getString(1));
            System.out.println("attributo: " + resultSet.getString(2));
            System.out.println("valore: " + resultSet.getString(3));
        }

    }
}
