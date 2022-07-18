/*
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 */
package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }

    static Integer solution(String str) {
        int answer = 0;
        str = str.replaceAll("[a-zA-Z]","");
        answer = Integer.parseInt(str);
        return answer;
    }
}