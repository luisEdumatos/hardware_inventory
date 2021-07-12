package model;

import enums.DeviceStatusCondition;
import enums.DeviceType;

public class Hardware {
    private int id;
    private int id_client;
    private String deviceLocalization;
    private String deviceOwnerUserName;
    private String deviceTag;
    private DeviceType deviceType;
    private String deviceBrand;
    private String deviceModel;
    private String deviceSO;
    private boolean deviceSOLicensed;
    private boolean deviceOfficeLicensed;
    private boolean deviceAntivirusLicensed;
    private String deviceProcessor;
    private String deviceProcessorGeneration;
    private String deviceProcessorGHZ;
    private String deviceRAM;
    private String deviceHD;
    private DeviceStatusCondition deviceStatusCondition;
    private String deviceSwapPrediction;

    public Hardware() { }

    public Hardware(int id, int id_client, String deviceLocalization, String deviceOwnerUserName, String deviceTag, DeviceType deviceType, String deviceBrand, String deviceModel, String deviceSO, boolean deviceSOLicensed, boolean deviceOfficeLicensed, boolean deviceAntivirusLicensed, String deviceProcessor, String deviceProcessorGeneration, String deviceProcessorGHZ, String deviceRAM, String deviceHD, DeviceStatusCondition deviceStatusCondition, String deviceSwapPrediction) {
        this.id = id;
        this.id_client = id_client;
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

    public Hardware(int id_client, String deviceLocalization, String deviceOwnerUserName, String deviceTag, DeviceType deviceType, String deviceBrand, String deviceModel, String deviceSO, boolean deviceSOLicensed, boolean deviceOfficeLicensed, boolean deviceAntivirusLicensed, String deviceProcessor, String deviceProcessorGeneration, String deviceProcessorGHZ, String deviceRAM, String deviceHD, DeviceStatusCondition deviceStatusCondition, String deviceSwapPrediction) {
        this.id_client = id_client;
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

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

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

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
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

    public DeviceStatusCondition getDeviceStatusCondition() {
        return deviceStatusCondition;
    }

    public void setDeviceStatusCondition(DeviceStatusCondition deviceStatusCondition) {
        this.deviceStatusCondition = deviceStatusCondition;
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
