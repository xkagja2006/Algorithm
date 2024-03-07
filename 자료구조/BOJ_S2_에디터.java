import java.io.*;
import java.util.*;

public class BOJ_S2_에디터 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> list = new LinkedList<>();

        ArrayDeque<String> str = new ArrayDeque<>();
        ArrayDeque<String> temp = new ArrayDeque<>();

        char[] copy = br.readLine().toCharArray();
        for(int i = 0; i < copy.length; i++){
            str.push(String.valueOf(copy[i]));
        }

        int M = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        String opr = "";
        String add = "";

        for(int i = 0; i < M; i++){
            add = "";
            st = new StringTokenizer(br.readLine());
            opr = st.nextToken();
            if(opr.equals("P")){
                add = st.nextToken();
                str.push(add);
            }else if(opr.equals("L")){
                if(!str.isEmpty())
                    temp.add(str.pop());
            }else if(opr.equals("D")){
                if(!temp.isEmpty())
                    str.push(temp.pollLast());
            }else if(opr.equals("B")){
                if(!str.isEmpty())
                    str.pop();
            }
        }
        
        StringBuffer sb = new StringBuffer();
        while(!str.isEmpty()){
            sb.append(str.pollLast());
        }
        while(!temp.isEmpty()){
            sb.append(temp.pollLast());
        }
        System.out.print(sb.toString());
    }
}