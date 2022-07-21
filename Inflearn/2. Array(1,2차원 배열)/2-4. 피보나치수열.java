/*
 * 입력값 : 수열의 항의 갯수
 */
package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int a = 1, b =1;
        int c = 0;
        System.out.print(a + " " + b +" ");
        for(int i = 0; i < T-2; i++){
            c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}