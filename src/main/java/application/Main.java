package application;

import model.Client;
import model.Hardware;
import service.ClientDAO;
import service.HardwareDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientDAO clientDAO = new ClientDAO();
        HardwareDAO hardwareDAO = new HardwareDAO();

        List<Client> clients = clientDAO.getClients();

        Client client = new Client("Signify Corporation", "123.456.789/0001-12", "Rua Zoroastro Henrique Amorim");
        clientDAO.createClient(client);
        clients.add(client);

        Client client2 = new Client("Pedreira Santo Antonio", "987.654.321/0001-98", "Zona Rural Vargem");
        clientDAO.createClient(client2);
        clients.add(client2);

        Client client3 = new Client("Centro de terapia ocular especializado - CETOE", "100.001.123/0002-05", "Vila Pinto, Centro");
        clientDAO.createClient(client3);
        clients.add(client3);

        Hardware hardware = new Hardware(client, "Sala TI", "Sr Afonso Rangel", "SIG01", "NOTEBOOK", "Lenovo", "ThinkPad T490", "Windows 10 Pro 20h2", true, true, true, "intel i5", "11", "3.5ghz", "8GB", "HD 1TB", "MODERNO", "2025");
        hardwareDAO.createHardware(hardware);
        client.addEquipment(hardware);

        Hardware hardware2 = new Hardware(client2, "VGA - Balanca", "Caroline Pires", "PDR10", "DESKTOP", "DELL", "Vostro 3550", "Windows 10 Pro 20h2", true, false, true, "intel i3", "8", "2.5ghz", "4GB", "SSD 240GB", "MEIO_TERMO", "2023");
        hardwareDAO.createHardware(hardware2);
        client2.addEquipment(hardware2);

        Hardware hardware3 = new Hardware(client2, "VGA - Almoxarifado", "Joselito Nunes", "PDR05", "DESKTOP", "DELL", "Inspiron 2587", "Windows 7 Pro ServicePack1", false, false, true, "intel i3", "5", "2.3ghz", "4GB", "HD 500GB", "OBSOLETO", "2021");
        hardwareDAO.createHardware(hardware3);
        client2.addEquipment(hardware3);

        Hardware hardware4 = new Hardware(client3, "Diretoria", "Anna Maria Santiago", "CTE10", "DESKTOP", "Montada", "Montada Pichal", "Windows 7 Pro ServicePack2", false, false, false, "intel i5", "10", "2.5ghz", "10GB", "SSD 480GB", "MEIO_TERMO", "2024");
        hardwareDAO.createHardware(hardware4);
        client3.addEquipment(hardware4);

    }
}
