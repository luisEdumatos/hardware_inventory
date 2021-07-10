package service;

import jdbc.ConnectionJDBC;
import model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {

    //Retornar os dados de Client do banco
    public List<Client> list() {

        List<Client> client = new ArrayList<>();

        try(Connection conn = ConnectionJDBC.getConnection()) {

            PreparedStatement prst = conn.prepareStatement("SELECT * FROM client");
            ResultSet rs = prst.executeQuery();

            while (rs.next()) {
                Client c = new Client(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("cnpj"),
                        rs.getString("address")
                );
                client.add(c);
            }


        } catch (Exception e) {
            System.out.println("Falha no carregamento de Clientes no banco de dados");
            e.printStackTrace();
        }

        return client;
    }

    public Client getById(int id) {
        Client client = new Client();

        try(Connection conn = ConnectionJDBC.getConnection()) {

            String sql = "SELECT * FROM client WHERE id = ?";
            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setInt(1, id);

            ResultSet rs = prst.executeQuery();

            while (rs.next()) {
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setCnpj(rs.getString("cnpj"));
                client.setAddress(rs.getString("address"));
            }


        } catch (Exception e) {
            System.out.println("Falha no carregamento no cliente buscado");
            e.printStackTrace();
        }

        return client;
    }
}
