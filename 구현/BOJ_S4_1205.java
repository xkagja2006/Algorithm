import java.io.*;
import java.util.*;

public class BOJ_S4_1205 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> scores = new HashMap<>();

        if(N == 0){System.out.println("1"); return;}
        
        st = new StringTokenizer(br.readLine());

        scores.put(score, 1);
        for(int i = 0; i < N; i++){
            int cur = Integer.parseInt(st.nextToken());
            if(scores.containsKey(cur)){
                scores.put(cur, scores.get(cur) + 1);
            }else{
                scores.put(cur, 1);
            }
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(scores.entrySet());
        list.sort((o1, o2) -> o2.getKey().compareTo(o1.getKey()));
        
        int answer = -1;
        int rank = 1;
        for(Map.Entry e : list){
            if(score == (int) e.getKey()){
                answer = rank;
                rank += (int) e.getValue();
                break;
            }
            rank += (int) e.getValue();
        }

        if(rank - 1 > P) answer = -1;

        System.out.println(answer);
    }
}
