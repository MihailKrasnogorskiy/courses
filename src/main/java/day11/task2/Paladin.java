package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private static final int HEAL_HIMSELF = 25;
    private static final int HEAL_TEAMMATE = 10;

    public Paladin() {
        super.physDef = 50;
        super.magicDef = 20;
        super.physAtt = 15;
    }

    public void healHimself() {
        if (HEAL_HIMSELF <= (MAX_HEALTH - health)) {
            health += HEAL_HIMSELF;
        } else health = MAX_HEALTH;
    }

    public void healTeammate(Hero hero) {
        if (HEAL_TEAMMATE <= (MAX_HEALTH - hero.health)) {
            hero.health += HEAL_TEAMMATE;
        } else hero.health = MAX_HEALTH;
    }

    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}
