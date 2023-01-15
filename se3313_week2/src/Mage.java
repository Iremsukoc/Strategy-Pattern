public class  Mage extends Hero{

    public Mage(String name) {
        super(new Magic());

        setHeroName(name);
    }

    @Override
    public void display() {
        System.out.println("Hero Name : "+getHeroName() + "\n Hero Class : "+ this.getClass().getName() +
                "\n Attack Type : "+ getHeroAttackType().getClass() + " \n Current HP : "+getHP()+"\n ");
    }
}
