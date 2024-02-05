import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_S5_10431_줄세우기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for(int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int ans = 0;
            LinkedList<Integer> list = new LinkedList<>();
            if(list.size() == 0) list.add(Integer.parseInt(st.nextToken()));
            for(int i = 1; i < 20; i++){
                int cur = Integer.parseInt(st.nextToken());
                for(int j = 0; j < i; j++){
                    if(cur < list.get(j)){
                        int idx = list.indexOf(list.get(j));
                        list.add(idx, cur);
                        ans += (i-j);
                        break;
                    }
                }
                if(list.size() == i) list.add(cur);
            }
            System.out.println(N + " " + ans);
        }
    }
}
