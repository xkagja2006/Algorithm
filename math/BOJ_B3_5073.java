package math;

import java.io.*;
import java.util.*;

public class BOJ_B3_5073 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] tri = new int[3];
            tri[0] = Integer.parseInt(st.nextToken());
            tri[1] = Integer.parseInt(st.nextToken());
            tri[2] = Integer.parseInt(st.nextToken());
            if(tri[0] + tri[1] + tri[2] == 0) break;
            Arrays.sort(tri);

            if(tri[2] >= tri[1] + tri[0]) System.out.println("Invalid");
            else if(tri[0] == tri[1] || tri[1] == tri[2]){
                if(tri[0] == tri[1] && tri[1] == tri[2]) System.out.println("Equilateral");
                else System.out.println("Isosceles");
            } 
            else System.out.println("Scalene");
        }
    }
}
