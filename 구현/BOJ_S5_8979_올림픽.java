import java.io.*;
import java.util.*;


public class BOJ_S5_8979_올림픽 {
    static class Nation implements Comparable<Nation>{
     int num;
     int gold;   
     int silver;   
     int bronze;

     @Override
     public int compareTo(Nation n){
        if(gold < n.gold) {return 1;}
        else if(gold > n.gold) {return -1;}
        else{
            if(silver < n.silver) {return 1;}
            else if(silver > n.silver) {return -1;}
            else{
                if(bronze < n.bronze) {return 1;}
                else if(bronze > n.bronze) {return -1;}
                else return 0;
            }
        }
     }


     public void sout(){
        System.out.println(this.num + " : " + this.gold + " " + this.silver + " " + 
        this.bronze);
     }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Nation[] arr = new Nation[N];
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            Nation n = new Nation();
            n.num = Integer.parseInt(st.nextToken());
            n.gold = Integer.parseInt(st.nextToken());
            n.silver = Integer.parseInt(st.nextToken());
            n.bronze = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }
        Arrays.sort(arr);

        int answer = 1;
        int same = 0;

        for(int i = 0; i < N; i++){
            if(i > 0 && arr[i].gold == arr[i-1].gold && arr[i].silver == arr[i-1].silver && arr[i].bronze == arr[i-1].bronze){
                same++;
            }else same = 0;
            if(K == arr[i].num) {
                System.out.println(answer - same);
                break;
            }
            answer++;
        }
    }
}
