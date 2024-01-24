package DP;

import java.util.*;
import java.io.*;

public class BOJ_S1_24464 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(br.readLine());
        long[][] arr2 = new long[200001][6];
        Arrays.fill(arr2[0], 1);
        Arrays.fill(arr2[1], 0);

        int idx = 1;
        while(true){
            if(day == 1) {
                System.out.println(5);
                break;
            }
            arr2[idx][0] = arr2[idx-1][0] + 1;

            arr2[idx][1] = (arr2[idx-1][5] + arr2[idx-1][3] + arr2[idx-1][4]) % 1000000007;
            arr2[idx][2] = (arr2[idx-1][5] + arr2[idx-1][4]) % 1000000007;
            arr2[idx][3] = (arr2[idx-1][5] + arr2[idx-1][1]) % 1000000007;
            arr2[idx][4] = (arr2[idx-1][5] + arr2[idx-1][1] + arr2[idx-1][2]) % 1000000007;
            arr2[idx][5] = (arr2[idx-1][1] + arr2[idx-1][2] + arr2[idx-1][3] + arr2[idx-1][4]) % 1000000007;

            if(arr2[idx][0] == day){
                long answer = arr2[idx][1] + arr2[idx][2] + arr2[idx][3] + arr2[idx][4] + arr2[idx][5];
                System.out.println(answer % 1000000007);
                break;
            }
            idx++;
        }
    }
}