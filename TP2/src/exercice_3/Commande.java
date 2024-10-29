package exercice_3;

public class Commande {
    private String reference;
    private Client client;
    private String date;
    private String etat;

    public Commande() {
    }

    public Commande(String reference, Client client, String date, String etat) {
        this.reference = reference;
        this.client = client;
        this.date = date;
        this.etat = etat;
    }

    public String getReference() {
        return reference;
    }

    public Client getClient() {
        return client;
    }

    public String getDate() {
        return date;
    }

    public String getEtat() {
        return etat;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Référence: " + reference + "\n" +
                "Date: " + date + "\n" +
                "État: " + etat + "\n" +
                "Client: " + client.toString();
    }
}
