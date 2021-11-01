package day11.task2;

public abstract class Hero {
    int health = 100;
    int physDef;
    int magicDef;
    int physAtt;
    public static final int MAX_HEALTH = 100;
    public static final int PERCENT = 100;

    public void physicalAttack(Hero hero) {
        int damage = physAtt - physAtt * hero.physDef / PERCENT;
        if (damage <= hero.health) {
            hero.health -= damage;
        } else hero.health = 0;
    }
}
