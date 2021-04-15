package de.demo.controller;

public class ListElement {



    public String name;
    public int value;

    public ListElement(String name, int value) {
        this.name = name;
        this.value = value;
    }


    // Getter and Setter

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
