package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //v hlavni funkci bude cteni a ukladani do souboru/souborů (aby se informace nacetly i pri opakovanem spusteni)
        //dale zde (asi) bude funkce hledání lidí v databázi (má to být implementováno pomocí mapy?)
        // - podle ID (každá osoba má ID), jména a fakulty (=vypíše to všchny osoby na fakultě a co jsou - učitel, bakalar apod.)
        //
        //funkce na přidávání a odebírání osob


        int s;
        Scanner nacitani = new Scanner(System.in);
        s = nacitani.next().charAt(0);
        System.out.println("Zadejte cislo podle toho, co chcete delat:");
        System.out.println("1) Hledat osobu v databazi");
        System.out.println("2) Pridat osobu do databaze");
        System.out.println("3) Odebrat osobu z databaze");
        if (s == 1 ) {
            //funkce hledej osobu...
        }



    }
}
