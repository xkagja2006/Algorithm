import java.io.*;
import java.util.*;

public class BOJ_G4_16234_인구이동 {
    static int N;
    static int L;
    static int R;
    static int[][] map;
    static int[][] visited;
    static Queue<int[]> q = new ArrayDeque<>();
    static Set<int []> set = new HashSet<>();
    static int ans = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        visited = new int[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //i, j
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                
            }
        }
        q.add(new int[]{0, 0});
        dfs();
    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void dfs(){
        while (true) {
            // set, visited, 국가 개수, 인구수 초기화한다.
            set.clear();
            for(int i = 0; i < N; i++){
                Arrays.fill(visited, 0);
            }
            int country = 0;
            int population = 0;

            while(!q.isEmpty()){
                int x = q.peek()[0];
                int y = q.poll()[1];
    
                for(int i = 0; i < 4; i++){
                    int nx = x + dx[i]; 
                    int ny = y + dy[i]; 
                    int diff = Math.abs(map[x][y] - map[nx][ny]);
                    if(nx >= 0 && ny >= 0 && nx < N && ny < N &&
                    diff >= L && diff <= R && visited[nx][ny] == 0){
                        visited[nx][ny] = 1;
                        country++;
                        population += map[nx][ny];
                        q.add(new int[]{nx, ny});
                        set.add(new int[]{nx, ny});
                    }
                }
            }
            // 이전과 똑같은 상태면 break 시킨다.
            // 모든 원소가 같은 값이면 break 시킨다.
        }
    }
}
