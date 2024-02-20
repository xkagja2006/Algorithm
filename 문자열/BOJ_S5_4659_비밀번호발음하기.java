import java.io.*;

public class BOJ_S5_4659_비밀번호발음하기 {
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word;
        while(true){
            word = br.readLine();
            if(word.equals("end")) break;

            if(!word.matches(".*[a,e,i,o,u].*")){
                System.out.println( "<" + word + ">"+ " is not acceptable.");
                continue;
            }

            if (word.matches(".*(a|e|i|o|u){3,}.*") | word.matches(".*(b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z){3,}.*")) {
                // 문자열에 3번 이상 연속으로 나오는 자음,모음이 있는 경우 처리
                System.out.println( "<" + word + ">"+ " is not acceptable.");
                continue;
            }
            // eee, ooo 찾기
            if(word.matches(".*(a{3,}|o{3,}).*")){
                System.out.println( "<" + word + ">"+ " is not acceptable.");
                continue;
            }
            // 같은 문자가 연속 2번 오는 경우 처리
            if(word.matches(".*(.)\\1.*")) {
                if(word.matches(".*(e|o)\\1.*")){
                    System.out.println( "<" + word + ">"+ " is acceptable.");
                    continue;
                }else{
                    System.out.println( "<" + word + ">"+ " is not acceptable.");
                    continue;
                }
            }
            System.out.println( "<" + word + ">"+ " is acceptable.");
            continue;
        }
     }
}
