import java.io.*;
import java.util.*;

public class BOJ_S4_20125_쿠키의신체측정 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1. 머리찾기 -> 심장찾기
        // 행 스캔하기
        // 2. 심장 기준으로 팔, 허리 찾기
        // 3. 허리의 끝 기준으로 다리 찾기

        char[][] map = new char[N][N];
        for(int i = 0; i < N; i++){
            map[i] = br.readLine().toCharArray();
        }

        int[] heart = new int[2];
        Loop1 : 
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == '*'){
                    heart[0] = i + 1;
                    heart[1] = j;
                    break Loop1;
                }
            }
        }

        // 왼쪽 팔 길이 구하기
        int leftArm = 0;
        for(int i = heart[1] - 1; i >= 0; i--){
            if(map[heart[0]][i] == '_'){
                break;
            }
            leftArm++;
        }
        // 오른쪽 팔 길이 구하기
        int rightArm = 0;
        for(int i = heart[1] + 1; i < N; i++){
            if(map[heart[0]][i] == '_'){
                break;
            }
            rightArm++;
        }
        // 허리 길이 구하기
        int waist = 0;
        for(int i = heart[0] + 1; i < N; i++){
            if(map[i][heart[1]] == '_'){
                break;
            }
            waist++;
        }
        // 왼쪽 다리 길이 구하기
        int leftLeg = 0;
        for(int i = heart[0] + waist + 1; i < N; i++){
            if(map[i][heart[1] - 1] == '_'){
                break;
            }
            leftLeg++;
        }
        // 오른쪽 다리 길이 구하기
        int rightLeg = 0;
        for(int i = heart[0] + waist + 1; i < N; i++){
            if(map[i][heart[1] + 1] == '_'){
                break;
            }
            rightLeg++;
        }
        System.out.println((heart[0] + 1)+ " " + (heart[1] + 1));
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}