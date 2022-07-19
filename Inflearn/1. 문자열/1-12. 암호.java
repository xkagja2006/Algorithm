/*
 *일곱자리 이진수로 나눠 문자로 복호화
 */
package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int T = in.nextInt();
        String input1 = in.next();
        System.out.println(solution(T, input1));
    }

    static String solution(int n, String str1) {
        String answer = "";
        //7개씩 잘라야함 -> substring을 쓰는게 더 좋은 방법인것같음!!!
        //7자리 문자열에 저장해야함
        String str="";
        char ch = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i)=='#')
                str+="1";
            else
                str+="0";
            if(i%7==6){
//                System.out.println("str : " + str);
                int num = Integer.parseInt(str,2);
                ch = (char)num;
                str = "";
                answer += ch;
            }
            //새로운 문자
        }
        return answer;
    }
}