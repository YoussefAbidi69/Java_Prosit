package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat;

    Aquatic(){}

    public Aquatic (String famille, String name, int age, boolean isMammal, String habitat){
        super(famille, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString(){
        return  super.toString() + " habitat "+this.habitat ;
    }

    public void swim(){
        System.out.println("Aquatic swimming");
    }

}
