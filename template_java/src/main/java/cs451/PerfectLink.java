package cs451;

import java.util.ArrayList;

public class PerfectLink {
    Host h; //the process wich send and receive messages through the link

    public PerfectLink(Host process) {
        this.h = process;
    }

    public void sendMessages(ArrayList<Message> messages) {
        for(message m : messages) {
            
        }
    }

    public void receiveMessage(Message message) {

    }
}
