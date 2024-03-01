package DP;

import java.io.*;
import java.util.*;

public class BOJ_S3_진우의달여행 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][][] dp = new int[N + 1][M + 2][4];

        //dp배열 초기화
        for(int[][] arr : dp){
            for(int[] ar : arr){
                Arrays.fill(ar, 1000);
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= M; i++){
            int tmp = Integer.parseInt(st.nextToken());
            dp[1][i][1] = tmp;
            dp[1][i][2] = tmp;
            dp[1][i][3] = tmp;
        }

        for(int i = 2; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= M; j++){
                int add = Integer.parseInt(st.nextToken());

                dp[i][j][1] = Math.min(dp[i - 1][j - 1][2], dp[i - 1][j - 1][3]) + add;
                dp[i][j][2] = Math.min(dp[i - 1][j][1], dp[i - 1][j][3]) + add;
                dp[i][j][3] = Math.min(dp[i - 1][j + 1][1], dp[i - 1][j + 1][2]) + add;
            }
        }

        int ans = 1000;
        for(int[] arr : dp[N])
            for(int a : arr){
                ans = Math.min(a, ans);
            }

        System.out.println(ans);
    }
}