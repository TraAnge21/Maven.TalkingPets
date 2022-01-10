package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class MainApplication {

    ArrayList<Pet> pets = new ArrayList<Pet>();

    public MainApplication(){

    }

    public static void main(String[] args){

        Console console1 = new Console();
        MainApplication mainApp = new MainApplication();

        while(true){
            String haveMorePetsQues = console1.getStringInput(" Do you possess any more pets?");
            if(haveMorePetsQues.equalsIgnoreCase("No")){
                break;
            }
            String whichPetTypeQues = console1.getStringInput("What is the type of your pet:");
            String whichPetNameQues = console1.getStringInput("What is the name of your pet:");
            if(whichPetTypeQues.equalsIgnoreCase("cat")){
                Cat cat1 = new Cat(whichPetNameQues);
                mainApp.addPet(cat1);
            }
            else if(whichPetTypeQues.equalsIgnoreCase("dog")){
                Dog dog1 = new Dog(whichPetNameQues);
                mainApp.addPet(dog1);
            }
            else{
                Fish fish1 = new Fish(whichPetNameQues);
                mainApp.addPet(fish1);
            }
        }

        for(int i=0;i<mainApp.pets.size();i++){
            System.out.println((i+1)+". Pet Type:"+mainApp.pets.get(i).getClass().getSimpleName()+
                    "   Name:"+mainApp.pets.get(i).getName()+"   Sound:"+mainApp.pets.get(i).speak());
        }

    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }


}
