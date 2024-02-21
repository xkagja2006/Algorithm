package 슬라이딩윈도우;

import java.io.*;
import java.util.*;

public class BOJ_S3_21921_블로그 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        int sum = 0;
        int cur = 0;
        int max = 0;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            cur = Integer.parseInt(st.nextToken());
            arr[i] = cur;
            sum += cur;
            if(i > X){
                sum -= arr[i - X];
            }
            if(max == sum){
                max = sum;
                cnt++;
            }else if(max < sum){
                max = sum;
                cnt = 1;
            }
        }
        if(max == 0)
            System.out.println("SAD");
        else{
            System.out.println(max + "\n" + cnt);
        }
    }
}