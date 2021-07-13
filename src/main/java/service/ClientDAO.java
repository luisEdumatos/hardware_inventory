package service;

import model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClientDAO {

    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Hibernate");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Retornar todos os clientes do banco
    public List<Client> getClients() {
        String jpql = "select c from Client c";
        List<Client> clients = entityManager
                .createQuery(jpql, Client.class)
                .getResultList();
        return clients;
    }

    //Buscar cliente por ID
    public Client getById(int id) {
        String jpql = "select c from Client c where c.id = :id";
        Client client = entityManager
                .createQuery(jpql, Client.class)
                .setParameter("id", id)
                .getSingleResult();
        return client;
    }

    //InsereCliente
    public void createClient(Client client) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(client);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    //Delata Cliente no banco
    public void deleteClient(int id) {
        try {
            entityManager.getTransaction().begin();
            Client client = entityManager.find(Client.class, id);
            entityManager.remove(client);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    //Atualiza Cliente no banco
    public void updateClient(Client client) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(client).setName(client.getName());
            entityManager.merge(client).setCnpj(client.getCnpj());
            entityManager.merge(client).setAddress(client.getAddress());
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

}


