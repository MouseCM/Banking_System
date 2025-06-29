package Banking_System;

public class Transaction {
    private String senderID;
    private String recieverID;
    private double amount;


    public Transaction() {
        this.senderID = "";
        this.recieverID = "";
        this.amount = 0;
    }

    public Transaction(String senderID, String recieverID, double amount) {
        this.senderID = senderID;
        this.recieverID = recieverID;
        this.amount = amount;
    }

    public String getSenderID() { return this.senderID; }
    public String getRecieverID() { return this.recieverID; }
    public double getAmount() { return this.amount; }

}