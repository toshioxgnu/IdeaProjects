package com.company;


public class ListaSimple {
    private Nodo head;

    public ListaSimple(Nodo head) {
        this.head = head;
    }

     //Insertar un elemento
    public static ListaSimple Insert (ListaSimple lista, int data){
        Nodo new_node = new Nodo(data);
        new_node.sig = null;

        if(lista.head == null){
            lista.head = new_node;
        }else{
            Nodo last = lista.head;
            while(last.sig != null){
                last = last.sig;
            }
            last.sig = new_node;
        }

        return lista;

    }

    public static void Imprimir(ListaSimple lista){
        Nodo currNodo = lista.head;

        System.out.println("Lista :");
        while(currNodo != null){
            System.out.println(currNodo.data +
                    " ");

            currNodo = currNodo.sig;
        }
    }
}
