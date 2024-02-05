

import java.io.*;
import java.util.*;

public class BOJ_S5_11723 {
    static Set<Integer> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0;i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String func = st.nextToken();
            if(func.equals("add")) add(Integer.parseInt(st.nextToken()));
            if(func.equals("remove")) remove(Integer.parseInt(st.nextToken()));
            if(func.equals("check")) check(Integer.parseInt(st.nextToken()));
            if(func.equals("toggle")) toggle(Integer.parseInt(st.nextToken()));
            if(func.equals("all")) all();
            if(func.equals("empty")) empty();
        }
        System.out.print(sb.toString());
    }

    public static void add(int num){
        set.add(num);
    }
    public static void remove(int num){
        if(set.contains(num)) set.remove(num);
    }
    public static void check(int num){
        if(set.contains(num)){
            sb.append(1 + "\n");
        }else{
            sb.append(0 + "\n");
        }
    }
    public static void toggle(int num){
        if(set.contains(num)){
            set.remove(num);
        }else{
            set.add(num);
        } 
    }
    public static void all(){
        set.clear();
        for(int i = 1; i < 21; i++){
            set.add(i);
        }
    }
    public static void empty(){
        set.clear();
    }
}
