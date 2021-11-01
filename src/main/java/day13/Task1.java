package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Vova");
        User user2 = new User("Petya");
        User user3 = new User("Masha");
        user1.subscribe(user2);
        System.out.println("Вова подписан на Петю ? " + user1.isSubscribed(user2));
        System.out.println("Вова дружит с Петей ? " + user1.isFriend(user2));
        user2.subscribe(user1);
        System.out.println("Вова дружит с Петей ? " + user1.isFriend(user2));
        Message message1 = new Message(user1, user2, "Привет");
        System.out.println(message1);
        user1.sendMessage(user2, "Здорова!");
        user1.sendMessage(user2, "Чё молчим?");
        user2.sendMessage(user1, "Привет, привет.");
        user2.sendMessage(user1, "Здоровее видали");
        user2.sendMessage(user1, "Молчим молчание");
        user3.sendMessage(user1, "Привет, Вольдемар");
        user3.sendMessage(user1, "Чё нового?");
        user3.sendMessage(user1, "Какие планы?");
        user1.sendMessage(user3, "Привет, Маш");
        user1.sendMessage(user3, "Всё норм");
        user1.sendMessage(user3, "Никаких");
        user3.sendMessage(user1, "Фу таким быть");
        MessageDatabase.showDialog(user1, user3);
    }
}
