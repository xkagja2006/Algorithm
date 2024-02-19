import java.io.*;
import java.util.*;

public class BOJ_S2_2512_예산 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        Arrays.sort(arr);

        int goal = Integer.parseInt(br.readLine());
        double diff = sum - goal;
        int divide = 1;
        int ans = 0;
        if(diff <= 0){
            ans = arr[N - 1];
        }else{
            int[] newArr = new int[N];
            while(true){
                for(int i = 0; i < N; i++){
                    newArr[i] = arr[i];
                }
                if(divide == N){
                    // ans값 업데이트하고 break
                    ans = (int)Math.floor((sum - diff) / divide);
                    break;
                }
                
                int changeSum = 0;
                // 값 바꿀 원소들의 합 구하기
                for(int i = 1; i <= divide; i++){
                    changeSum += newArr[N - i];
                }
                
                // 바꿀 원소들의 값 정하기
                int newN = (int)Math.floor((changeSum - diff) / divide);
    
                // 원소 값 바꾸기
                for(int i = 1; i <= divide; i++){
                    newArr[N - i] = newN;
                }
    
                // System.out.println(Arrays.toString(newArr));
    
                // 변하지 않은 그 다음값이랑 값 비교해서 divide 값 올릴건지 break할건지 정하기 
                if(newArr[N - divide - 1] > newArr[N - divide]){
                    // 내림차순이 성립하지 않는 경우
                    divide++;
                }else{
                    ans = newN;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
