package com.animal;

public class Cat extends Animal{
    @Override
    void animalSound() {
        System.out.println("the cat say: meuuu meuuuu");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}
