package afujita.src;

public class Creature extends Displayable {

    public Creature() {
        System.out.println("Creature Created");
    }

    public void setHp(int _h) {
        System.out.println("Hp set");
    }

    public void setHpMoves(int _hpm) {
        System.out.println("Hp Moves set");
    }

    public void setDeathAction(CreatureAction _da) {
        System.out.println("Death action set");
    }

    public void setHitAction(_ha) {
        System.out.println("Hit Action set");
    }
}