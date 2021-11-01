package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.date = new Date();
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        return "FROM: " + sender.getUserName() + "\nTO: " + receiver.getUserName() + "\nON: " + date.toString() + "\n'" + text + "'";
    }
}
