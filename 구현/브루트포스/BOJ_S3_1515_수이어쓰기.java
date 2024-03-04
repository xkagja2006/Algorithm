package 브루트포스;

import java.io.*;
import java.util.*;

public class BOJ_S3_1515_수이어쓰기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int base = 1;
        int pointer = 0;
        
        while(true){
            char[] b = String.valueOf(base).toCharArray();
            for(int i = 0; i < b.length; i++){
                if(b[i] - '0' == (arr[pointer] - '0')){
                    pointer++;
                }
                if(pointer == arr.length) break;
            }
            if(pointer == arr.length) break;
            base++;
        }
        System.out.println(base);
    }
}