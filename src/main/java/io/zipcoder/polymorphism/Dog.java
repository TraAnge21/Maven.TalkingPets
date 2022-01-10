package io.zipcoder.polymorphism;

public class Dog extends Pet{

    String speak = "woo! waou!";

    public Dog(String name){
        super(name);
    }

    public String speak(){
        return speak;
    }

    public void setSpeak(String speak){
        this.speak = speak;
    }
}
