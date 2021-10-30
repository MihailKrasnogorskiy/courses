package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private int physAtt;

    public Paladin() {
        super.physDef = 50;
        super.magicDef = 20;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (25 <= (100 - health)) {
            health += 25;
        } else health = 100;
    }

    public void healTeammate(Hero hero) {
        if (10 <= (100 - hero.health)) {
            hero.health += 10;
        } else hero.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = physAtt - physAtt * hero.physDef / 100;
        if (damage <= hero.health) {
            hero.health -= damage;
        } else hero.health = 0;
    }

    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}
