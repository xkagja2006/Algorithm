package Greedy;

import java.io.*;
import java.util.*;

public class BOJ_S3_19941_햄버거분배 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] arr = br.readLine().toCharArray();
        boolean[] eaten = new boolean[N];
        int ans = 0;

        for(int i = 0; i < N; i++){
            // 먹히지 않은 햄버라면 먹을 사람이 있는지 찾기
            if(arr[i] == 'H' && eaten[i] == false){
                // 범위만큼 앞에서부터 탐색하기
                for(int j = -K; j <= K; j++){
                    if(i + j >= 0 && i + j < N && arr[i + j] == 'P' && eaten[i + j] == false){
                        ans++;
                        eaten[i + j] = true;
                        eaten[i] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
