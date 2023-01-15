import java.util.Random;

public class Ranged implements IHeroAttackType{


    @Override
    public int attack(Hero target) {
        int ranged_hp = target.getHP();
        Random rnd = new Random();

        if (0.5 < rnd.nextDouble())
        {
            ranged_hp = ranged_hp-20;
            target.setHP(ranged_hp);
        }else
        {
            ranged_hp = ranged_hp-40;
            target.setHP(ranged_hp);
        }
        return ranged_hp;
    }


}
