/*
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력
 * 
 */
import java.util.*;
//문자부분을 숫자나 null로 치환하면 좋을것같음
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        System.out.println(reverse(input));
    }

    static String reverse(String str){
        String reversed="";
        String str2 = str;  //특수문자 제거한 문자열
        str2 = str2.replaceAll("[^a-zA-Z]","");
        //System.out.println("str2 : " + str2);
        String[] arr2 = str2.split("");

        String[] arr = str.split("");   //알파벳 제거할 문자열 배열
        /* 향상된 for문으로 배열의 원소 접근 시 직접참조를 하지 않는것으로 보인다!
           for(String x : arr){
            x = x.replaceAll("[a-zA-Z]","");
            System.out.println("x : " + x);
        }
        */
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].replaceAll("[a-zA-Z]","");
        }

        int cnt = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("")){
                arr[i] = arr2[arr2.length-cnt];
                cnt++;
            }
        }

        String answer="";
        for(String x : arr){
            answer += x;
        }
        return answer;
    }
}