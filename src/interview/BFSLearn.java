package interview;
import java.io.*;
import java.util.*;

public class BFSLearn {
    
    private static void bfs() throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        List<Integer> adj[];
        
        adj = new LinkedList[n];
        
        for(int i=0;i<n;i++){
            adj[i] = new LinkedList();
        }
        
        int t = Integer.parseInt(bf.readLine());
        
        while(t>0){
            Integer a ,b;
            
            String args[] = bf.readLine().split("\\s");
            
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            
            adj[a].add(b);
            t=t-1;
        }
        
        Integer start = 0;
        boolean visited[] = new boolean[n];
        
        LinkedList<Integer> queue = new LinkedList();
        
        queue.add(start);
        visited[start] = true;
    
        
        while(queue.size()> 0){
            
            Integer x = queue.poll();
            System.out.print(x + " ");
            
            Iterator<Integer> it =  adj[x].listIterator();
            
            while(it.hasNext()){
                int ele = it.next();
                if(!visited[ele]){
                    visited[ele] = true;
                    queue.add(ele);
                }
            }
        }
    }
    
    public static void main (String args[]) throws IOException {
    
        bfs();
    }
}