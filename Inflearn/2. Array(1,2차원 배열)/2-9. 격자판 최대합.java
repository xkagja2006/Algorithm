package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
//        String x = in.nextLine();
        int[][] arr = new int[T][T];
        for(int i =0; i < T; i++){
            for(int j = 0; j < T; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(arr));
    }
    //N*2 + 2 가지의 경우의 수가 나온다.
    static int solution(int[][] arr) {
        int answer = 0;
        int total = 0;
//        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){    //행 합
            total = 0;
            for(int j = 0; j < arr.length; j++){
                total += arr[i][j];
            }
            if(total > answer) answer = total;
        }
        for(int i = 0; i < arr.length; i++){    //열 합
            total = 0;
            for(int j = 0; j < arr.length; j++){
                total += arr[j][i];
            }
            if(total > answer) answer = total;
        }

        //대각선 합
        total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i][i];
        }
        if(total > answer) answer = total;
        total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[arr.length-1-i][arr.length-1-i];
        }
        if(total > answer) answer = total;
        return answer;
    }
}