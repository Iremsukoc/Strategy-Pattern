public class Warrior extends Hero {



    public Warrior(String name){
        super(new Melee());
        setHeroName(name);
    }
    @Override
    public void display() {
        System.out.println("Hero Name : "+getHeroName() + "\n Hero Class : "+ this.getClass().getName() +
                "\n Attack Type : "+ getHeroAttackType().getClass() + " \n Current HP : "+getHP()+"\n ");
    }
}
