package pl.camp.it.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws MojWyjatek {
        /*try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            reader.readLine();
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać z klawiatury !!!");
        }*/

        /*try {
            //sdfgsd
            a();
            //dsafg
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            *//*System.out.println(wyjatek.getMessage());
            System.out.println(wyjatek.getCause());*//*
        } catch (NullPointerException e) {
            System.out.println("Null pointer !!");
        }

        System.out.println("Witam");*/

        sprawdzLiczbe(11);
    }

    public static void a() {
        int[] tab = new int[5];

        System.out.println(tab[10]);
    }


    public static void sprawdzLiczbe(int a) throws MojWyjatek {
        if(a > 10) {
            throw new MojWyjatek("Liczba to: " + a);
        }
    }
}
