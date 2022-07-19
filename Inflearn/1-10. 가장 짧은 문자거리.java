/*
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력
 */
package com.company;
import java.sql.Array;
import java.util.*;
//문자열의 길이만큼의 배열을 만들어서
//해당 문자의 위치를 찾고
//각각 거리를 재서 더 작은 수를 넣는다.
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
    }

    static String solution(String str1, String str2) {
        String answer = "";
        String word = str1;
        char ch = str2.charAt(0);

        //ch의 갯수를 구하고 해당 위치를 배열에 입력
        int chCnt = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)==ch)
                chCnt++;
        }
//        System.out.println("chCnt : " + chCnt);
        int[] chIdx = new int[chCnt];
        int flag = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)==ch) {
                chIdx[flag] = i;
                flag++;
            }
        }
//        System.out.println("chIdx : " + Arrays.toString(chIdx));

        //word길이만큼 for문 돌려서 i랑 ch위치 차를 구하기. 더 작은 수를 배열에 저장하기

        int[] distance = new int[word.length()];
        Arrays.fill(distance,word.length());
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < chCnt; j++){
//                System.out.println(i+""+word.charAt(i) + " : " + distance[i] + "-" + chIdx[j]);
                if(distance[i] > (Math.abs(i-chIdx[j])))
                    distance[i] = (Math.abs(i-chIdx[j]));
            }
        }
//        System.out.println("distance : " + Arrays.toString(distance));
        for(int i = 0; i < distance.length; i++){
            answer += (distance[i]+" ");
        }
        return answer.trim();
    }
}