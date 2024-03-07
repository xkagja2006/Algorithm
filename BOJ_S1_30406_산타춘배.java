import java.io.*;
import java.util.*;

public class BOJ_S1_30406_산타춘배 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 0, 3 -> 3
        // 1, 2 -> 3
        // 1, 3 -> 2
        // n, n -> 0
        // 2, 3 -> 1
        // 0, n -> n

        // 0 -> 3을 만나는게 제일 좋당
        // 1 -> 2를 만나야한다

        int[] arr = new int[4];
        int a = 0;
        for(int i = 0; i < N; i++){
            a = Integer.parseInt(st.nextToken());
            arr[a]++;
        }
        int ans = 0;
        int cnt = 0;

        cnt = Math.min(arr[0], arr[3]);
        arr[0] -= cnt;
        arr[3] -= cnt;
        ans += cnt * 3;

        cnt = Math.min(arr[1], arr[2]);
        arr[1] -= cnt;
        arr[2] -= cnt;
        ans += cnt * 3;

        cnt = Math.min(arr[1], arr[3]);
        arr[1] -= cnt;
        arr[3] -= cnt;
        ans += cnt * 2;

        cnt = Math.min(arr[0], arr[2]);
        arr[0] -= cnt;
        arr[2] -= cnt;
        ans += cnt * 2;

        cnt = Math.min(arr[3], arr[2]);
        arr[3] -= cnt;
        arr[2] -= cnt;
        ans += cnt;
        
        cnt = Math.min(arr[0], arr[1]);
        arr[0] -= cnt;
        arr[1] -= cnt;
        ans += cnt;

        System.out.println(ans);
    }
}
