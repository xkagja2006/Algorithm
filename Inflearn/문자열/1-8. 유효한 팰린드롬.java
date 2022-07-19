/*
 * 7번과 같은 문제. scanner의 input을 next로 받는지, nextLine으로 한 줄 모두 받는지만 달랐다.
 */
package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }

    static String solution(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z]","");
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