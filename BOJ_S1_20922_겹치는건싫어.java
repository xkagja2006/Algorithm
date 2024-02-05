import java.io.*;
import java.util.*;

public class BOJ_S1_20922_겹치는건싫어 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int startIDX = 0;
        int endIDX = 0;
        int ans = 0;
        for(int i = 0; i < N; i++){
            int cur = Integer.parseInt(st.nextToken());
            endIDX = i;
            // 중복되었는지 체크
            if(list.contains(cur)){
                // 더 중복되면 안되는 경우
                // -> 지금까지의 수열 길이를 ans와 비교한다.
                // -> 해당 숫자가 처음 나온 그 다음칸으로 시작 인덱스를 옮긴다
                if(map.get(cur) == K){
                    ans = Math.max(ans, endIDX - startIDX);
                    startIDX = list.indexOf(cur) + 1;
                }
                map.put(cur, map.get(cur) + 1);
            }else{
                map.put(cur, 1);
            }
            list.add(cur);
        }
        System.out.println(ans);
    }
}
