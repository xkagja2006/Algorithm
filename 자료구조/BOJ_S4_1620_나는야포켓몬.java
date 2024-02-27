import java.io.*;
import java.util.*;

public class BOJ_S4_1620_나는야포켓몬 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for(int i = 1; i <= N; i++){
            String name = br.readLine();
            map.put(i, name);
            map2.put(name, i);
        }

        for(int i = 0; i < M; i++){
            String cur = br.readLine();
            if(cur.matches(".*[0-9].*")){
                System.out.println(map.get(Integer.parseInt(cur)));
            }else{
                System.out.println(map2.get(cur));
            }
        }
    }
}