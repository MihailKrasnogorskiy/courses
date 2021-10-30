package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {
    private int physAtt;
    private int magicAtt;

    public Shaman() {
        super.physDef = 20;
        super.magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if (50 <= (100 - health)) {
            health += 50;
        } else health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (30 <= (100 - hero.health)) {
            hero.health += 30;
        } else hero.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage = physAtt - physAtt * hero.physDef / 100;
        if (damage <= hero.health) {
            hero.health -= damage;
        } else hero.health = 0;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (magicAtt - magicAtt * hero.magicDef / 100);
        if (damage <= hero.health) {
            hero.health -= damage;
        } else hero.health = 0;
    }

    public String toString() {
        return "Shaman{health=" + health + "}";

    }
}
