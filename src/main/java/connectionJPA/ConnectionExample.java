package connectionJPA;

import enums.DeviceStatusCondition;
import enums.DeviceType;
import model.Client;
import model.Hardware;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ConnectionExample {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
/*
        Client client = new Client("Novo", "123.456", "Endereco");
 //       Hardware hardware = new Hardware(client, "VGA", "Fulano de tal", "SIG22", DeviceType.DESKTOP.toString(), "Dell", "Vostro 3555", "Windows 10", true, true, true, "i5", "10", "3.0", "8", "SSD240", DeviceStatusCondition.MEIO_TERMO.toString(), "2010");
  //      Hardware hardware2 = new Hardware(client, "VGA", "Fulano", "SIG25", DeviceType.DESKTOP.toString(), "Dell", "Vostro 3555", "Windows 10", true, true, true, "i5", "10", "3.0", "8", "SSD240", DeviceStatusCondition.MEIO_TERMO.toString(), "2010");

       entityManager.getTransaction().begin();
       client = entityManager.find(Client.class, 3);
        Hardware hardware = new Hardware(client, "VGA", "teste", "SIG22", DeviceType.DESKTOP.toString(), "Dell", "Vostro 3555", "Windows 10", true, true, true, "i5", "10", "3.0", "8", "SSD240", DeviceStatusCondition.MEIO_TERMO.toString(), "2010");
        Hardware hardware2 = new Hardware(client, "VGA", "teste", "SIG25", DeviceType.DESKTOP.toString(), "Dell", "Vostro 3555", "Windows 10", true, true, true, "i5", "10", "3.0", "8", "SSD240", DeviceStatusCondition.MEIO_TERMO.toString(), "2010");

       entityManager.persist(hardware2);
       entityManager.persist(hardware);

       entityManager.getTransaction().commit();

  //      client = entityManager.find(Client.class, 1);
  //      System.out.println(client);
*/
        Client client = new Client("Teco Ti", "112.154.568/0001-56", "Avenida Rui Barbosa");
        String jpql = "insert into client (name, cnpj, address) values (client.name, client.cnpj, client.address)";
        entityManager.createQuery(jpql, Client.class).getSingleResult();

        /*

        entityManager.getTransaction().begin();
        Hardware hard = entityManager.find(Hardware.class, 7);
        entityManager.remove(hard);
        entityManager.getTransaction().commit();

        //Utilizando JPQL
        String name = "Teste";
        String jpql = "select c from Client c where c.name = :name";
        Client client = entityManager
                .createQuery(jpql, Client.class)
                .setParameter("name", name)
                .getSingleResult();

        System.out.println(client);
        System.out.println();

        jpql = "select c from Client c";
        List<Client> clients = entityManager
                                .createQuery(jpql, Client.class)
                                .getResultList();

        clients.forEach(Client -> System.out.println(Client));

        System.out.println();
        //Buscar todos Hardwares do Client 3
        jpql = "select h from Hardware h where h.client.name = :name";
        List<Hardware> hards = entityManager
                .createQuery(jpql, Hardware.class)
                .setParameter("name", "Novo")
                .getResultList();

        hards.forEach(Hardware -> System.out.println(Hardware));


*/
  //      entityManager.close();
  //      entityManagerFactory.close();
    }
}
