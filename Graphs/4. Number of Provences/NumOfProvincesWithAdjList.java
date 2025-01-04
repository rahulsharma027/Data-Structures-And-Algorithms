import java.util.ArrayList;

class NumOfProvincesWithAdjList{
    static void dfs(ArrayList<ArrayList<Integer>> adjList,int[] visited, int i){
        visited[i] = 1;
        for(Integer it : adjList.get(i)){
            if(visited[it] == 0){
                dfs(adjList, visited, it);
            }
        }
    }

    static int findProNum(int[][] isConnected){

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<isConnected.length; i++){
            adjList.add(new ArrayList<Integer>());
        }
        for(int i = 0; i< isConnected.length; i++){
            for(int j = 0; j<isConnected[0].length; j++){
                if(isConnected[i][j] == 1 && i!=j){
                    adjList.get(i).add(j);
                }
            }
        }

        int[] visited = new int[isConnected.length];
        int provinces = 0;
        for(int i=0; i<isConnected.length; i++){
            if(visited[i] == 0){
                dfs(adjList, visited, i);
                provinces++;
            }
        }
        return provinces;
    }
    public static void main(String[] args) {
        int[][] isConnected = {
            {1,1,0},
            {1,1,0},
            {0,0,1}
        };
        System.out.println(findProNum(isConnected));
    }
}