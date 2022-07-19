/*
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

문자 바로 오른쪽에 반복 횟수를 표기
 */
package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }

    static String solution(String str1) {
        String answer = "";
        //시작 원소를 answer에 넣고, flag를 1로 설정하고 시작.
        //다음 원소가 현재 원소와 같다면 flag++하고 다르면 그냥 넘어가기
        int flag = 1;
        for(int i = 0; i < str1.length()-1; i++){
            char ch = str1.charAt(i);
            if(ch == str1.charAt(i+1)){
                flag++;
            }
            else{
                answer += ch;
                if(flag!=1)
                    answer += flag;
                flag = 1;
            }
        }
        answer = answer+str1.charAt(str1.length()-1);
        if(flag!=1)
            answer += flag;

        return answer;
    }
}