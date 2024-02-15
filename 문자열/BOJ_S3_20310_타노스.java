import java.io.*;

public class BOJ_S3_20310_타노스 {
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int one = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '0') zero++;
            else if(arr[i] == '1') one++;
        }
        
        one /= 2;
        zero /= 2;
        // 1은 앞에서부터 삭제하고 0은 뒤에서부터 삭제한다.
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '1') {
                arr[i] = 'x';
                one--;
            }
            if(one == 0) break;
        }
        for(int i = 1; i <= arr.length; i++){
            if(arr[arr.length - i] == '0') {
                arr[arr.length - i] = 'x';
                zero--;
            }
            if(zero == 0) break;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            if(c != 'x')
                sb.append(c);
        }
        System.out.println(sb.toString());
     }
}
