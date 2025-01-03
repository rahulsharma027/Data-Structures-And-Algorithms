import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Bfs{
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int n){
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean[] vis = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        vis[1] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for(Integer it : adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        int n = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(2);
        adj.get(1).add(6);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(2);
        adj.get(4).add(2);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(5).add(7);
        adj.get(6).add(1);
        adj.get(6).add(7);
        adj.get(6).add(8);
        adj.get(7).add(5);
        adj.get(7).add(6);
        adj.get(8).add(6);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result = bfs(adj, n);

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}