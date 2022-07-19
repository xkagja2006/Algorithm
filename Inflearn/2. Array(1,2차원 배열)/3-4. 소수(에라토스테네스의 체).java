/*
 * 주어진 수 이하의 자연수 중 소수의 갯수
 */
package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] arr = new int[T];
        int answer = 0;
        for(int i = 0; i < T; i++){
            arr[i] = i+1;
        }
        for(int i = 2; i < Math.sqrt(T); i++) {
            for (int j = i; j <= T / i; j++) {
                arr[i * j-1] = 0;
            }
        }
        for(int i = 0; i < T; i++){
            if(arr[i] != 0)
                answer++;
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(--answer);
    }
}