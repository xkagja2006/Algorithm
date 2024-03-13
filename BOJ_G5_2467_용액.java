import java.io.*;
import java.util.*;

public class BOJ_G5_2467_용액 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = Integer.MAX_VALUE;
        int temp = 0;
        int start = 0;
        int end = N-1;
        int[] answer = new int[2];

        // sum < 0 이면 start++, sum > 0 이먄 end--
        while(true){
            temp = arr[start] + arr[end];
            if(sum > Math.abs(temp)){
                answer[0] = arr[start];
                answer[1] = arr[end];
                sum = Math.abs(temp);
            }
            if(temp < 0){
                start++;
            }else if(temp > 0){
                end--;
            }
            else{
                System.out.println(arr[start] + " " + arr[end]);
                break;
            }
            if(start == end){
                System.out.println(answer[0] + " " + answer[1]);
                break;
            }
        }
    }
}