package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Socio socio1 = new Socio();
        Socio socio2 = new Socio();
        Socio socio3 = new Socio();

        Club club = new Club(socio1,socio2,socio3);

        System.out.println(club.Antiguedad());


    }
}
