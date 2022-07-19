/*
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력
 */
package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int T = in.nextInt();
        int[] arr= new int[T+1];
        arr[0] = 0;
        for(int i = 1; i < T+1; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < T; i++){
            if(arr[i+1] > arr[i])
                System.out.print(arr[i+1]+" ");
        }
    }
}