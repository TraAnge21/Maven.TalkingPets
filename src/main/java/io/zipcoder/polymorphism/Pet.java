package io.zipcoder.polymorphism;

public class Pet {

    String name;
    String speak = "speak now!";

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

}