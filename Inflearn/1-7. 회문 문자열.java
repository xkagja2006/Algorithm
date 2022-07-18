/*회문 문자열인지 판단 */
package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }

    static String solution(String str) {
        str = str.toLowerCase();
        String answer = "YES";
        int len = (str.length()+1)/2;
//        System.out.println(len);
        for(int i = 0; i < len; i++){
            if(!(str.charAt(i)==str.charAt(str.length()-1-i)))
                answer = "NO";
        }
        return answer;
    }
}