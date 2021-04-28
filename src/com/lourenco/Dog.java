package com.lourenco;

public class Dog {
    public String name;
    public int age;
    public String breed;
    public String color;
    public double speed;

    public String getName(){
    return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
