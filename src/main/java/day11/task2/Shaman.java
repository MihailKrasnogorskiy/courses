package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {
    private int magicAtt;
    private static final int HEAL_HIMSELF = 50;
    private static final int HEAL_TEAMMATE = 30;

    public Shaman() {
        super.physDef = 20;
        super.magicDef = 20;
        super.physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if (HEAL_HIMSELF <= (MAX_HEALTH - health)) {
            health += HEAL_HIMSELF;
        } else health = MAX_HEALTH;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (HEAL_TEAMMATE <= (MAX_HEALTH - hero.health)) {
            hero.health += HEAL_TEAMMATE;
        } else hero.health = MAX_HEALTH;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (magicAtt - magicAtt * hero.magicDef / PERCENT);
        if (damage <= hero.health) {
            hero.health -= damage;
        } else hero.health = 0;
    }

    public String toString() {
        return "Shaman{health=" + health + "}";

    }
}
