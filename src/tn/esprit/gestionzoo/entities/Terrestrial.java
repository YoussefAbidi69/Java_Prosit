package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    int nbrLegs;

    public Terrestrial(String famille, String name, int age, boolean isMammal,int nbrLegs){
        super(famille, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

}
