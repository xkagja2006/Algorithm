/*N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력 */
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

    static String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        int[] numArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            String reverse = "";
            for(int j = arr[i].length()-1; j >= 0; j--){
                reverse += arr[i].charAt(j);
            }
            arr[i] = reverse;
            numArr[i] = Integer.parseInt(arr[i]);
            if(numArr[i] > 2){
                for(int j = 2; j < numArr[i]; j++){
                    if(numArr[i]%j == 0){
                        numArr[i] = 0;
                        break;
                    }
                }
            }
            if(numArr[i] == 1) numArr[i] = 0;
            if(numArr[i] != 0){
                answer += numArr[i]+" ";
            }
        }
        return answer;
    }
}