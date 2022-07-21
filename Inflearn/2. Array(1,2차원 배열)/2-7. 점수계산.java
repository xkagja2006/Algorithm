package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String x = in.nextLine();
        String str = in.nextLine();
        System.out.println(solution(str));
    }

    static int solution(String str) {
        int answer = 0;
        int plus = 0;
        String ch = "f";
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("1")){  //득점
                plus++;
                if(ch.equals("f")){ //연속 득점이 아닐 경우
                    answer++;
                }
                else{    //연속 득점일 경우
                    answer += plus;
                }
                ch = "t";
            }
            else{   //틀림
                plus = 0;
                ch = "f";
            }
        }
        return answer;
    }
}