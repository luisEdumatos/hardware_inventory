package jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionJDBC {

    private ConnectionJDBC() {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection() {

        //Objeto de conexão
        Connection connection = null;

        //Carregar arquivo de propriedades com os parâmetros de conexão com o banco de dados
        try (InputStream input = ConnectionJDBC.class.getClassLoader().getResourceAsStream("connection.properties")) {
            //Define parâmetros para se conectar ao banco de dados
            Properties prop = new Properties();
            prop.load(input);

            String driver = prop.getProperty("jdbc.driver");
            String dataBaseAddress = prop.getProperty("db.address");
            String dataBaseName = prop.getProperty("db.name");
            String user = prop.getProperty("db.user.login");
            String password = prop.getProperty("db.user.password");

            //Construção da String de conexão
            StringBuilder sb = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(dataBaseAddress).append("/")
                    .append(dataBaseName);

            String connectionUrl = sb.toString();

            //Cria conexão usando o DriverManager
            try {
                connection = DriverManager.getConnection(connectionUrl, user, password);
            } catch (SQLException e) {
                System.out.println("Falha ao tentar criar a conexão com o banco de dados.");
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            System.out.println("Falha ao tentar carregar o arquivo de propriedades");
            e.printStackTrace();
        }
        return connection;
    }
}
