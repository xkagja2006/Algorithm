import java.io.*;
import java.util.*;

public class BOJ_S4_수찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int ans = 0;
        for(int i = 0; i < M; i++){
            ans = 0;
            if(set.contains(Integer.parseInt(st.nextToken()))){
                ans = 1;
            }
            System.out.println(ans);
        }
    }
}