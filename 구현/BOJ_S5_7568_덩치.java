import java.io.*;
import java.util.*;

public class BOJ_S5_7568_덩치 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] rank = new int[N];
        Arrays.fill(rank, 1);
        int idx = 0;
        while(idx < N){
            for(int i = 0; i < N; i++){
                if(idx == i) continue;
                if(arr[i][0] > arr[idx][0] && arr[i][1] > arr[idx][1]){
                    rank[idx]++;
                }
            }
            idx++;
        }

        for(int x : rank){
            System.out.print(x + " ");
        }
    }
}
        