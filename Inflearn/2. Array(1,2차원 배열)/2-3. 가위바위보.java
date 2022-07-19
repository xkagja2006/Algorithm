/*
 * 1:가위 2:바위 3:보
 */
package com.company;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int T = in.nextInt();
        String x = in.nextLine();
        String a = in.nextLine();
        String b = in.nextLine();
        String[] arrA = a.split(" ");
        String[] arrB = b.split(" ");
        String[] winner = new String[T];
        for(int i = 0; i < T; i++){
            int aa = Integer.parseInt(arrA[i]);
            int bb = Integer.parseInt(arrB[i]);
            if(Math.abs(aa-bb)==1){
                if(aa > bb) winner[i] = "A";
                else winner[i] = "B";
            }
            else if(Math.abs(aa-bb)==2){
                if(aa > bb) winner[i] = "B";
                else winner[i] = "A";
            }
            else winner[i] = "D";
            System.out.println(winner[i]);
        }
//        System.out.println(Arrays.toString(winner));
    }
}