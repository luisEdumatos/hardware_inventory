package connectionJPA;

import enums.DeviceStatusCondition;
import enums.DeviceType;
import model.Client;
import model.Hardware;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionExample {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Client client = new Client("Cliente", "123.456", "Endereco");
        Hardware hardware = new Hardware(client, "VGA", "Fulano de tal", "SIG22", DeviceType.DESKTOP, "Dell", "Vostro 3555", "Windows 10", true, true, true, "i5", "10", "3.0", "8", "SSD240", DeviceStatusCondition.MEIO_TERMO, "2010");
        Hardware hardware2 = new Hardware(client, "VGA", "Fulano", "SIG25", DeviceType.DESKTOP, "Dell", "Vostro 3555", "Windows 10", true, true, true, "i5", "10", "3.0", "8", "SSD240", DeviceStatusCondition.MEIO_TERMO, "2010");

        entityManager.getTransaction().begin();

        entityManager.persist(client);
        entityManager.persist(hardware);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
