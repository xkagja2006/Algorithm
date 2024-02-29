import java.io.*;
import java.util.*;

public class BOJ_S2_2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> q = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n ; i++){
            q.add(i);
        };

        int ans = 0;

        while(true){
            ans = q.poll();
            if(q.isEmpty()) break;
            int move = q.poll();
            ans = move;
            q.addLast(move);
        }

        System.out.println(ans);
    }
}