package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1=new Person("Retin", "Michail","Sergeevich",1619760580);
        Person person2=new Person("Saveliy",954563380);
        person1.printFullName();
        person2.printFullName();
        System.out.println(person1.toString('s'));
        System.out.println(person2.toString('l'));
        System.out.println(person2.toString('n'));
    }
}
