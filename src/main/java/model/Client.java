package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String name;
    private String cnpj;
    private String address;
    private List<Hardware> equipment = new ArrayList<>();

    public Client(int id, String name, String cnpj, String address) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.address = address;
    }

    public void addEquipment(Hardware hardware) {
        equipment.add(hardware);
    }

    public void removeEquipment(Hardware hardware) {
        equipment.remove(hardware);
    }

    public void showEquipment() {
        for (Hardware hardware : equipment) {
            System.out.println(hardware);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
