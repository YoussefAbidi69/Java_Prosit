package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public Dolphin (String famille, String name, int age, boolean isMammal,String habitat ,float swimmingSpeed){
        super(famille,name,age,isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString(){
        return  super.toString()+" swimming speed: "+swimmingSpeed;
    }

    public void swim(){
        System.out.println("the daulphin is swimming "); ;
    }

}
