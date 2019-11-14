package com.company;

import java.util.Scanner;

public class Socio {
    Scanner sc = new Scanner(System.in);

    String nombre;
    int antiguedad;

    public Socio() {
        System.out.println("Ingrese nombre");
        this.nombre = sc.next();
        System.out.println("Ingrese antiguedad");
        this.antiguedad = sc.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


}
