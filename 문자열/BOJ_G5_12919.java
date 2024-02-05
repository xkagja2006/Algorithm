

import java.io.*;
public class BOJ_G5_12919 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();

        change(S, T);
        System.out.println(answer);
    }

    static int answer = 0;
    static void change(String S, String T){
        if(answer == 1) return;
        
        if(S.length() > T.length()) return;
        
        else if(S.length() == T.length()){
            if(S.equals(T)){
                answer = 1;
                return;
            }
            return;
        }

        String newT;
        if(T.charAt(T.length()-1) == 'A'){
            newT = T.substring(0, T.length()-1);
            change(S, newT);
        }
        if(T.charAt(0) == 'B'){
            StringBuffer sb = new StringBuffer(T.substring(1, T.length()));
            newT = sb.reverse().toString();
            change(S, newT);
        }
    }
}
