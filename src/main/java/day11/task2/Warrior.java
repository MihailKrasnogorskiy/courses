package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt;

    public Warrior() {
        super.magicDef = 0;
        super.physDef = 80;
        physAtt = 30;
    }

    public void physicalAttack(Hero hero) {
        int damage = physAtt - physAtt * hero.physDef / 100;
        if (damage <= hero.health) {
            hero.health -= damage;
        } else hero.health = 0;
    }

    public String toString() {
        return "Warrior{health=" + health + "}";
    }
}
