import java.io.*;
import java.util.*;

public class BOJ_S3_1463_1로만들기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        int idx = 4;
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;

        if(x >= idx){
            while(true){
                val1 = val2 = val3 = Integer.MAX_VALUE;
                val1 = Math.min(dp[idx - 1] + 1, dp[idx]);
                if(idx % 2 == 0){
                    val2 = Math.min(dp[idx/2] + 1, dp[idx]);
                }if(idx % 3 == 0){
                    val3 = Math.min(dp[idx/3] + 1, dp[idx]);
                }
                dp[idx] = Math.min(Math.min(val1, val2), val3);
                if(idx == x){
                    break;
                }
                idx++;
            }
        }
        System.out.println(dp[x]);
    }
}
