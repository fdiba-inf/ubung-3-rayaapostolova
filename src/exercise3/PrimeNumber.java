package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
      boolean prime = true;
      int n = input.nextInt();
      int d = 2;
      while(d<n) {
        if(n%d == 0){
          prime = false;
          break;
        }
        d++;
      }
      System.out.println("Prime number: " + prime);
    }
}