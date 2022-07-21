package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String x = in.nextLine();
        String str = in.nextLine();
        System.out.println(solution(str));
    }

    static String solution(String str) {
        String answer = "";
        String[] strA = str.split(" ");
        int[] arr = new int[strA.length];
        for(int i =0; i < strA.length; i++){
            arr[i] = Integer.parseInt(strA[i]);
        }
        int[] newA = Arrays.copyOf(arr,arr.length);
        Arrays.sort(newA);

        for(int i = 0; i < newA.length; i++){
            for(int j = 0; j < newA.length; j++){
                if(arr[i] == newA[newA.length-1-j]){
                    answer += (j+1)+" ";
                    break;
                }
            }
        }
        return answer.trim();
    }
}