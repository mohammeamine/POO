package tp;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciez plusieurs objets de type Commande et Client.
        Commande c1 = new Commande(101, LocalDate.of(2024, 12, 15), "Fournisseur A");
        Commande c2 = new Commande(102, LocalDate.of(2024, 12, 10), "Fournisseur B");
        Commande c3 = new Commande(103, LocalDate.of(2024, 12, 20), "Fournisseur C");
        Commande c4 = new Commande(101, LocalDate.of(2024, 12, 15), "Fournisseur D"); 
        Client client1 = new Client(1, "Mohammed Amine", "Casablanca", "0600000000", new ArrayList<>());
        Client client2 = new Client(2, "Youssef Ali", "Marrakech", "0700000000", new ArrayList<>());

        // 2. Ajoutez les commandes à des objets Client.
        client1.EnregistrerCommande(c1);
        client1.EnregistrerCommande(c2);
        client2.EnregistrerCommande(c3);
        client2.EnregistrerCommande(c4); 

        // 3. Utilisez une List pour stocker plusieurs clients.
        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        // 4. Triez les commandes d'un client avec Collections.sort().
        Collections.sort(client1.getListCommandes());
        System.out.println("\nCommandes triées pour le client 1 :");
        for (Commande commande : client1.getListCommandes()) {
            System.out.println(commande);
        }

        // 5. Utilisez un Set pour éviter les doublons dans une collection de commandes.
        Set<Commande> uniqueCommandes = new HashSet<>();
        for (Commande commande : client1.getListCommandes()) {
            uniqueCommandes.add(commande);
        }
        System.out.println("\nCommandes uniques pour le client 1 :");
        for (Commande commande : uniqueCommandes) {
            System.out.println(commande);
        }

        // 6. Utilisez une Map pour associer chaque client à son codeClient.
        Map<Integer, Client> clientMap = new HashMap<>();
        for (Client client : clients) {
            clientMap.put(client.getCodeClient(), client);
        }

        System.out.println("\nClients associés à leur codeClient dans la Map :");
        for (Map.Entry<Integer, Client> entry : clientMap.entrySet()) {
            System.out.println("CodeClient: " + entry.getKey() + ", Client: " + entry.getValue().getNomClient());
        }

        // 7. Écrivez les informations de vos clients dans un fichier texte ("clients.txt").
        String fileName = "clients.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Client client : clients) {
                writer.write(client.toString());
                writer.newLine();
            }
            System.out.println("\nInformations des clients écrites dans " + fileName);
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }

        // 8. Lisez ce fichier et affichez son contenu dans la console.
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nContenu du fichier " + fileName + " :");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}
