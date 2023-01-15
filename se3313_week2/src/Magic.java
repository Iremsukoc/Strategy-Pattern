import java.util.Random;

public class Magic implements IHeroAttackType{
    @Override
    public int attack(Hero target) {

            int magic_hp = target.getHP();
            Random rnd = new Random();

            if (0.8 < rnd.nextDouble())
            {
                magic_hp = magic_hp;
                target.setHP(magic_hp);
            }else
            {
                magic_hp = magic_hp-40;
                target.setHP(magic_hp);
            }
            return magic_hp;
        }

}
