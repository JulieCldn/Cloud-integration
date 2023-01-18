package test;

public class Client {

    private String name;
    private boolean commandeTaken;
    private String commande;
    private int fidelityNum;
    private int orderNum;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getCommandeTaken() {
        return commandeTaken;
    }
    public void setCommandeTaken(boolean bool) {
        this.commandeTaken = bool;
    }
    public String getCommande() {
        return commande;
    }
    public void setCommande(String commande) {
        this.commande = commande;
    }
    public int getFidelityNum() {
        return fidelityNum;
    }
    public void setFidelityNum(int amount) {
        this.fidelityNum = amount;
    }
    public int getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(int amount) {
        this.orderNum = amount;
    }
    @Override
    public String toString() {
        return "Myclient [name=" + name + ", commandeTaken=" + commandeTaken + ", commande=" + commande  + ", fidelityNum=" + fidelityNum  + ", orderNum=" + orderNum + "]";
    }
}
