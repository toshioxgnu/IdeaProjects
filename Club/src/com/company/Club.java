package com.company;

public class Club {

    private Socio socio1;
    private Socio socio2;
    private Socio socio3;

    public Club(Socio socio1, Socio socio2, Socio socio3) {
        this.socio1 = socio1;
        this.socio2 = socio2;
        this.socio3 = socio3;
    }

    public String Antiguedad(){
        if(socio1.getAntiguedad()>socio2.getAntiguedad() && socio1.getAntiguedad()>socio3.getAntiguedad()){
            return ("Socio mas antiguo" +" " +socio1.getNombre());
        }
        if(socio2.getAntiguedad()>socio1.getAntiguedad() && socio2.getAntiguedad()>socio3.getAntiguedad()){
            return ("Socio mas antiguo" + " "+socio2.getNombre());
        }
        if(socio3.getAntiguedad()>socio2.getAntiguedad() && socio3.getAntiguedad()>socio1.getAntiguedad()){
            return ("Socio mas antiguo" + " "+socio3.getNombre());
        }
        return null;
    }
}
