import java.util.Random;

public class Melee implements IHeroAttackType{

    @Override
    public int attack(Hero target) {

        Random rnd = new Random();

        int melee_hp = target.getHP();
        melee_hp = melee_hp - 30;
        target.setHP(melee_hp);

        return melee_hp;
    }
}
