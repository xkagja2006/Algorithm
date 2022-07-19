/* 
4. 단어 뒤집기

N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

*/

package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            String input = in.next();
            System.out.println(reverse(input));
        }
    }

    static String reverse(String str){
        String reversed="";
        String arr[];
        arr = str.split("");
        for(int i = str.length()-1; i >= 0; i--){
            reversed += arr[i];
        }
//        System.out.println(reversed);
        return reversed;
    }
}