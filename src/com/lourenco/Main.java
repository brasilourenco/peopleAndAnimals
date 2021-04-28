package com.lourenco;

public class Main {
    public static void main(String[] args) {
        Person lourenco = new Person();
        lourenco.setName("Lourenço");
        lourenco.setAge(19);
        lourenco.setWeight(77);
        lourenco.setHeight(1.76);

        Person alfredo = new Person();
        alfredo.setName("Alfredo");
        alfredo.setAge(32);
        alfredo.setWeight(90);
        alfredo.setHeight(1.8);

        System.out.println("My name is " + lourenco.getName() + "\n" + lourenco.getAge() + " years old\n" + lourenco.getWeight() + " kg\n" + lourenco.getHeight() + " cm\n");
        System.out.println("My name is " + alfredo.getName() + "\n" + alfredo.getAge() + " years old\n" + alfredo.getWeight() + " kg\n" + alfredo.getHeight() + " cm\n");

        Dog lucho = new Dog();
        lucho.setName("Lucho");
        lucho.setAge(9);
        lucho.setBreed("PitBull");
        lucho.setColor("white");
        lucho.setSpeed(55);

        System.out.println(lucho);
    }
}
