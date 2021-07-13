package service;

import enums.DeviceStatusCondition;
import enums.DeviceType;
import model.Client;
import model.Hardware;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class HardwareDAO {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Hibernate");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    //Retornar os dados de todos Hardwares do banco
    public List<Hardware> getHardwares() {
        String jpql = "select h from Hardware h";
        List<Hardware> hardwares = entityManager
                .createQuery(jpql, Hardware.class)
                .getResultList();
        return hardwares;
    }

    //Retornar dado do hardware solicitado pelo id
    public Hardware getById(int id) {
        String jpql = "select h from Hardware h where h.id = :id";
        Hardware hardware = entityManager
                .createQuery(jpql, Hardware.class)
                .setParameter("id", id)
                .getSingleResult();
        return hardware;
    }

    //Insere Hardware no banco
    public  void createHardware(Hardware hardware) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(hardware);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    //Delata Hardware no banco
    public void deleteHardware(int id) {
        try {
            entityManager.getTransaction().begin();
            Hardware hardware = entityManager.find(Hardware.class, id);
            entityManager.remove(hardware);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    //Atualiza Hardware no banco
    public void update (Hardware hardware) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(hardware).setClient(hardware.getClient());
            entityManager.merge(hardware).setDeviceLocalization(hardware.getDeviceLocalization());
            entityManager.merge(hardware).setDeviceOwnerUserName(hardware.getDeviceOwnerUserName());
            entityManager.merge(hardware).setDeviceTag(hardware.getDeviceTag());
            entityManager.merge(hardware).setDeviceType(DeviceType.valueOf(hardware.getDeviceType()));
            entityManager.merge(hardware).setDeviceBrand(hardware.getDeviceBrand());
            entityManager.merge(hardware).setDeviceModel(hardware.getDeviceModel());
            entityManager.merge(hardware).setDeviceSO(hardware.getDeviceSO());
            entityManager.merge(hardware).setDeviceSOLicensed(hardware.isDeviceSOLicensed());
            entityManager.merge(hardware).setDeviceOfficeLicensed(hardware.isDeviceOfficeLicensed());
            entityManager.merge(hardware).setDeviceAntivirusLicensed(hardware.isDeviceAntivirusLicensed());
            entityManager.merge(hardware).setDeviceProcessor(hardware.getDeviceProcessor());
            entityManager.merge(hardware).setDeviceProcessorGeneration(hardware.getDeviceProcessorGeneration());
            entityManager.merge(hardware).setDeviceProcessorGHZ(hardware.getDeviceProcessorGHZ());
            entityManager.merge(hardware).setDeviceRAM(hardware.getDeviceRAM());
            entityManager.merge(hardware).setDeviceHD(hardware.getDeviceHD());
            entityManager.merge(hardware).setDeviceStatusCondition(DeviceStatusCondition.valueOf(hardware.getDeviceStatusCondition()));
            entityManager.merge(hardware).setDeviceSwapPrediction(hardware.getDeviceSwapPrediction());
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

}
