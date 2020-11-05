package cs451;

public class Message {

    private int senderID; //id of the host that sent the message
    private String m; //payload of the message

    private int ID; //id of the message

    public Message(sendID sid, String payload, int ID) {
        this.senderID = sid;
        this.m = payload;
        this.ID = ID;
    }

    public int getSenderID() {return senderID;}

    public String getPayload() {return m;}

    public int getID() {return ID;}

}