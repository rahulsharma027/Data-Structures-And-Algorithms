import java.util.ArrayList;

class Dfs{

    static void dfsTraversal(int node, ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayList<Integer> dfs){
        visited[node] = true;
        dfs.add(node);
        for(Integer it: adj.get(node)){
            if(visited[it] == false){
                dfsTraversal(it, adj, visited, dfs);
            }
        }
        
     
    }

    static ArrayList<Integer> dfsGraph(ArrayList<ArrayList<Integer>> adj, int n){
       boolean visited[] = new boolean[n+1];
       visited[1] = true;
       ArrayList<Integer> dfs = new ArrayList<Integer>();
       dfsTraversal(1, adj, visited, dfs);
       return dfs;
    }
   
    public static void main(String[] args) {
        int n = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(6);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(3);
        adj.get(4).add(8);
        adj.get(5).add(2);
        adj.get(6).add(2);
        adj.get(7).add(3);
        adj.get(7).add(8);
        adj.get(8).add(4);
        adj.get(8).add(7);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result = dfsGraph(adj, n);

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}