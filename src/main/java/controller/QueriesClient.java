package controller;

import enums.DeviceType;
import model.Client;
import service.ClientDAO;

import java.util.List;

public class QueriesClient {

    private ClientDAO clientDAO = new ClientDAO();

    //Busca todos Clients
    public List<Client> getClients() {
        return clientDAO.list();
    }

    //Busca Cliente por Id
    public Client getClientById(int id) {
        return clientDAO.getById(id);
    }

    //Insere Cliente
    public void setNewClient(Client client) {
        clientDAO.createClient(client);
    }

    //Deletar Cliente
    public void deleteClient(int id) {
        clientDAO.deleteClient(id);
    }

    //Atualizar Cliente
    public void updateClient(Client client) {
        clientDAO.update(client);
    }

}

