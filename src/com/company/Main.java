package com.company;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n){
        int suma = 0,pom ;
        while(n>0){
            pom = n%10;
            suma += pom;
            pom = 0;
            n /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesi n");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i = 1; i <= n; i++){
            int sum = sumaCifara(i);
            if(i % sum == 0)System.out.println(i);
        }
    }
}
