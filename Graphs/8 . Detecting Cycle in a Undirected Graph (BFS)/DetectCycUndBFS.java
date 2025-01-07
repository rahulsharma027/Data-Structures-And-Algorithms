import java.util.*;
class Pair{
    int first, second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class DetectCycUndBFS{
    static boolean isCyclicUtil(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adjList){
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(i, -1));
        visited[i] = true;
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for(int adjNode : adjList.get(node)){
                if(!visited[adjNode]){
                    visited[adjNode] = true;
                    q.add(new Pair(adjNode, node));
                }
                else if(parent != adjNode){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[v+1];
        for(int i = 0; i <= v; i++){
            if(!visited[i]){
                if(isCyclicUtil(i, visited, adjList)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 9;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= v; i++){
            adjList.add(new ArrayList<Integer>());
        }
        adjList.get(1).add(2);
        adjList.get(1).add(5);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(2);
        adjList.get(3).add(4);
        adjList.get(4).add(3);
        adjList.get(4).add(8);
        adjList.get(5).add(1);
        adjList.get(5).add(6);
        adjList.get(6).add(5);
        adjList.get(6).add(7);
        adjList.get(6).add(9);
        adjList.get(7).add(6);
        adjList.get(7).add(8);
        adjList.get(8).add(4);
        adjList.get(8).add(7);
        adjList.get(9).add(6);

        System.out.println(isCyclic(v, adjList));

    }
}