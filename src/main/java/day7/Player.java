package day7;

public class Player {
    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {

        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {

        if (this.stamina == 1) {
            countPlayers--;
        }
        if (this.stamina == MIN_STAMINA) {
            return;
        }
        this.stamina -= 1;
    }

    public int getStamina() {
        return stamina;
    }

    public static void info() {
        String infoText = "Команды не полные. На поле есть " + (6 - countPlayers);
        if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers == 5) {
            System.out.println(infoText + "свободное место");
        } else if (countPlayers >= 2 && countPlayers <= 4) {
            System.out.println(infoText + "свободных места");
        } else if (countPlayers == 1 || countPlayers == 0) {
            System.out.println(infoText + "свободных мест");
        }
    }
}
