package 자료구조;

import java.util.*;
import java.io.*;

public class BOJ_S3_20920 {
    public static void main(String[] args) throws IOException{
        Map<String, Integer> words = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int T = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        for(int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            String w = st.nextToken();
            if(w.length() < L) continue;
            if(words.containsKey(w)){
                words.put(w, words.get(w)+1);
            }
            else{
                words.put(w, 1);
            }
        }
        
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(words.entrySet());
        entryList.sort((o1, o2) -> {
            // 1. 자주 나온 단어 순 정렬
            if(o1.getValue() < o2.getValue()) return 1;
            else if(o1.getValue() > o2.getValue()) return -1;
            
            // 2. 해당 단어 길이 순으로 정렬
            if(o1.getKey().length() < o2.getKey().length()) return 1;
            else if(o1.getKey().length() > o2.getKey().length()) return -1;

            // 3. 알파벳 사전순으로 정렬
            return o1.getKey().compareTo(o2.getKey());
        });
        
        // // 1. 알파벳 사전순으로 정렬
        // entryList.sort((o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        
        // // 2. 해당 단어 길이 순으로 정렬(내림차순)
        // entryList.sort((o1, o2) -> (Integer.compare(o2.getKey().length(), o1.getKey().length())));
        
        // // 3. 자주 나오는 단어 순으로 정렬(내림차순)
        // entryList.sort((o1, o2) -> (o2.getValue().compareTo(o1.getValue())));

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> e : entryList){
            sb.append(e.getKey()).append("\n");
        }
        System.out.print(sb);
    }
}
