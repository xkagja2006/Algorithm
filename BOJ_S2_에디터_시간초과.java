import java.io.*;
import java.util.*;

public class BOJ_S2_에디터_시간초과 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> list = new LinkedList<>();
        char[] str = br.readLine().toCharArray();
        for(int i = 0; i < str.length; i++){
            list.add(String.valueOf(str[i]));
        }
        int M = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        String opr = "";
        String add = "";
        int idx = list.size();

        for(int i = 0; i < M; i++){
            add = "";
            st = new StringTokenizer(br.readLine());
            opr = st.nextToken();
            if(opr.equals("P")){
                add = st.nextToken();
                list.add(idx, add);
                idx++;
            }else if(opr.equals("L")){
                idx = Math.max(0, --idx);    
            }else if(opr.equals("D")){
                idx = Math.min(list.size(), ++idx);    
            }else if(opr.equals("B")){
                if(idx > 0){
                    list.remove(idx-1);
                    idx--;
                }
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(String s : list){
            sb.append(s);
        }
        System.out.print(sb.toString());
    }
}