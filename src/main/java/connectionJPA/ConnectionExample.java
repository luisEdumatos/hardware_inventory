package connectionJPA;

import enums.DeviceStatusCondition;
import enums.DeviceType;
import model.Hardware;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionExample {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("initial-JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Hardware hardware = new Hardware(1, "VGA", "Fulano de tal", "SIG22", DeviceType.DESKTOP, "Dell", "Vostro 3555", "Windows 10", true, true, true, "i5", "10", "3.0", "8", "SSD240", DeviceStatusCondition.MEIO_TERMO, "2010");

        entityManager.getTransaction().begin();
        entityManager.persist(hardware);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
