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

        Dog julieta = new Dog();
        julieta.setName("Julieta");
        julieta.setAge(5);
        julieta.setBreed("Basset Hound");
        julieta.setColor("white, dark and brown");
        julieta.setSpeed(43);

        System.out.println("The Dog's name is " + lucho.getName() + "\n" + lucho.getAge() + " years old\n" + "he/she are a " + lucho.getBreed() + "\n" + "he/she are " + lucho.getColor() + "\n" + "and run " + lucho.getSpeed() + " km p/h!\n");
        System.out.println("The Dog's name is " + julieta.getName() + "\n" + julieta.getAge() + " years old\n" + "he/she are a " + julieta.getBreed() + "\n" + "he/she are " + julieta.getColor() + "\n" + "and run " + julieta.getSpeed() + " km p/h!\n");

        Cat mimosa = new Cat();
        mimosa.setName("Mimosa");
        mimosa.setAge(8);
        mimosa.setColor("white");
        mimosa.setSmells(false); //porque é que n tive q criar um toSting para ficar direito??

        Cat pikita = new Cat();
        pikita.setName("Pikita");
        pikita.setAge(2);
        pikita.setColor("dark");
        pikita.setSmells(true);

        System.out.println("The Cat's name is " + mimosa.getName() + "\n" + mimosa.getAge() + " years old\n" + "he/she are " + mimosa.getColor() + "\n" + "smells good? " + mimosa.getSmells() + " !\n");
        System.out.println("The Cat's name is " + pikita.getName() + "\n" + pikita.getAge() + " years old\n" + "he/she are " + pikita.getColor() + "\n" + "smells good? " + pikita.getSmells() + " !\n");

    }
}
