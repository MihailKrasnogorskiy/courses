package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt;

    public Warrior() {
        super.magicDef = 0;
        super.physDef = 80;
        super.physAtt = 30;
    }

    public String toString() {
        return "Warrior{health=" + health + "}";
    }
}
