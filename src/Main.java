

/*
    tipedata nama_variabel = nilai;

    Int bilangan = 10;
    String kata = "Hello"

    operator aritmatika
    +,-,/,*,%
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int bilangan = 10;
        Integer bilanganDua = 100;
        bilanganDua = 102;
        System.out.println("ini bilangan dua : " + bilanganDua.doubleValue());

        Scanner input = new Scanner(System.in);
        System.out.println("Input bilangan pertama : ");
        Integer inputBilanganSatu = input.nextInt();
        System.out.println("Input bilangan kedua : ");
        Integer inputBilanganDua = input.nextInt();
        int jumlah = inputBilanganSatu + inputBilanganDua;
        System.out.println("Hasil Jumlah : " +  jumlah);
        int kurang = inputBilanganSatu - inputBilanganDua;
        double bagi = inputBilanganSatu.doubleValue() / inputBilanganDua.doubleValue();
        System.out.println(bagi);
    }
}
