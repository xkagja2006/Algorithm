
import java.io.*;
import java.util.*;

public class BOJ_S2_22233 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());
        
        Set<String> Memo = new HashSet<>();
        Set<String> Wrote = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            Memo.add(br.readLine());
        }
        for(int i = 0; i < cnt; i++){
            st = new StringTokenizer(br.readLine(),",");
            while(st.hasMoreTokens()){
              Wrote.add(st.nextToken());
            }
            for(String x : Wrote){
            if(Memo.contains(x)){
                Memo.remove(x);
             }
        }
        sb.append(Memo.size()+"");
        Wrote.clear();
        }
        System.out.println(sb);
    }
}
