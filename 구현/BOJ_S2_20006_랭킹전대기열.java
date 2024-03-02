import java.io.*;
import java.util.*;

public class BOJ_S2_20006_랭킹전대기열 {
    static int P;
    static int M;

    public static class Room{
        boolean state = false;
        int people = 0;
        int standard = 0;
        Map<String, Integer> map = new HashMap<>();
 
        public void addUser(String n, int l){
            this.people += 1;
            this.map.put(n, l);
            if(this.people == M) 
                this.state = true;
        }

        @Override
        public String toString() {
            List<String> keySet = new ArrayList<>(this.map.keySet());
            Collections.sort(keySet);

            StringBuilder sb = new StringBuilder();
            sb.append((!state? "Waiting!" : "Started!") + " \n");

            for (String key : keySet) {
                sb.append(map.get(key) + " " + key + "\n");
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        P = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 가능한 빈 방을 미리 만들어둔다
        Room[] rooms = new Room[P];
        for(int i = 0; i < P; i++){
            rooms[i] = new Room();
        }

        int level = 0;
        String nickname = "";
        for(int i = 0; i < P; i++){
            st = new StringTokenizer(br.readLine());
            level = Integer.parseInt(st.nextToken());
            nickname = st.nextToken();

            // 들어갈 수 있는 방이 있으면 들어가고 아니면 새로 만든다
            for(int j = 0; j < rooms.length; j++){
                if(rooms[j].people > 0 && rooms[j].people < M && Math.abs(rooms[j].standard - level) <= 10){
                    // 사람이 있고 들어갈 수 있는 방 -> 인원수, 레벨체크
                    rooms[j].addUser(nickname, level);
                    break;
                }else if(rooms[j].people == 0){
                    // 새로운 방 개설
                    rooms[j].addUser(nickname, level);
                    rooms[j].standard = level;
                    break;
                } 
            }
        }
        for(Room r : rooms){
            if(r.people > 0)
                System.out.print(r);
        }
    }
}