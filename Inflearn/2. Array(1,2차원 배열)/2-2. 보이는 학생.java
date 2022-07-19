/*
 * 일렬로 선 학생의 키를 받고 맨 앞에서 보이는 학생 수 구하기
 */
package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int T = in.nextInt();
        int[] arr= new int[T];
        for(int i = 0; i < T; i++){
            arr[i] = in.nextInt();
        }
        int answer = 0;
        int max = 0;
        for(int i = 0; i < T; i++){
            if(max < arr[i]){
                answer++;
                max = arr[i];
            }
        }
        System.out.println(answer);
    }
}