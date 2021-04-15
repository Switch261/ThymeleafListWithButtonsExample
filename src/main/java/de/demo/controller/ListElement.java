package de.demo.controller;

public class ListElement {

    public int index;
    public int value;

    public ListElement(int index, int value) {
        this.index = index;
        this.value = value;
    }


    // Getter and Setter

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(!o.getClass().equals(this.getClass())) {
            return false;
        }
        ListElement e = (ListElement) o;
        return this.index == e.getIndex();
    }
}
