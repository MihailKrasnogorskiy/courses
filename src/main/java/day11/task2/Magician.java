package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private int physAtt;
    private int magicAtt;

    public Magician() {
        super.physDef = 0;
        super.magicDef = 80;
        super.physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (magicAtt - magicAtt * hero.magicDef / PERCENT);
        if (damage <= hero.health) {
            hero.health -= damage;
        } else hero.health = 0;
    }

    public String toString() {
        return "Magician{health=" + health + "}";
    }
}
