package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;



    public String getFamily() {
        return this.family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        if(age<0){
            System.out.println("Invalid Age");
        }
        this.age = age;
    }
    boolean getIsMammel(){
        return this.isMammal;
    }
    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
    Animal(){}

    Animal(String family, String name, int age, boolean isMammal) {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    @Override
    public String toString(){
        return  this.family + " " + this.name + " " + this.age + " " + this.isMammal;
    }


}



