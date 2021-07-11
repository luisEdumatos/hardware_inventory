package service;

import jdbc.ConnectionJDBC;
import model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {

    //Retornar os dados de todos Clientes do banco
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

    //Retornar dado do cliente solicitado pelo id
    public Client getById(int id) {
        Client client = new Client();

        try(Connection conn = ConnectionJDBC.getConnection()) {

            String sql = "SELECT * FROM client WHERE id = ?";
            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setInt(1, id);

            ResultSet rs = prst.executeQuery();

            if (rs.next()) {
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

    //Insere Cliente no banco
    public  void createClient(Client client) {
        try(Connection conn = ConnectionJDBC.getConnection()) {

            String sql = "INSERT INTO client(name, cnpj, address) VALUES(?, ?, ?)";

            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setString(1, client.getName());
            prst.setString(2, client.getCnpj());
            prst.setString(3, client.getAddress());

            int rowsAffected = prst.executeUpdate();

            System.out.println("Inserção bem sucedida! Foi adiciona " + rowsAffected + "linhas");
        } catch (Exception e) {
            System.out.println("Inserção falhou!");
            e.printStackTrace();
        }
    }

    //Delata Cliente no banco
    public void deleteClient(int id) {
        try(Connection conn = ConnectionJDBC.getConnection()) {

            String sql = "DELETE FROM client WHERE id = ?";

            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setInt(1, id);

            int rowsAffected = prst.executeUpdate();

            System.out.println("Delete bem sucedido! Foi deletada " + rowsAffected + "linhas");
        } catch (Exception e) {
            System.out.println("Delete falhou!");
            e.printStackTrace();
        }
    }

    //Atualiza Cliente no banco
    public void update (Client client) {
        try(Connection conn = ConnectionJDBC.getConnection()) {

            String sql = "UPDATE client SET name = ?, cnpj = ?, address = ? WHERE id = ?";

            PreparedStatement prst = conn.prepareStatement(sql);
            prst.setString(1, client.getName());
            prst.setString(2, client.getCnpj());
            prst.setString(3, client.getAddress());
            prst.setInt(4, client.getId());

            int rowsAffected = prst.executeUpdate();

            System.out.println("Atualização bem sucedida! Foi atualizada " + rowsAffected + "linhas");
        } catch (Exception e) {
            System.out.println("Atualização falhou!");
            e.printStackTrace();
        }
    }
}


