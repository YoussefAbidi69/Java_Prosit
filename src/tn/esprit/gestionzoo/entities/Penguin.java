package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(String famille, String name, int age, boolean isMammal,String habitat,float swimmingDepth) {
        super(famille, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString(){
        return  super.toString()+" swimmingDepth: "+swimmingDepth;
    }

}
