package com.company;

public class Main {

    public static void main(String[] args) {

        String nome = "caio";
        int horas = 8;
        int dias = 30;
        double salariojuniorporhora = 25;
        double salarioPlenoporhora = 45;
        double salarioSeniorporhora = 60;

        double resultadoJr = horas * salariojuniorporhora * dias;
        double resultadoPl = horas * salarioPlenoporhora * dias;
        double resultadoSn = horas * salarioSeniorporhora * dias;


        System.out.println(resultadoJr);
        System.out.println(resultadoPl);
        System.out.println(resultadoSn);



    }
}
