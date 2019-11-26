package com.company;

public class Nodo {
    int data;
    Nodo sig;

    public Nodo(int data, Nodo sig) {
        this.data = data;
        sig = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
