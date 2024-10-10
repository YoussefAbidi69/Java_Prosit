package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Zoo;


public class ZooManagement {
    public static void main(String[] args) {
        /*
        int nbrCages;
        String zooName;

        //System.out.println("nbcage=" + nbrCages + " zooName=" + zooName );

        Scanner input = new Scanner(System.in);
        System.out.println("donner nb cages:");
        nbrCages = input.nextInt();
        System.out.println("donner zoo nam:");
        zooName = input.next();
        System.out.println("nbcage=" + nbrCages + " zooName=" + zooName );*/

        Animal animal = new Animal("family", "Lion", 10, true);
        Animal animal1 = new Animal("family", "Lion1", 10, true);
        Animal animal2 = new Animal("family", "Lion2", 10, true);
        Animal animal3 = new Animal("family", "Lion3", 10, true);

        System.out.println("family:" + animal.getFamily() + "\nname:" + animal.getName() + "\nAge:" + animal.getAge() + "\nisMammal:" + animal.getIsMammel());

        System.out.println("*****************************\n Zoo :\n");

        Zoo zoo = new Zoo("Zoo","tunis",2);
        zoo.displayZoo();
        System.out.println("*****************************\n Zoo :\n");


        System.out.println(zoo);
        System.out.println(zoo.toString());


        System.out.println("*****************************\n");
        System.out.println("nombre de cages est :" + zoo.getNB_Cages() +"\n");
        System.out.println("animal 1:"+zoo.addAnimal(animal));
        System.out.println("\nanimal 2:" +zoo.addAnimal(animal1));
        System.out.println("\nanimal 3:" +zoo.addAnimal(animal2));
        //System.out.println("\nanimal 3:" +zoo.addAnimal(animal2));
        System.out.println("\nanimal 4:" +zoo.addAnimal(animal3));

        System.out.println("**********|Affichage animaux|*******************\n");
        zoo.afficherAnimaux();
        System.out.println("**********|Chercher animaux|*******************\n");
        System.out.println(zoo.searchAnimal(animal2));
        System.out.println("**********|Remove animaux|*******************\n");
        System.out.println(zoo.removeAnimal(animal));
        System.out.println("**********|IsZooFull|*******************\n");
        System.out.println(zoo.isZooFull());
        System.out.println("**********|Compare Zoo|*******************\n");
        System.out.println(zoo.comparerZoo(zoo,zoo));


        Aquatic aquatic = new Aquatic("famille","name",15,true,"habitat");
        System.out.println("**********|Aquatic|*******************\n");
        System.out.println(aquatic.toString());

        Terrestrial terrestrial=new Terrestrial( "famille","name",18,true,4);
        System.out.println("**********|Terrestrial|*******************\n");
        System.out.println(terrestrial.toString());

        Dolphin dolphin=new Dolphin("AAA","name",17,false,"HABITAT",123);
        System.out.println("**********|dolphin|*******************\n");
        System.out.println(dolphin.toString());

        Penguin penguin=new Penguin("AAA","name",17,false,"HABITAT",12);
        System.out.println("**********|penguin|*******************\n");
        System.out.println(penguin.toString());









    }



}
