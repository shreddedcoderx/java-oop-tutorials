package com.javaseries.javaooptutorials.abstractclass;

import org.junit.Assert;
import org.junit.Test;

public class Abstractclass {
    abstract class Animal {
        private String name;
        abstract String bark();

        public String getName() {
            return name;
        }

        public Animal(String name) {
            this.name = name;
        }
    }

    class Dog extends Animal{
        public Dog(String name) {
            super(name);
        }

        @Override
        String bark() {
            return "HAW HAW";
        }
    }

    @Test
    public void testCreation() {
        Dog dog = new Dog("Jack");
        Assert.assertEquals("HAW HAW", dog.bark());
        Assert.assertEquals("Jack", dog.getName());
    }
    @Test
    public void testCreation2() {
        Animal animal = new Dog("Jack");
        Assert.assertEquals("HAW HAW", animal.bark());
        Assert.assertEquals("Jack", animal.getName());
    }


}
