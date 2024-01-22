import java.util.*;
import java.io.*;

public class BOJ_S1_1446 {
    static class ShortCut{
        int start;
        int end;
        int length;

        public ShortCut(int start, int end, int length){
            this.start = start;
            this.end = end;
            this. length = length;
        }
        public void print(){
            System.out.println(this.start + ", " + this.end + ", " + this.length);
        }
    } 

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        List<ShortCut> shortCuts = new ArrayList<>();

        // 지름길 리스트 만들기
        // 1. 지름길의 도착지가 최종 목적지를 지나칠때는 제외
        // 2. 지름길이 더 돌아갈때는 제외
        for(int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            if(end - start <= length) continue;
            if(end > D) continue;

            ShortCut s = new ShortCut(start, end, length);
            shortCuts.add(s);
        }

        // 지름길 리스트 정렬
        shortCuts.sort((o1, o2) -> {
            if(o1.start == o2.start)
                return Integer.compare(o1.end, o2.end);
            else
                return Integer.compare(o1.start, o2.start);
        });
        
        // 최종 정답은 dp[D]가 된다!
        int now = 0;
        int idx = 0;
        int dp[] = new int[D + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[now] = 0;
        while(now < D){
            // 현재 위치에서 지름길로 갈 수 있는 경우
            // 지름길로 가는것과 안가는것 중 더 빠른것을 dp에 저장.
            // 현재 위치에서 지름길이 없는경우 -> 그냥 움직임
            if(idx < shortCuts.size()){
                ShortCut s = shortCuts.get(idx);
                if(now == s.start){
                    dp[s.end] = Math.min(dp[now] + s.length, dp[s.end]);
                    idx++;
                }
                else{
                    dp[now + 1] = Math.min(dp[now] + 1, dp[now + 1]);
                    now++;
                }
            }else{
                dp[now + 1] = Math.min(dp[now] + 1, dp[now + 1]);
                now++;
            }
        }
        System.out.println(dp[D]);
    }
}