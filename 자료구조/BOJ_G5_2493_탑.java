import java.io.*;
import java.util.*;

public class BOJ_G5_2493_탑 {
    public static class Tower{
        int num;
        int height;

        Tower(int n, int h){
            this.num = n;
            this.height = h;
        }

        @Override
        public String toString() {
            return this.num + " " + this.height;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Tower> towers = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            int h = Integer.parseInt(st.nextToken());
            if(towers.isEmpty()){
                sb.append(0 + " ");
                towers.push(new Tower(i + 1, h));
            }else{
                while(true){
                    if(towers.isEmpty()){
                        sb.append(0 + " ");
                        towers.push(new Tower(i + 1, h));
                        break;
                    }
                    int next = towers.peek().height;
                    if(h >= next){
                        towers.pop();
                    }else{
                        sb.append(towers.peek().num + " ");
                        towers.push(new Tower(i + 1, h));
                        break;
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}
