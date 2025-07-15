class Solution {
    int ma=0;

    public boolean check(int[][] grid,int i,int j,int[][]visited){
        int r=grid.length;
        int c=grid[0].length;
        if(i>=0 && i<r && j>=0 && j<c && grid[i][j]==1 && visited[i][j]==0){
            return true;
        }
        return false;
    }

    public void dfs(int[][] grid,int[][]visited,Queue<List<Integer>>q,int i,int j){
        int x[]={1,-1,0,0};
        int y[]={0,0,1,-1};
        int co=0;

        while(q.size()!=0){
            List<Integer>ele=new ArrayList<>();
            ele=q.poll();
            co+=1;

            for(int p=0;p<4;p++){

                if(check(grid,ele.get(0)+x[p],ele.get(1)+y[p],visited)){
                    List<Integer>el=new ArrayList<>();
                    visited[ele.get(0)+x[p]][ele.get(1)+y[p]]=1;
                    el.add(ele.get(0)+x[p]);
                    el.add(ele.get(1)+y[p]);
                    q.add(el);
                }

            }
            
        }
        ma=Math.max(ma,co);


    }
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;

        int[][]visited=new int[r][c];
        Queue<List<Integer>>q=new LinkedList<>();
        
        int res=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    List<Integer>ele=new ArrayList<>();
                    ele.add(i);
                    ele.add(j);
                    q.add(ele);
                    visited[i][j]=1;
                    dfs(grid,visited,q,i,j);
                    grid[i][j]=0;
                        res+=1;
                    
                }
                
            }
        }
        return ma;
        
    }
}