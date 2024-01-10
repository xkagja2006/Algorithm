package Greedy;

import java.util.*;
import java.io.*;

public class BOJ_S2_11501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            long[] arr = new long[C];
            st = new StringTokenizer(br.readLine());
            for(int c = 0 ;c < C; c++){
                arr[c] = Integer.parseInt(st.nextToken());
            }

            long ans = 0;
            long max = 0;
            for(int i = C-1; i >= 0; i--){
                if(arr[i] >= max){
                    max = arr[i];
                }else{
                    ans += (max - arr[i]);
                }
            }

            System.out.println(ans);
        }
    }
}
