package org.example;

import org.example.modelos.Apartamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("Apartamentos la VIlla");
        System.out.println("**************************");

        System.out.println("\n Bienvenido");


        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        /*System.out.print("Digitar id: ");
        apartamento.setId(lea.nextLine());*/

        System.out.print("Digitar ciudad: ");
        apartamento.setCiudad(lea.nextLine());

        System.out.print("Altura apto: ");
        apartamento.setAlto(lea.nextLine());

        System.out.print("Anchura apto: ");
        apartamento.setAncho(lea.nextLine());

        System.out.print("Profundidad apto: ");
        apartamento.setLargo(lea.nextLine());

        System.out.print("detalles apto: ");
        apartamento.setDetalles(lea.nextLine());

        System.out.print("Numero de referencia: ");
        apartamento.setNumeroReferencia(lea.nextLine());



    }
}