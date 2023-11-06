
package graph;

import java.util.Stack;


public class DFSgraph {
    
    static final int v=5;
    public void dfs(int arr[][],int source)
    {
        Stack<Integer>s=new Stack<>();
        boolean isVisited[]=new boolean[v];
        
        s.push(source);
        isVisited[source]=true;
        while(!s.isEmpty())
        {
            int node=s.pop();
            System.out.println("Visited Node:"+node);
            for(int index=0;index<v;index++)
            {
                if(arr[node][index]==1 && isVisited[index]==false)
                {
                    s.push(index);
                    isVisited[index]=true;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        
        int arr[][]={
            {0,1,1,1,0},{1,0,0,1,1},
            {1,0,0,1,0},{1,1,1,0,1},
            {0,1,0,1,0}
           
                
        };
        
        DFSgraph obj=new DFSgraph();
        obj.dfs(arr,0);
    }
}
