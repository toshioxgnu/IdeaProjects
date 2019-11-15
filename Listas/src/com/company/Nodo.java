package com.company;

public class Nodo {
    int value;
    Nodo sig;

    public Nodo(int value) {
        this.value = value;
        sig = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
