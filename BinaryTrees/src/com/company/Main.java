package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root= new Node(1);

        System.out.println("Data " + tree.root.data);
        System.out.println("Izquierda " + tree.root.izq);

    }
}
