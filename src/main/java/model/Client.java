package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private String address;

    @OneToMany (
            mappedBy = "client",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private final List<Hardware> equipment = new ArrayList<>();

    public Client() { }

    public Client(int id, String name, String cnpj, String address) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.address = address;
    }

    public Client(String name, String cnpj, String address) {
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

    public void setId(int id) {
        this.id = id;
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
