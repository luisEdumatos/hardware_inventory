package model;

import enums.DeviceStatusCondition;
import enums.DeviceType;

import javax.persistence.*;

@Entity
public class Hardware {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;
    @Column(nullable = false)
    private String deviceLocalization;
    @Column(nullable = false)
    private String deviceOwnerUserName;
    @Column(nullable = false)
    private String deviceTag;
    @Column(nullable = false)
    private String deviceType;
    @Column(nullable = false)
    private String deviceBrand;
    @Column(nullable = false)
    private String deviceModel;
    @Column(nullable = false)
    private String deviceSO;
    @Column(nullable = false)
    private boolean deviceSOLicensed;
    @Column(nullable = false)
    private boolean deviceOfficeLicensed;
    @Column(nullable = false)
    private boolean deviceAntivirusLicensed;
    @Column(nullable = false)
    private String deviceProcessor;
    @Column(nullable = false)
    private String deviceProcessorGeneration;
    @Column(nullable = false)
    private String deviceProcessorGHZ;
    @Column(nullable = false)
    private String deviceRAM;
    @Column(nullable = false)
    private String deviceHD;
    @Column(nullable = false)
    private String deviceStatusCondition;
    @Column(nullable = false)
    private String deviceSwapPrediction;

    public Hardware() { }

    public Hardware(int id, Client client, String deviceLocalization, String deviceOwnerUserName, String deviceTag, String deviceType, String deviceBrand, String deviceModel, String deviceSO, boolean deviceSOLicensed, boolean deviceOfficeLicensed, boolean deviceAntivirusLicensed, String deviceProcessor, String deviceProcessorGeneration, String deviceProcessorGHZ, String deviceRAM, String deviceHD, String deviceStatusCondition, String deviceSwapPrediction) {
        this.id = id;
        this.client = client;
        this.deviceLocalization = deviceLocalization;
        this.deviceOwnerUserName = deviceOwnerUserName;
        this.deviceTag = deviceTag;
        this.deviceType = deviceType;
        this.deviceBrand = deviceBrand;
        this.deviceModel = deviceModel;
        this.deviceSO = deviceSO;
        this.deviceSOLicensed = deviceSOLicensed;
        this.deviceOfficeLicensed = deviceOfficeLicensed;
        this.deviceAntivirusLicensed = deviceAntivirusLicensed;
        this.deviceProcessor = deviceProcessor;
        this.deviceProcessorGeneration = deviceProcessorGeneration;
        this.deviceProcessorGHZ = deviceProcessorGHZ;
        this.deviceRAM = deviceRAM;
        this.deviceHD = deviceHD;
        this.deviceStatusCondition = deviceStatusCondition;
        this.deviceSwapPrediction = deviceSwapPrediction;
    }

    public Hardware(Client client, String deviceLocalization, String deviceOwnerUserName, String deviceTag, String deviceType, String deviceBrand, String deviceModel, String deviceSO, boolean deviceSOLicensed, boolean deviceOfficeLicensed, boolean deviceAntivirusLicensed, String deviceProcessor, String deviceProcessorGeneration, String deviceProcessorGHZ, String deviceRAM, String deviceHD, String deviceStatusCondition, String deviceSwapPrediction) {
        this.client = client;
        this.deviceLocalization = deviceLocalization;
        this.deviceOwnerUserName = deviceOwnerUserName;
        this.deviceTag = deviceTag;
        this.deviceType = deviceType;
        this.deviceBrand = deviceBrand;
        this.deviceModel = deviceModel;
        this.deviceSO = deviceSO;
        this.deviceSOLicensed = deviceSOLicensed;
        this.deviceOfficeLicensed = deviceOfficeLicensed;
        this.deviceAntivirusLicensed = deviceAntivirusLicensed;
        this.deviceProcessor = deviceProcessor;
        this.deviceProcessorGeneration = deviceProcessorGeneration;
        this.deviceProcessorGHZ = deviceProcessorGHZ;
        this.deviceRAM = deviceRAM;
        this.deviceHD = deviceHD;
        this.deviceStatusCondition = deviceStatusCondition;
        this.deviceSwapPrediction = deviceSwapPrediction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public String getDeviceLocalization() {
        return deviceLocalization;
    }

    public void setDeviceLocalization(String deviceLocalization) {
        this.deviceLocalization = deviceLocalization;
    }

    public String getDeviceOwnerUserName() {
        return deviceOwnerUserName;
    }

    public void setDeviceOwnerUserName(String deviceOwnerUserName) {
        this.deviceOwnerUserName = deviceOwnerUserName;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType.toString();
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceSO() {
        return deviceSO;
    }

    public void setDeviceSO(String deviceSO) {
        this.deviceSO = deviceSO;
    }

    public boolean isDeviceSOLicensed() {
        return deviceSOLicensed;
    }

    public void setDeviceSOLicensed(boolean deviceSOLicensed) {
        this.deviceSOLicensed = deviceSOLicensed;
    }

    public boolean isDeviceOfficeLicensed() {
        return deviceOfficeLicensed;
    }

    public void setDeviceOfficeLicensed(boolean deviceOfficeLicensed) {
        this.deviceOfficeLicensed = deviceOfficeLicensed;
    }

    public boolean isDeviceAntivirusLicensed() {
        return deviceAntivirusLicensed;
    }

    public void setDeviceAntivirusLicensed(boolean deviceAntivirusLicensed) {
        this.deviceAntivirusLicensed = deviceAntivirusLicensed;
    }

    public String getDeviceProcessor() {
        return deviceProcessor;
    }

    public void setDeviceProcessor(String deviceProcessor) {
        this.deviceProcessor = deviceProcessor;
    }

    public String getDeviceProcessorGeneration() {
        return deviceProcessorGeneration;
    }

    public void setDeviceProcessorGeneration(String deviceProcessorGeneration) {
        this.deviceProcessorGeneration = deviceProcessorGeneration;
    }

    public String getDeviceProcessorGHZ() {
        return deviceProcessorGHZ;
    }

    public void setDeviceProcessorGHZ(String deviceProcessorGHZ) {
        this.deviceProcessorGHZ = deviceProcessorGHZ;
    }

    public String getDeviceRAM() {
        return deviceRAM;
    }

    public void setDeviceRAM(String deviceRAM) {
        this.deviceRAM = deviceRAM;
    }

    public String getDeviceHD() {
        return deviceHD;
    }

    public void setDeviceHD(String deviceHD) {
        this.deviceHD = deviceHD;
    }

    public String getDeviceStatusCondition() {
        return deviceStatusCondition;
    }

    public void setDeviceStatusCondition(DeviceStatusCondition deviceStatusCondition) {
        this.deviceStatusCondition = deviceStatusCondition.toString();
    }

    public String getDeviceSwapPrediction() {
        return deviceSwapPrediction;
    }

    public void setDeviceSwapPrediction(String deviceSwapPrediction) {
        this.deviceSwapPrediction = deviceSwapPrediction;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "id=" + id +
                ", deviceLocalization='" + deviceLocalization + '\'' +
                ", deviceOwnerUserName='" + deviceOwnerUserName + '\'' +
                ", deviceTag='" + deviceTag + '\'' +
                ", deviceType=" + deviceType +
                ", deviceBrand='" + deviceBrand + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", deviceSO='" + deviceSO + '\'' +
                ", deviceSOLicensed=" + deviceSOLicensed +
                ", deviceOfficeLicensed=" + deviceOfficeLicensed +
                ", deviceAntivirusLicensed=" + deviceAntivirusLicensed +
                ", deviceProcessor='" + deviceProcessor + '\'' +
                ", deviceProcessorGeneration='" + deviceProcessorGeneration + '\'' +
                ", deviceProcessorGHZ='" + deviceProcessorGHZ + '\'' +
                ", deviceRAM='" + deviceRAM + '\'' +
                ", deviceHD='" + deviceHD + '\'' +
                ", deviceStatusCondition=" + deviceStatusCondition +
                ", deviceSwapPrediction='" + deviceSwapPrediction + '\'' +
                '}';
    }
}
