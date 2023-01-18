package test;

public class TakeCommande {
    public Client myService(Client client){
        String[] commande = {"café", "pain au chocolat", "croissant", "expresso", "laté"};
        int rand = 0 + (int)(Math.random() * 5);
        System.out.println(client);
        Client ma = new Client();
        ma.setName(client.getName());
        ma.setCommandeTaken(true);
        ma.setCommande(commande[rand]);
        ma.setFidelityNum(client.getFidelityNum());
        ma.setOrderNum(client.getOrderNum());
        System.out.println(ma);
        return ma;
    }
}
