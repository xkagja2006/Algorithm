import java.io.*;
import java.util.*;

// 우선순위 큐는 힙을 사용해서 데이터를 정렬하기 때문에 빠르다.
// https://velog.io/@gillog/Java-Priority-Queue%EC%9A%B0%EC%84%A0-%EC%88%9C%EC%9C%84-%ED%81%90

public class BOJ_S2_1927_최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(q.isEmpty())
                    System.out.println(0);
                else System.out.println(q.poll());
            }else{
                q.add(num);
            }
        }
    }
}