import java.io.*;
import java.util.*;

public class BOJ_G5_14719_빗물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int sum = 0;
        int start = 0;
        int max = 0;
        int startIdx = 0;
        int maxIdx = 0;
        int cnt = 0;
        int cur = 0;

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] capacity = new int[W + 1];
        Stack<Integer> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= W; i++){
            cur = Integer.parseInt(st.nextToken());
            if(start == 0 && cur == 0) continue;
            // 첫번째
            if(stack.isEmpty()){
                stack.push(cur);
                start = cur;
                startIdx = i;
            }else{
                int peek = stack.peek();
                if(cur < peek){
                    // 용량 추가 -> cur을 stack에 넣을 필요 없음 
                    capacity[i] = peek - cur;
                    sum += (peek - cur);
                    if(max < cur){
                        max = Math.max(max, cur);
                        maxIdx = i;
                    }
                    cnt++;
                }else{
                    // 벽 만남 -> 이번 용량은 끝 -> 원래 있던거 빼고 cur을 stack에 넣기
                    answer += sum;
                    sum = 0;
                    cnt = 0;
                    max = 0;
                    start = cur;
                    startIdx = i;
                    stack.pop();
                    stack.push(cur);
                }
            }
        }
        // System.out.println("마지막 남은 sum : " + sum);
        // 다 끝냈는데도 sum에 값이 남아있으면 용량을 재정의해줘야한다. 4001 같은 경우
        if(sum > 0){
            // System.out.println(start + " - " + max + " " + maxIdx);
            sum -= (start - max) * (cnt - (W - maxIdx));
            // System.out.println(Arrays.toString(capacity) + " " + sum);
            for(int i = W;  i > maxIdx; i--){
                sum -= capacity[i];
            }
            answer += sum;
        }
        System.out.println(answer);
    }
}
