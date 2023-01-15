public class  Ranger extends Hero{

    public Ranger(String name){
        super(new Ranged());


        setHeroName(name);
    }


    @Override
    public void display() {
        System.out.println("Hero Name : "+getHeroName() + "\n Hero Class : "+ this.getClass().getName() +
                "\n Attack Type : "+ getHeroAttackType().getClass() + " \n Current HP : "+getHP()+"\n ");
    }
}
