import java.util.*;
import java.io.*;

public class BOJ_S3_19637_IF문좀대신써줘 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] rank = new int[N];
        String[] name = new String[N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
            rank[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < S; i++){
            st = new StringTokenizer(br.readLine());
            int cur = Integer.parseInt(st.nextToken());
            
            int start = 0;
            int end = N-1;
            while(start <= end){
                int mid = (start + end) / 2;
                if(rank[mid] < cur){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            sb.append(name[start] + "\n");
        }
        System.out.println(sb.toString());
    }
}