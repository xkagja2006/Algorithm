import java.io.*;
import java.util.*;

public class BOJ_S3_21921_블로그 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String G = st.nextToken();

        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }
        
        int ans = 0;
        if(G.equals("Y")){
            ans = set.size();
        }else if(G.equals("F")){
            ans = set.size()/2;
        }else{
            ans = set.size()/3;
        }

        System.out.println(ans);
    }
}
