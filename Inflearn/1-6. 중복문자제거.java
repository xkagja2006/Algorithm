/*
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력.

 원래 문자열의 순서를 유지.
 */
package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }

    static String solution(String str) {
        String answer = "";
        String[] arr = str.split("");
        for(String x : arr){
            if(!answer.contains(x))
                answer += x;
        }
        return answer;
    }
}