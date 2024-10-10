package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;



public class Zoo {
    private Animal[] animals ;
    private String name;
    private String city;
    private int  NB_Cages=25;
    private int compteur=0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Zoo name not valid ");
        }
        this.name = name;
    }

    public int getNB_Cages() {
        return NB_Cages;
    }

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.NB_Cages = nbrCages;
    }

    public void displayZoo(){
        System.out.println("name:" + this.name + " "+"\ncity:" + this.city + " " +"\nnb_cage:"+ this.NB_Cages);
    }

    @Override
    public String toString(){
        return  this.name + " " + this.city + " " + this.NB_Cages;
    }

    public boolean addAnimal(Animal animal) {

        //System.out.println(this.nbrCages);
        if( isZooFull()==false  && searchAnimal(animal)==-1){
            this.animals[this.compteur] = animal;
            this.compteur++;
            return true;

        }
        return false;
    }

    public void afficherAnimaux() {
        for (int i =0;i < this.compteur ; i++){
            System.out.println(this.animals[i].getName());
        }
    }

    int searchAnimal(Animal animal){
        for (int i =0;i < this.compteur ; i++){
            if(this.animals[i].getName() == animal.getName()){
                return i;
            }

        }
        return -1;
    }
    boolean removeAnimal(Animal animal){
        for (int i =0;i < this.compteur ; i++){
            if(this.animals[i].getName() == animal.getName()){
                this.animals[i] = this.animals[this.compteur-1];
                return true;
            }
        }

        this.compteur--;
        return false;
    }

    boolean isZooFull(){
        if(this.compteur==this.NB_Cages){
            return true;
        }
        return false;
    }



    Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.compteur>z2.compteur){
            return z1;
        }
        return z2;
    }

}
