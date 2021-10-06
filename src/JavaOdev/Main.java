package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double boy,kilo,indeks;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz :");
        boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");

        kilo = scanner.nextDouble();

        //Vücut kitle indeksi hesaplama formülü
        indeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz :" + indeks);


    }
}
