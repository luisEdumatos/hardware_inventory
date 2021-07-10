package controller;

import model.Client;
import service.ClientDAO;

import java.util.List;

public class QueriesClient {
    public static void main(String[] args) {

        ClientDAO clientDAO = new ClientDAO();

        List<Client> clients = clientDAO.list();

        clients.stream().forEach(System.out::println);
    }
}
