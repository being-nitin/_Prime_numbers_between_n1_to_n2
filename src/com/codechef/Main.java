package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// printing prime numbers between n1 and n2;
    Scanner sc = new Scanner(System.in);
    int n1,n2;
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    for(int i=n1;i<=n2;i++){
        if(i%2==0 || i%3==0 || i%5==0 || i%7==0){
            continue;
        }
        else{
            System.out.println(i);
        }
    }









    }
}
