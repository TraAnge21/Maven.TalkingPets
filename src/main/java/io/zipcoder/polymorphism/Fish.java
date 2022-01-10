package io.zipcoder.polymorphism;

public class Fish extends Pet{
    String speak = "pffsi!";

    public Fish(String name){
        super(name);
    }

    public String speak(){
        return speak;
    }

    public void setSpeak(String speak){
        this.speak = speak;
    }
}
