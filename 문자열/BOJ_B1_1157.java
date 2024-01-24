import java.io.*;
import java.util.*;

public class BOJ_B1_1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> ch = new HashMap<>();

        char[] c = br.readLine().toUpperCase().toCharArray();

        for(int i = 0; i < c.length; i++){
            if(ch.containsKey(c[i])){
                int cnt = ch.get(c[i]);
                ch.put(c[i], cnt+1);
            }
            else{
                ch.put(c[i], 1);
            }
        }

        if(ch.size() == 1) System.out.println(c[0]);
        else{
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(ch.entrySet());
            list.sort((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

            if(list.get(0).getValue().equals(list.get(1).getValue())){
                System.out.println("?");
            }else{
                System.out.println(list.get(0).getKey());
            }
        }
    }
}